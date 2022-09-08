package myExercises.courseMoshEx.designPatterns.behavioal.StrategyPattern.ShoppingCart.goodWay;

public class Item {
    private String name;
    private EnumColor color;
    private double amount;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(EnumColor color) {
        this.color = color;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
