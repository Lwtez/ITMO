public class CheckedException extends Exception {
    private final int foodCount;

    // Конструктор, принимающий количество еды
    public CheckedException(int foodCount) {
        this.foodCount = foodCount;
    }

    // Переопределение метода getMessage()
    @Override
    public String getMessage() {
        return "Барон умер от голода! Текущий запас еды: " + foodCount;
    }
}
