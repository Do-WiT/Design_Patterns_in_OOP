public class DoubleExpression extends Expression{

    private double  value;

    public DoubleExpression(double value){
        this.value = value;
    }

    @Override
    public double eval() {
        return value;
    }
}
