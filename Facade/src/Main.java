public class Main {

    public static void main(String[] args) {
        Buffer buffer = new Buffer (30, 20);
        ViewPort viewport = new ViewPort (buffer, 30, 20, 10, 10);
        Screen screen = new Screen (30, 20);
        screen.addViewPort(viewport);
        screen.render();
        Screen screenFromFacade = Screen.newScreenFacade(30, 20, 10, 10);
        screenFromFacade.render();
    }
}
