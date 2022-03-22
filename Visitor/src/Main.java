import interpreter.ArithmeticInterpreter;
import interpreter.BinaryExpression;
import interpreter.Expression;
import interpreter.Token;
import visitor.ExpressionPrinter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String input1 = "1+(2+3)";
        String input2 = "13+4-(12+1)";

        List<Token> tokens = ArithmeticInterpreter.lex(input1);
        /*
        for (interpreter.Token t: tokens) {
            System.out.println(t.toString() + "\t");
        }
        System.out.println();
        */

        List<Token> tokens2 = ArithmeticInterpreter.lex(input2);
        /*
        for (interpreter.Token t: tokens2) {
            System.out.println(t.toString() + "\t");
        }
        System.out.println();
        */


        Expression parsed1 = ArithmeticInterpreter.parse(tokens);
        System.out.println(parsed1.eval());

        Expression parsed2 = ArithmeticInterpreter.parse(tokens2);
        System.out.println(parsed1.eval());

        ExpressionPrinter ep1 = new ExpressionPrinter();
        ep1.visit((BinaryExpression)parsed1);
        System.out.println(ep1);
        ExpressionPrinter ep2 = new ExpressionPrinter();
        ep2.visit((BinaryExpression)parsed2);
        System.out.println(ep2);


    }
}
