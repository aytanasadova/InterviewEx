package myExercises.courseMoshEx.designPatterns.behavioal.StrategyPattern.ShoppingCart.badWay;

public class ShoppingCart {
    private double amount;

    public void pay(double amount, String paymentType) {
        if (paymentType.equals("card")) cardPayment(amount);
        else if (paymentType.equals("cash")) cardPayment(amount);
    }


    private void cardPayment(double amount) {
        System.out.println("Payment with card is successful: " + amount);
    }

    private void cashPayment(double amount) {
        System.out.println("Payment with cash is successful:" + amount);
    }
}
