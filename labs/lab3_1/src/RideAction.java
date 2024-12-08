import java.util.Random;

public class RideAction extends Action {
    @Override
    public Actions GetAction()
    {
        return Actions.RIDE;
    }

    public String DoAction()
    {
        Random rand = new Random();
        int n = rand.nextInt(3);
        return switch (n) {
            case 0 -> "с самой разнообразной снедью";
            case 1 -> ", но на них нападают разбойники и они теряют половину";
            case 2 -> "собирать ещё, так как такого количества недостаточно";
            default -> "никуда не едет";
        };

    }
}
