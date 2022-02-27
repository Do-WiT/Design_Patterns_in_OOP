import bridge.*;
import memento.CircleMemento;
import singleton.MementoSingleton;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        RasterRendererBridge raster = new RasterRendererBridge();
        VectorRendererBridge vector = new VectorRendererBridge();
        Stack<CircleMemento> mementos = new Stack<>();

        Circle circle = new Circle(vector, 5);
        circle.draw();

        MementoSingleton.getInstance().setMemento(circle.resizeMemento(2));
        MementoSingleton.getInstance().setMemento(circle.resizeMemento(10));
        circle.draw();

        circle.restoreMemento(MementoSingleton.getInstance().getLastMemento());

        circle.draw();




    }
}
