package strategy;

public class CenterAlignment implements AlignmentStrategy{
    @Override
    public String adjustAlignment() {
        return "<C>";
    }
}
