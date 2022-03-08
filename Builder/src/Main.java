public class Main {

    public static void main(String[] args) {
        GraphicComposite drawing = new GraphicComposite();

        drawing.children.add(new Rectangle("Blue",10,10));
        drawing.children.add(new Oval("Pink", 20, 20));

        GraphicComposite group = new GraphicComposite();
        group.children.add(new Oval("Red",2,2));
        group.children.add(new Rectangle("Yellow", 4,4));
        drawing.children.add(group);

        System.out.println(drawing);


    }
}
