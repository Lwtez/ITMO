public class Baron extends Characters{

    public Baron(String name, IWriter wrt){
        Name = name;
        Writer = wrt;
    }

    @Override
    public void WriteAction(IAction act){
        Actions actions = act.GetAction();
        String str = act.DoAction();

        switch (actions){
            case SLEEP:
                Writer.Write(Name + " " + str);
                break;
            case EAT:
                Writer.Write(Name + " начинает " + str);
                break;
            case RETHINK:
                Writer.Write(Name + " передумал " + str);
                break;
            case SAY:
                Writer.Write(Name + " саказал себе: " + str);
                break;
            case STARVE:
                Writer.Write(Name + " чувствует голод " + str);
                break;
        }
    }
}
