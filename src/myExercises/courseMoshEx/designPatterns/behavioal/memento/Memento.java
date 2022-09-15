package myExercises.courseMoshEx.designPatterns.behavioal.memento;

import java.util.Stack;

public class Memento {


    Stack<EditorState> states=new Stack<>();

    public void push(EditorState state){
        states.push(state);
    }

    public EditorState pop(){
        return  states.pop();
    }
}
