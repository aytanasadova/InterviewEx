package myExercises.courseMoshEx.designPatterns.behavioal.memento;

public class Main {
    public static void main(String[] args) {
        Editor e = new Editor();
        e.setContent("Hello there");
        EditorState es = e.createState();
        Memento history = new Memento();
        history.push(es);

        e.setContent("Hello there 1");
        history.push(e.createState());

        e.setContent("Hello there 2");
        history.push(e.createState());


        e.setContent("Hello there 3");
        e.restore(history.pop());


        System.out.println(e.getContent());
    }
}
