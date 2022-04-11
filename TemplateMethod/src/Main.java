public class Main {

    public static void main(String[] args) {
        Model cylinder = new MyCylinder(4.0, 10.0);
        System.out.println("Cylinder has volume of " + cylinder.getVolume());
        Model box = new MyBox(3.0, 4.0, 5.0);
        System.out.println("Box has volume of " + box.getVolume());
    }
}
