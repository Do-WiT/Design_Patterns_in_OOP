public class MyCylinder extends Model{
    private double radius;
    private double height;

    public MyCylinder (double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getHeight() {
        return height;
    }
}
