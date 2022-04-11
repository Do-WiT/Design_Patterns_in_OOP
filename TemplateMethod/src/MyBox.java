public class MyBox extends Model{
    private double width;
    private double length;
    private double height;
    public MyBox (double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public double getBaseArea() {
        return width * length;
    }

    @Override
    public double getHeight() {
        return height;
    }
}
