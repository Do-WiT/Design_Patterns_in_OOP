import strategy.CenterAlignment;
import strategy.LeftAlignment;
import strategy.RightAlignment;

public class Main {

    public static void main(String[] args) {

        TextComposite group1 = new TextComposite();
        TextComponent child1 = new CharacterLeaf();
        child1.setCharacter("A");
        child1.setColor("Green");
        child1.setAlignment(new CenterAlignment());

        TextComponent child2 = new CharacterLeaf();
        child2.setCharacter("B");
        child2.setColor("Blue");
        child2.setAlignment(new CenterAlignment());

        TextComponent child3 = new CharacterLeaf();
        child3.setCharacter("A");

        TextComponent child4 = new CharacterLeaf();
        child4.setCharacter("C");
        child4.setColor("Pink");
        child4.setAlignment(new CenterAlignment());

        group1.add(child1);
        group1.add(child2);
        group1.add(child3);
        group1.add(child4);

        TextComponent group2 = new TextComposite();
        TextComponent child5 = new CharacterLeaf();
        child5.setCharacter("Z");
        child5.setColor("Red");
        child5.setAlignment(new LeftAlignment());

        TextComponent child6 = new CharacterLeaf();
        child6.setCharacter("F");
        child6.setColor("Yellow");
        child6.setAlignment(new RightAlignment());

        group2.add(group1);
        group2.add(child5);
        group2.add(child6);
        group2.showProperty(1);

        // set new color
        group2.setColor("Gold");
        group2.showProperty(1);

        group1.setColor("Silver");
        group2.showProperty(1);

    }
}
