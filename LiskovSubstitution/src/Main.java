public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        calculate(rectangle);

        Square square = new Square();
        square.setHeight(5);
        calculate(square);

        System.out.println("After used Liskov ");

        calculate(RectangleFactory.newRectangle(2, 3));
        calculate(RectangleFactory.newSquare(5));



    }

    static void calculate(Rectangle rectangle){

        int width = rectangle.getWidth();
        //TODO:something
        rectangle.setHeight(10);
        //
        System.out.println("Expected area = " + (width * 10) +
                " got " + rectangle.getArea());


    }
}
