public class Lab1 {
    public static double exp1(double x1){
        double result = Math.pow(Math.E, Math.pow((Math.PI - Math.pow((x1*(3+x1)), 3)), 3)); // первое вычисление для двумерного массива
        return result;
    }
    public static double exp2(double x1){
        double result = Math.pow( ((Math.pow( (2 * Math.atan((x1+2.5)/19)) , (Math.tan(x1)))) / 2) , (Math.sin(Math.pow((x1 / 4), (x1)))) ); // второе вычисление для двумерного массива
        return result;
    }
    public static double exp3(double x1){
        double result = Math.pow((Math.pow(((Math.pow(((1 - (Math.pow(x1, (4*(x1+1))))) /2), 3)) /2), (2))), (double)1/3); // третье вычисление для двумерного массива
        return result;
    }
    public static void printMatrix(double[][] matrx){
        for (int i = 0; i < 10; i++){
            for (int j =0; j < 16; j++){ // форматированный вывод
                if ( matrx[i][j] > 10000 || matrx[i][j] < 0.0001 ) {
                    System.out.printf("%9.2e |", matrx[i][j]);
                }
                else {
                    System.out.printf("%9.2f |", matrx[i][j]); 
                }
                //System.out.printf("%9.2e |", matrx[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        long[] r = new long[10]; // создание и заполение первого массива r
        for (int i = 0, el = 22; i < 10; i++, el-=2){
            r[i] = el;
        }
        double[] x = new double[16];
        for (int i = 0; i < 16; i++){ // создание и заполение вторго массива x
            x[i] = -7 + (Math.random() * 19);
        }
        double[][] f = new double[10][16]; // создание и заполение двумерного массива r
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 16; j++){
                double x1 = x[j];
                if (r[i] == 8) {
                    double result = exp1(x1);
                    f[i][j] = result;
                }
                else if ((r[i] == 4) || (r[i] == 12) || (r[i] == 14) || (r[i] == 18) || (r[i] == 20)){
                    double result = exp2(x1);
                    f[i][j] = result;
                }
                else {
                    double result = exp3(x1);
                    f[i][j] = result;
                }
            }
        }
        printMatrix(f);
    }
}