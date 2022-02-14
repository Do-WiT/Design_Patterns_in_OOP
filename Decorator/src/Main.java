public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println(circle.info());
        circle.resize(3);
        System.out.println(circle.info());

        ColorDecorator newCircle = new ColorDecorator(circle, "Black");
        System.out.println(newCircle.info());
        TransparentDecorator newSquare = new TransparentDecorator(
                new ColorDecorator(new Square(10), "Green"), 3
        );
        System.out.println(newSquare.info());

    }
}
