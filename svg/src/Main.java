public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Point point = new Point();
        point.x = 5.6F;
        point.y = 2.4F;

        Point p2 = new Point();
        p2.x = 150F;
        p2.y = 213.7F;
        System.out.println(p2.toSvg());

    }
}
