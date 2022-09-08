package myExercises.courseMoshEx.designPatterns.behavioal.StrategyPattern.ImageStorage.goodWay.ex1;

public class ImageStore_context {
    String image;
    Compressor_Strategy compressor;
    Filter filter;

    public ImageStore_context(Compressor_Strategy compressor, Filter filter){
        this.compressor=compressor;
        this.filter=filter;
    }

    public void store(String image){
        compressor.compress(image);
        filter.filter(image);
    }
}
