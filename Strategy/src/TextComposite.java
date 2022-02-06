import strategy.AlignmentStrategy;
import strategy.LeftAlignment;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {

    private List<TextComponent> childNode;
    private AlignmentStrategy alignment;

    public TextComposite() {
        childNode = new ArrayList<>();
        alignment = new LeftAlignment();
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
        System.out.println(alignment.adjustAlignment() + "[" + depth + "] >> is a group");


        for (TextComponent node: childNode) {
            node.showProperty(depth +1);
        }
    }

    @Override
    public void add(TextComponent component) {
        childNode.add(component);
    }

    @Override
    public void setAlignment(AlignmentStrategy alignment) {
        for (TextComponent node: childNode) {
            node.setAlignment(alignment);
        }
    }

    @Override
    public void setCharacter(String character) {
    }

    @Override
    public String getCharacter() {
        return null;
    }


}
