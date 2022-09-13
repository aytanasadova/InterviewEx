package myExercises.courseMoshEx.designPatterns.behavioal.commandPattern.undoCommand;

public class HTMLDocument {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void makeBold(){
        content="<b>"+ content+"</b>";
    }
}
