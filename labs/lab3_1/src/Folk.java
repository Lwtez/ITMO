public class Folk extends Characters{
    public Folk(String name, IWriter writer){
        Name = name;
        Writer = writer;
    }


    @Override
    public void WriteAction(IAction act) {
        Actions action = act.GetAction();
        String str = act.DoAction();
        switch (action)
        {
            case THINK:
                Writer.Write(Name + " думает над тем, что бы " + str );
                break;
            case SEND:
                Writer.Write(Name + " отсылают" + str);
                break;
        }
    }
}
