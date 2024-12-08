public class Oboz extends Characters{
    public Oboz(String name, IWriter writer){
        Name = name;
        Writer = writer;
    }

    @Override
    public void WriteAction(IAction act) {
        Actions action = act.GetAction();
        String str = act.DoAction();
        switch (action)
        {
            case RIDE:
                Writer.Write(Name + " едет " + str);
                break;
            case LOSE:
                Writer.Write(Name + " теряет " + str);

        }
    }
}
