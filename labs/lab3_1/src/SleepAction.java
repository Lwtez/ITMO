import java.util.Random;
public class SleepAction extends Action {
    @Override
    public Actions GetAction()
    {
        return Actions.SLEEP;
    }

    public String DoAction()
    {
        Random rand = new Random();
        int n = rand.nextInt(5, 16);
        return "заснул в 21:00 и cпит уже " + n + " часов, после чего проснулся голодным";
    }
}
