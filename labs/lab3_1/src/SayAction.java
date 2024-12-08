public class SayAction extends Action {
    @Override
    public Actions GetAction()
    {
        return Actions.SAY;
    }

    public String DoAction()
    {
        return "\"Спать -- это только время терять: ведь когда я сплю, я не могу есть!\"";
    }
}
