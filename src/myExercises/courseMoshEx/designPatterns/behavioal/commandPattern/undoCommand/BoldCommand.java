package myExercises.courseMoshEx.designPatterns.behavioal.commandPattern.undoCommand;

public class BoldCommand implements UndoableCommand {
    private String prevContent;
    private final HTMLDocument htmlDocument;
    private final History history;

    public BoldCommand(HTMLDocument htmlDocument, History history) {
        this.htmlDocument = htmlDocument;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = htmlDocument.getContent();
        htmlDocument.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        htmlDocument.setContent(prevContent);
    }
}
