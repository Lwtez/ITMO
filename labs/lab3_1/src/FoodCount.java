public record FoodCount(int count) {
    // Метод для увеличения еды
    public FoodCount addFood(int amount) {
        return new FoodCount(this.count + amount);
    }

    // Метод для уменьшения еды
    public FoodCount reduceFood(int amount) {
        return new FoodCount(this.count - amount);
    }

    // Метод для проверки запаса еды
    public boolean isDepleted() {
        return this.count <= 0;
    }
}
