public class Rectangle extends Shape{

    private float sideX, sideY;

    public Rectangle(RendererBridge renderer) {
        super(renderer);
    }

    public Rectangle(RendererBridge renderer, float sideX, float sideY) {
        super(renderer);
        this.sideX = sideX;
        this.sideY = sideY;
    }

    @Override
    public void draw() {
        renderer.renderRect(sideX,sideY);
    }

    @Override
    public void resize(float scale) {
        this.sideX = this.sideX  * scale;
        this.sideY = this.sideY * scale;
    }
}
