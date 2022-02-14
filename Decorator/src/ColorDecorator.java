public class ColorDecorator implements Shape{

    private Shape shape;
    private String color;


    public ColorDecorator(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }


    @Override
    public String info() {
        return this.shape.info() + " has the color " + this.color;
    }
}
