public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);  // Попытка деления на 0
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;  // Может выбросить ArithmeticException
    }
}
