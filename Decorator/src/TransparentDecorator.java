public class TransparentDecorator implements Shape{

    private Shape shape;
    private int transparent;



    public TransparentDecorator(Shape shape, int transparent) {
        this.shape = shape;
        this.transparent = transparent;
    }

    @Override
    public String info() {
        return this.shape.info() + " has " + this.transparent + "% transparency" ;
    }
}
