package bridge;

public class RasterRendererBridge implements RendererBridge{
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius " + radius
                + " by raster renderer.");
    }

    @Override
    public void renderRect(float sideX, float sideY) {
        System.out.println("Drawing a rectangle of side X : " + sideX
                + ", side Y : " + sideY + " by raster renderer.");
    }
}
