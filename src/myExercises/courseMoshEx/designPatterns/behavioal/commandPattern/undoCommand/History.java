package myExercises.courseMoshEx.designPatterns.behavioal.commandPattern.undoCommand;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    private final Deque<UndoableCommand> undoableCommands = new ArrayDeque<>();

    public void push(UndoableCommand undoableCommand) {
        undoableCommands.add(undoableCommand);
    }

    public UndoableCommand pop() {
        return undoableCommands.pop();
    }

    public int size(){
        return undoableCommands.size();
    }
}
