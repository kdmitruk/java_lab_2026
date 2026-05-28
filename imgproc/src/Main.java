import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ImageProcessor processor = new ImageProcessor();
        processor.load("lena.png");
        processor.addBrightness(-100);
        processor.save("lena.jpg");
    }
}
