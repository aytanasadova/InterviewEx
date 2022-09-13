package myExercises.courseMoshEx.designPatterns.behavioal.commandPattern.framework;

public class Button {
    private String label;
    private Command command;

    public Button(Command command){
        this.command=command;
    }

    public void click(){
        command.execute();
    }
}
