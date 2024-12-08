import java.util.Arrays;
public class test2 {
    public static void main(String[] args){
        String[][] arr = new String[10][16];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 16; j++){
                double x = (double) (Math.random() * 10);
                String str = String.format("%.2e ", x);
                arr[i][j] = str;
                //System.out.println(arr[i][j]);
            }
        }
        for (int i = 0; i < 10; i++){
                System.out.println(Arrays.toString(arr[i]));
                System.err.println("/n");
        }
    }
}
