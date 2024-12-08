public class test {
    public static void main(String[] args){
        while (true) { 
            double a = -7 + (Math.random() * 19);
            if ((a > 10) || (a < -6)) {
                String str = String.format("Число - %.2f ", a);
                System.out.println(str);
                break;
            } 
        }

    }
}
