package command;
import bridge.Shape;

public class ResizeShapeCommand implements Command{

    private Shape shape;

    public enum Action{
        WIDTHRESIZING, HEIGHTRESIZING, BOTHRESIZING
    }

    private Action action;
    private  float scale;

    public ResizeShapeCommand(Shape shape, Action action, float scale) {
        this.shape = shape;
        this.action = action;
        this.scale = scale;
    }

    @Override
    public void call() {
        switch (action){
            case BOTHRESIZING: shape.resize(scale); break;
            case HEIGHTRESIZING: shape.resize(1, scale); break;
            case WIDTHRESIZING: shape.resize(scale, 1); break;
        }
    }

    @Override
    public void undo() {
        switch (action){
            case BOTHRESIZING: shape.resize(1/scale); break;
            case HEIGHTRESIZING: shape.resize(1, 1/scale); break;
            case WIDTHRESIZING: shape.resize(1/scale, 1); break;
        }
    }
}
