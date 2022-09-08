package myExercises.courseMoshEx.designPatterns.behavioal.StrategyPattern.ShoppingCart.goodWay;


public class CardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Payment with card is successful");
    }
}
