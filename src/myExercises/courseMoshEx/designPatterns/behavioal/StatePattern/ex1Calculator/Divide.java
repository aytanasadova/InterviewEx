package myExercises.courseMoshEx.designPatterns.behavioal.StatePattern.ex1Calculator;

public class Divide implements Operation {
    @Override
    public double calculate(int a, int b) {
        return a/b;
    }
}
