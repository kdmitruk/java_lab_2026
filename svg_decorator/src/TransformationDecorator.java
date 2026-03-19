import java.util.Locale;

public class TransformationDecorator extends ShapeDecorator{
    private final String transform;

    public TransformationDecorator(Shape decoratedShape, String transform) {
        super(decoratedShape);
        this.transform = transform;
    }

    @Override
    public String toSvg() {
        return this.decoratedShape.toSvg().replace("/>",
                String.format(" transform=\"%s\"/>", transform));
    }

    public static class Builder{
        private Shape base;
        private String result = "";

        public Builder(Shape base) {
            this.base = base;
        }

        public Builder translate(Vec2 translation){
            result += String.format(Locale.ENGLISH,
                    " translate(%f %f)",
                    translation.x(), translation.y());
            return this;
        }
        public Builder rotate(double rotation, Vec2 center){
            result += String.format(Locale.ENGLISH,
                    " rotate(%f %f %f)",
                    rotation, center.x(), center.y());
            return this;
        }

        public TransformationDecorator build(){
            return new TransformationDecorator(base, result);
        }

    }
}

