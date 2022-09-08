package myExercises.courseMoshEx.designPatterns.behavioal.StrategyPattern.ShoppingCart.goodWay;

import java.util.List;

public class ShoppingCard {
    private List<Item> items;
    Payment payment;

//    amount should be generated from list values
    public void pay(double amount) {
        payment.pay(amount);
    }

}
