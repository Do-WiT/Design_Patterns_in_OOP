package visitor;

import interpreter.BinaryExpression;
import interpreter.DoubleExpression;

public class ExpressionPrinter implements ExpressionVisitor{

    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(DoubleExpression e) {
        sb.append(e.getValue());
    }

    @Override
    public void visit(BinaryExpression e) {
        sb.append("(");
        e.getLeft().accept(this);
        switch(e.getType())
        {
            case ADDITION:
                sb.append("+");
                break;
            case SUBTRACTION:
                sb.append("-");
                break;
        }
        e.getRight().accept(this);
        sb.append(")");

    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
