package interpreter;

import visitor.ExpressionVisitor;

public abstract class Expression {

    public abstract double eval();

    public abstract void accept(ExpressionVisitor visitor);

}
