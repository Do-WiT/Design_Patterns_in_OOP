public abstract class Model {
    public abstract double getBaseArea();
    public abstract double getHeight();
    //template method
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}
