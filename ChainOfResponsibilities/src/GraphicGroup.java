import java.util.ArrayList;

public class GraphicGroup extends ArrayList<GraphicComposite> {
    public GraphicGroup() {
    }

    public void resizeAll(int scale){
        for (GraphicComposite g:this) {
            g.resize(scale);
        }
    }
}
