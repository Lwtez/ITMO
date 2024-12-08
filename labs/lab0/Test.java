
public class Test{
    public static void greed(String name) {
        System.out.println("Привет, " + name + "!");
    }
    public static void main(String[] args) {
        if (args.length > 0){
            for (String s : args) {
                greed(s);
            }
        } else {
            greed("mir");
        }
    }
}