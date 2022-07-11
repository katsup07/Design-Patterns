package src.com.katsup;

public class Main {

  public static void main(String[] args) {
    var imageStorer = new ImageStorage();
    imageStorer.store("file1", new PngCompressor(), new BlackAndWhiteFilter());
    imageStorer.store("file1", new JpegCompressor(), new BlackAndWhiteFilter());

  }
}