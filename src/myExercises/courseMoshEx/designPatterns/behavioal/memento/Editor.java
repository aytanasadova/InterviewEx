package myExercises.courseMoshEx.designPatterns.behavioal.memento;

public class Editor {
    private String content;
    private String anotherContent;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnotherContent() {
        return anotherContent;
    }

    public void setAnotherContent(String anotherContent) {
        this.anotherContent = anotherContent;
    }
}
