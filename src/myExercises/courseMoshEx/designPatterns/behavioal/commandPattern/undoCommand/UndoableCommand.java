package myExercises.courseMoshEx.designPatterns.behavioal.commandPattern.undoCommand;

public interface UndoableCommand extends  Command{
    void unexecute();
}
