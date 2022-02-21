package bridge;

public class Circle extends Shape{
    public float radius;

    public Circle(RendererBridge renderer) {
        super(renderer);
    }

    public Circle(RendererBridge renderer, float radius) {
        super(renderer);
        this.radius = radius;
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
}
