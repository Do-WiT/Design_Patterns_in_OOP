package bridge;

import memento.CircleMemento;
import prototype.Prototype;

public class Circle extends Shape implements Prototype {
    public float radius;

    public Circle(RendererBridge renderer) {
        super(renderer);
    }

    public Circle(RendererBridge renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    public CircleMemento resizeMemento(float radius){
        CircleMemento old = new CircleMemento(this.radius);
        resize(radius);
        return old;
    }

    public void restoreMemento(CircleMemento c){
        this.radius = c.getRadius();

    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }

    @Override
    public void resize(float scale) {
        this.radius = this.radius * scale;
    }

    @Override
    public void resize(float scaleX, float scaleY) {

    }

    @Override
    public Prototype clonePrototype() {
        Circle newCircle = new Circle(renderer);
        newCircle.radius = this.radius;
        return newCircle;
    }
}
