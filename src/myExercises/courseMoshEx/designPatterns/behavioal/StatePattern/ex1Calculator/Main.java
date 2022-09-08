package myExercises.courseMoshEx.designPatterns.behavioal.StatePattern.ex1Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator s = new Calculator(new Divide());

        System.out.println(s.calculate(4, 6));
        System.out.println(s.calculate(46, 65));

        s.setState(new Sum());

        System.out.println(s.calculate(44, 46));
        System.out.println(s.calculate(45, 46));
    }
}
