package myExercises.courseMoshEx.designPatterns.behavioal.commandPattern.compositeCommand;

public class Main {
    public static void main(String[] args) {
        CompositeCommand compositeCommand=new CompositeCommand();
         compositeCommand.addCommand(new BlackAndWhiteFilterCommand());
         compositeCommand.addCommand(new ResizeImageCommand());
         compositeCommand.execute();
    }
}
