import bridge.*;
import command.Command;
import command.ResizeShapeCommand;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        RasterRendererBridge raster = new RasterRendererBridge();
        VectorRendererBridge vector = new VectorRendererBridge();

        Circle circle = new Circle(vector, 5);
        circle.draw();
        circle.resize(0.5F);
        circle.draw();

        Rectangle rectangle = new Rectangle(raster, 10, 10);
        rectangle.draw();
        rectangle.resize(0.5F);
        rectangle.draw();

        System.out.println("============Command============");

        ResizeShapeCommand resizeShapeCommand = new ResizeShapeCommand(circle, ResizeShapeCommand.Action.BOTHRESIZING, 4);
        resizeShapeCommand.call();
        circle.draw();

        Stack<Command> commands = new Stack<>();
        commands.push(new ResizeShapeCommand(circle, ResizeShapeCommand.Action.BOTHRESIZING, 4));
        commands.push(new ResizeShapeCommand(circle, ResizeShapeCommand.Action.BOTHRESIZING, 0.5F));
        commands.push(new ResizeShapeCommand(circle, ResizeShapeCommand.Action.BOTHRESIZING, 2));

        for (Command c: commands) {
            c.call();
            circle.draw();
        }
        System.out.println("============Undo============");

        while (!commands.isEmpty()){
            Command c = commands.pop();
            c.undo();
            circle.draw();
        }
    }
}
