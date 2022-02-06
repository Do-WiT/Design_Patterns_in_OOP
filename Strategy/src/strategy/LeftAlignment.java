package strategy;

public class LeftAlignment implements AlignmentStrategy{
    @Override
    public String adjustAlignment() {
        return "<<<";
    }
}
