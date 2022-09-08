package myExercises.courseMoshEx.designPatterns.behavioal.StrategyPattern.ImageStorage.goodWay.ex1;

public class ColoredFilter implements Filter{
    @Override
    public String filter(String image) {
        System.out.println("Image filtered as colored");
        return image;
    }
}
