package bridge;

public abstract class Shape {
    protected RendererBridge renderer;

    public Shape(RendererBridge renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
    public abstract void resize(float scale);
    public abstract void resize(float scaleX, float scaleY);
}
