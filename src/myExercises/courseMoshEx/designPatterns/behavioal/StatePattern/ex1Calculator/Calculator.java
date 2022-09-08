package myExercises.courseMoshEx.designPatterns.behavioal.StatePattern.ex1Calculator;

public class Calculator {
    Operation currentState;

    public Calculator(Operation currentState) {
        this.currentState = currentState;
    }

    void setState(Operation currentState){
        this.currentState=currentState;
    }
    public double calculate(int a, int b) {
        return currentState.calculate(a, b);
    }
}
