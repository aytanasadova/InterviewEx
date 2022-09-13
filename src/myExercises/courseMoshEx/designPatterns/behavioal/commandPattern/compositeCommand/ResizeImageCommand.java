package myExercises.courseMoshEx.designPatterns.behavioal.commandPattern.compositeCommand;

import myExercises.courseMoshEx.designPatterns.behavioal.commandPattern.framework.Command;

public class ResizeImageCommand implements Command {
    @Override
    public void execute() {
        System.out.println("File resized");
    }
}
