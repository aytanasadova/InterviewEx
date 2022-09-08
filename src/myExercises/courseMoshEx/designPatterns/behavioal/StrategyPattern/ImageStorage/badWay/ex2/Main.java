package myExercises.courseMoshEx.designPatterns.behavioal.StrategyPattern.ImageStorage.badWay.ex2;

public class Main {
    public static void main(String[] args) {
        ImageStore imageStore=new ImageStore();
        String image="Penguin image";
        imageStore.store(image,"b&w","png");
    }
}
