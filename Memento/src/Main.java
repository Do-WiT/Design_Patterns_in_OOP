import bridge.*;
import memento.CircleMemento;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        RasterRendererBridge raster = new RasterRendererBridge();
        VectorRendererBridge vector = new VectorRendererBridge();
        Stack<CircleMemento> mementos = new Stack<>();

        Circle circle = new Circle(vector, 5);
        circle.draw();

        mementos.push(circle.resizeMemento(2));
        circle.draw();
        mementos.push(circle.resizeMemento(10));
        circle.draw();

        System.out.println("======Undo Memento=========");
        circle.restoreMemento(mementos.pop());
        circle.draw();
        circle.restoreMemento(mementos.pop());
        circle.draw();





    }
}
