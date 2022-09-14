package myExercises.courseMoshEx.designPatterns.behavioal.commandPattern.undoCommand;

public class Main {

    public static void main(String[] args) {
        History history = new History();
        HTMLDocument document = new HTMLDocument();
        document.setContent("Hello there");
        BoldCommand b = new BoldCommand(document, history);
        UndoCommand undoCommand = new UndoCommand(history);
        b.execute();
        System.out.println(document.getContent());

//        b.unexecute();
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
