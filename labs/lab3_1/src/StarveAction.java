import java.util.Random;

public class StarveAction extends Action{
        @Override
        public Actions GetAction()
        {
            return Actions.STARVE;
        }

        public String DoAction()
        {
            Random rand = new Random();
            int n = rand.nextInt(3);
            return switch (n) {
                case 0 -> ", но совсем небольшой, так что всё прошло гладко";
                case 1 -> ", он не стерпел и ударил слугу";
                case 2 -> "очень сильный и перебил половину населения";
                default -> "никуда не едет";
            };

        }

        public Integer Food_count() {
            Random rand = new Random();
            return rand.nextInt(3, 10); // Расход еды от 3 до 10
        }
}
