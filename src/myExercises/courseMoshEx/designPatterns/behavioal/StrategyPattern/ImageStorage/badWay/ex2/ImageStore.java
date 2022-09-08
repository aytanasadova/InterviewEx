package myExercises.courseMoshEx.designPatterns.behavioal.StrategyPattern.ImageStorage.badWay.ex2;

public class ImageStore {

    private String image;

    public void store(String image, String filterType, String compressType) {
        filter(image, filterType);
        compress(image, compressType);
    }

    private void filter(String image, String filterType) {
        if (filterType.equals("b&w")) filterBlackWhite(image);
        else if (filterType.equals("colored")) filterColored(image);
    }

    private void compress(String image, String compressType) {
        if (compressType.equals("png")) compressPng(image);
        else if (compressType.equals("jpg")) compressJpg(image);
    }

    private void filterBlackWhite(String image) {
        System.out.println("Image filtered as black white");
    }

    private void filterColored(String image) {
        System.out.println("Image filtered as colored");
    }

    private void compressPng(String image) {
        System.out.println("Image compressed as png");
    }

    private void compressJpg(String image) {
        System.out.println("Image compressed as jpg");
    }
}
