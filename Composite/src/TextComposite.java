import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {

    private List<TextComponent> childNode;

    public TextComposite() {
        childNode = new ArrayList<>();
    }

    @Override
    public void setColor(String color) {
        for (TextComponent node: childNode) {
            node.setColor(color);
        }
    }

    @Override
    public void showProperty(int depth) {

        for (int i = 0; i < depth; i++) {
            System.out.print(" ");
        }
        System.out.println("[" + depth + "] >> is a group");


        for (TextComponent node: childNode) {
            node.showProperty(depth +1);
        }
    }

    @Override
    public void add(TextComponent component) {
        childNode.add(component);
    }

    @Override
    public void setCharacter(String character) {
    }

    @Override
    public String getCharacter() {
        return null;
    }


}
