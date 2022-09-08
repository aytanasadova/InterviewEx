package myExercises.courseMoshEx.designPatterns.behavioal.StrategyPattern.ImageStorage.goodWay.ex1;

public class PNGCompressor implements Compressor_Strategy {
    @Override
    public String compress(String image) {
        System.out.println("Image compressed as png");
        return image;
    }
}
