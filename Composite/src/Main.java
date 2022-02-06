public class Main {

    public static void main(String[] args) {

        TextComposite group1 = new TextComposite();
        TextComponent child1 = new CharacterLeaf();
        child1.setCharacter("A");
        child1.setColor("Green");
        TextComponent child2 = new CharacterLeaf();
        child2.setCharacter("B");
        child2.setColor("Blue");
        TextComponent child3 = new CharacterLeaf();
        child3.setCharacter("A");
        TextComponent child4 = new CharacterLeaf();
        child4.setCharacter("C");
        child4.setColor("Pink");
        group1.add(child1);
        group1.add(child2);
        group1.add(child3);
        group1.add(child4);

        TextComponent group2 = new TextComposite();
        TextComponent child5 = new CharacterLeaf();
        child5.setCharacter("Z");
        child5.setColor("Red");
        TextComponent child6 = new CharacterLeaf();
        child6.setCharacter("F");
        child6.setColor("Yellow");
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
