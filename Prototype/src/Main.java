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

        Circle newCircle = (Circle) circle.clonePrototype();
        newCircle.draw();

        System.out.println("======Undo Prototype=========");

        circle.restoreMemento(mementos.pop());

        Circle newCircle2= (Circle) circle.clonePrototype();
        newCircle2.draw();


    }
}
