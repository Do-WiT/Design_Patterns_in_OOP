import strategy.AlignmentStrategy;

public interface TextComponent {

    //setColor() = operation() in diagram
    void setColor(String color);
    void setCharacter(String character);
    String getCharacter();
    void showProperty(int depth);
    void add(TextComponent component);
    void setAlignment(AlignmentStrategy alignment);



}
