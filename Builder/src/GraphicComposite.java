import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraphicComposite {
    public  String name, color;
    public int width, height;
    public List<GraphicComposite> children;
    public GraphicComposite() {
        this.children = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(sb, 0);
        return sb.toString();
    }

    private void print(StringBuilder sb, int depth) {
        sb.append(String.join("", Collections.nCopies(depth, "*")))
                .append(depth > 0 ? " ": "")
                .append((color == null || color.isEmpty()) ? "": color + " ")
                .append((name == null ) ? "==GROUP==" : name + " ")
                .append((name == null) ? "": "Width = " + width + " ")
                .append((name == null) ? "": "Height = "+ height +" ")
                .append(System.lineSeparator());

        for (GraphicComposite g: children) {
            g.print(sb, depth+1);
        }




    }
}
