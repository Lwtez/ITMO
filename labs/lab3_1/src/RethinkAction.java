public class RethinkAction extends Action{
    @Override
    public Actions GetAction()
    {
        return Actions.RETHINK;
    }

    public String DoAction()
    {
        return "и понял, что пора начать разрабатывать новую идею принимания пищи";
    }
}
