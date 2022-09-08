package myExercises.courseMoshEx.designPatterns.behavioal.StrategyPattern.ImageStorage.goodWay.ex1;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public String filter(String image) {
        System.out.println("Image filtered as black white");
        return image;
    }
}
