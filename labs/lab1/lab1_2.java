public class lab1_2 {
    public static void main(String[] args){
        long[] r = new long[10];
        for (int i = 0, el = 22; i < 10; i++, el-=2){
            r[i] = el;
            //System.out.println(r[i]);
        }
        double[] x = new double[16];
        for (int i = 0; i < 16; i++){
            x[i] = -7 + (Math.random() * 19);
            //System.out.println(x[i]);
        }
        String[][] f = new String[10][16];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 16; j++){
                double x1 = x[j];
                if (r[i] == 8) {
                    double result = Math.pow(Math.E, Math.pow((Math.PI - Math.pow((x1*(3+x1)), 3)), 3));
                    String str = String.format("%.2f ", result);
                    f[i][j] = str;
                    //System.out.println(str);
                }
                else if ((r[i] == 4) || (r[i] == 12) || (r[i] == 14) || (r[i] == 18) || (r[i] == 20)){
                    double result = Math.pow( ((Math.pow( (2 * Math.atan((x1+2.5)/19)) , (Math.tan(x1)))) / 2) , (Math.sin(Math.pow((x1 / 4), (x1)))) );
                    String str = String.format("%.2f ", result);
                    f[i][j] = str;
                    //System.out.println(str);
                }
                else {
                    double result = Math.pow((Math.pow(((Math.pow(((1 - (Math.pow(x1, (4*(x1+1))))) /2), 3)) /2), (2))), (double)1/3);
                    String str = String.format("%.2f ", result);
                    f[i][j] = str;
                    //System.out.println(str);
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            //System.out.println(Arrays.toString(f[i]));
            //System.err.println("/n");
        }
    }
}
