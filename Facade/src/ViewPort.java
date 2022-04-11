public class ViewPort {
    private char[] characters;
    private final Buffer buffer;
    private final int width;
    private final int height;
    private final int offsetX;
    private final int offsetY;

    public ViewPort (Buffer buffer, int width, int height, int offsetX, int offsetY) {
        this.buffer = buffer;
        this.width = width;
        this.height = height;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        characters = new char [ width * height ];
    }
    public char charAt (int x, int y) {
        if (x >= offsetX && y >= offsetY) return buffer.charAt(x - offsetX, y - offsetY);
        else return characters [y * width + x];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
