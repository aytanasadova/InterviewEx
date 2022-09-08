package myExercises.courseMoshEx.designPatterns.behavioal.StrategyPattern.ImageStorage.goodWay.ex1;

public class JPGCompressor_concrete_strategy implements Compressor_Strategy {
    @Override
    public String compress(String image) {
        System.out.println("Image compressed as jpg");
        return image;
    }
}
