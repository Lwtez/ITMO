import java.util.Random;

public class SendAction extends Action {
    @Override
    public Actions GetAction()
    {
        return Actions.SEND;
    }

    public String DoAction()
    {
        Random rand = new Random();
        int n = rand.nextInt(3);
        return switch (n) {
            case 0 -> " половину надуманного";
            case 1 -> " всё, что они надумали";
            case 2 -> " лишь треть от надуманного";
            default -> " ничего не отсылают";
        };
    }
}
