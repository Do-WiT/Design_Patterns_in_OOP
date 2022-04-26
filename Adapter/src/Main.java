import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        for (VectorObject vo : vectorObjects) {
            System.out.println("==new vector object==");
            for (Line line: vo) {
                System.out.println("==new line==");
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                for (Point p : adapter) {
                    drawPoint(p);
                }
            }
        }


    }
    private final static List<VectorObject> vectorObjects = new ArrayList<>(
            Arrays.asList(
                    new VectorRectangle(1, 1, 10, 10),
                    new VectorRectangle(3, 3, 6, 6)
            )
    );

    public static void drawPoint(Point p){
        System.out.println(p);
    }
}
