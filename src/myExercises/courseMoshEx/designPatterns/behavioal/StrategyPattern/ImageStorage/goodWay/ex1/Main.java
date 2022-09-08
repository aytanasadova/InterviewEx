package myExercises.courseMoshEx.designPatterns.behavioal.StrategyPattern.ImageStorage.goodWay.ex1;

public class Main {
    public static void main(String[] args) {
        String image="Penguin image";
        ImageStore_context imageStore = new ImageStore_context(new JPGCompressor_concrete_strategy(),new BlackAndWhiteFilter());
        imageStore.store(image);
    }
}
