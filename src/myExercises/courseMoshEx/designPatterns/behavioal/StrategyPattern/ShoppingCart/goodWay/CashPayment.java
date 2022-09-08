package myExercises.courseMoshEx.designPatterns.behavioal.StrategyPattern.ShoppingCart.goodWay;

public class CashPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Payment with cash is successful:" + amount);
    }
}
