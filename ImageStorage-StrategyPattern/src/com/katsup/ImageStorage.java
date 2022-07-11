package src.com.katsup;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter){
        // Type of compression algorithm for jpeg, png...
        compressor.compress(fileName);
        // Type of filter, black and white, high contrast...
        filter.apply(fileName);
    }
}
