public class CharacterLeaf implements TextComponent {
    private String color;
    private String character;


    public CharacterLeaf() {
        this.color = "back";
        this.character = "";
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
    public void showProperty(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print(" ");
        }
        System.out.println("[" + depth + "]" + this.character + ": colour is " + this.color);
    }


}
