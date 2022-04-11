import java.util.ArrayList;
import java.util.List;

public class Screen {
    private List<ViewPort> viewports = new ArrayList<>();
    int width, height;
    public Screen (int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addViewPort (ViewPort viewport) {
        viewports.add(viewport);
    }

    public void render() {
        for (ViewPort vp: viewports) {
            for (int y = 0; y < vp.getHeight(); y++) {
                for (int x = 0; x < vp.getWidth(); x++) {
                    System.out.print(vp.charAt(x, y));
                }
                System.out.println();
            }
        }
    }

    public static Screen newScreenFacade (int width, int height, int offsetX, int offsetY) {
        Buffer buffer = new Buffer (width, height);
        ViewPort viewport = new ViewPort (buffer, width, height, offsetX, offsetY);
        Screen screen = new Screen (width, height);
        screen.addViewPort(viewport);
        return screen;
    }
}
