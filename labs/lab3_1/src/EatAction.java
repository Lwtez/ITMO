import java.util.Random;
public class EatAction extends Action {
    @Override
    public Actions GetAction()
    {
        return Actions.EAT;
    }

    public String DoAction()
    {
        Random rand = new Random();
        int n = rand.nextInt(3);
        return switch (n) {
            case 0 -> "уплетать жаренную курицу";
            case 1 -> "похлёбывать суп";
            case 2 -> "есть торт";
            default -> "голодать, потому что еды нет";
        };
    }
    public Integer Food_count() {
        Random rand = new Random();
        return rand.nextInt(3, 7); // Пополнение еды на случайное значение от 5 до 7
    }

}

