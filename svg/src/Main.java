public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Point point = new Point(5.6f, 4.8f);
        System.out.println(point.toSvg());
        point.translate(4.3f, 8.4f);
        System.out.println(point.toSvg());

        Point point3=point.translated(7.8f, 2.9f);
        System.out.println(point3.toSvg());

        Segment segment = new Segment();
        segment.p = point;
        segment.q = point3;
        System.out.println(segment.length());
        Segment[] segements = new Segment[5];


    }
    /*
    public static float findMax(Segment[] segments){
        float max = segements[0].length();
        for(Segment s : segments){
            if(max>s.length())
                max=s.length();
        }
        return max;
    }
    */
}
