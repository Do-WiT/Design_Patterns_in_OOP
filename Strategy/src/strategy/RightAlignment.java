package strategy;

public class RightAlignment implements AlignmentStrategy{
    @Override
    public String adjustAlignment() {
        return ">>>";
    }
}
