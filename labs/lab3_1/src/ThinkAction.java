import java.util.Random;

public class ThinkAction extends Action{
    @Override
    public Actions GetAction()
    {
        return Actions.THINK;
    }

    public String DoAction()
    {
        Random rand = new Random();
        int n = rand.nextInt(3);
        int m = rand.nextInt(5, 40);
        return switch (n) {
            case 0 -> "отослать " + m + " куриц";
            case 1 -> "отослать " + m + " мешков картошки для супа";
            case 2 -> "отослать " + m + " тортов";
            default -> "ничего не отсылать";
        };
    }
}
