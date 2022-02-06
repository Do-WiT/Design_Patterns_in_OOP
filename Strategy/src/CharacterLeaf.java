import strategy.AlignmentStrategy;
import strategy.LeftAlignment;

public class CharacterLeaf implements TextComponent {
    private String color;
    private String character;
    private AlignmentStrategy alignment;


    public CharacterLeaf() {
        this.color = "back";
        this.character = "";
        this.alignment = new LeftAlignment();
    }

    @Override
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public String getCharacter() {
        return this.character;
    }

    @Override
    public void add(TextComponent component) {

    }

    @Override
    public void setAlignment(AlignmentStrategy alignment) {
        this.alignment = alignment;
    }

    @Override
    public void showProperty(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print(" ");
        }
        System.out.println(alignment.adjustAlignment() + "[" + depth + "]" + this.character + ": colour is " + this.color);
    }


}
