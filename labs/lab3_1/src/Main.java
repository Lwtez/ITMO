import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        // Создаем объекты
        Writer writer = new Writer();
        Baron baron = new Baron("Апельсин", writer);
        Oboz oboz = new Oboz("Обоз", writer);
        Folk folk = new Folk("Народ", writer);

        // Количество еды (используем AtomicInteger для изменения значения)
        Random rand = new Random();
        AtomicInteger foodCount = new AtomicInteger(rand.nextInt(15, 16));  // Инициализируем AtomicInteger

        // Список действий
        ArrayList<IAction> baron_actions = new ArrayList<>();
        ArrayList<IAction> folk_actions = new ArrayList<>();
        ArrayList<IAction> oboz_actions = new ArrayList<>();

        // Добавляем действия в список
        baron_actions.add(new SleepAction());
        baron_actions.add(new StarveAction());
        baron_actions.add(new EatAction());
        baron_actions.add(new RethinkAction());
        baron_actions.add(new StarveAction());
        baron_actions.add(new EatAction());
        baron_actions.add(new SayAction());
        baron_actions.add(new StarveAction());
        baron_actions.add(new EatAction());
        folk_actions.add(new ThinkAction());
        folk_actions.add(new SendAction());
        oboz_actions.add(new RideAction());

        // Таймер
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int baron_index = 0; // Индекс текущего действия
            int folk_index = 0;
            int oboz_index = 0;

            @Override
            public void run() {
                try {
                    if (baron_index < baron_actions.size()) {
                        // Получаем текущее действие
                        IAction currentAction = baron_actions.get(baron_index);

                        // Выполнение действия
                        baron.WriteAction(currentAction);

                        // Проверка типа действия
                        if (currentAction.GetAction() == Actions.EAT) {
                            int foodGain = currentAction.Food_count(); // Получаем значение еды
                            foodCount.addAndGet(foodGain); // Пополняем еду
                            System.out.println("Барон ест: + " + foodGain + ", текущий запас еды: " + foodCount.get());
                        } else if (currentAction.GetAction() == Actions.STARVE) {
                            int foodLoss = currentAction.Food_count();
                            foodCount.addAndGet(-foodLoss); // Уменьшаем еду
                            System.out.println("Барон голодает: - " + foodLoss + ", текущий запас еды: " + foodCount.get());
                        }

                        baron_index++;

                        // Проверка уровня еды
                        if (foodCount.get() <= 0) {
                            throw new CheckedException(foodCount.get());
                        }
                    } else if (folk_index < folk_actions.size()) {
                        IAction currentAction = folk_actions.get(folk_index);
                        folk.WriteAction(currentAction);
                        folk_index++;
                    } else if (oboz_index < oboz_actions.size()) {
                        IAction currentAction = oboz_actions.get(oboz_index);
                        oboz.WriteAction(currentAction);
                        oboz_index++;
                    } else {
                        timer.cancel();
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    timer.cancel();
                    System.exit(1);
                }
            }
        };

        // Запуск таймера с интервалом 1 секунда
        timer.schedule(task, 0, 1000);
    }
}

