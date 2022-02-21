public class Main {

    public static void main(String[] args) {

        RasterRendererBridge raster = new RasterRendererBridge();
        VectorRendererBridge vector = new VectorRendererBridge();

        Circle circle = new Circle(vector, 5);
        circle.draw();
        circle.resize(0.5F);
        circle.draw();

        Rectangle rectangle = new Rectangle(raster, 10, 10);
        rectangle.draw();
        rectangle.resize(0.5F);
        rectangle.draw();

    }
}
