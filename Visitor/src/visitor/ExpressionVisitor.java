package visitor;

import interpreter.BinaryExpression;
import interpreter.DoubleExpression;

public interface ExpressionVisitor {
    void visit(DoubleExpression e);
    void visit(BinaryExpression e);
}
