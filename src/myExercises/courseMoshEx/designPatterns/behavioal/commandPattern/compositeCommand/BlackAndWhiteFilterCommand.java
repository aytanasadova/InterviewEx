package myExercises.courseMoshEx.designPatterns.behavioal.commandPattern.compositeCommand;

import myExercises.courseMoshEx.designPatterns.behavioal.commandPattern.framework.Command;

public class BlackAndWhiteFilterCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white filter applied");
    }
}
