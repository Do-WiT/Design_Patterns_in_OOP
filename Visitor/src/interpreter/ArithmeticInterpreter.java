package interpreter;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticInterpreter {
    public static List<Token> lex(String input){
        List<Token> result = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)){
                case '+':
                    result.add(new Token(TokenType.PLUS,"+"));
                    break;
                case '-':
                    result.add(new Token(TokenType.MINUS,"-"));
                    break;
                case '(':
                    result.add(new Token(TokenType.LPAREN,"("));
                    break;
                case ')':
                    result.add(new Token(TokenType.RPAREN,")"));
                    break;
                default:
                    StringBuilder sb = new StringBuilder("" + input.charAt(i));
                    for (int j = i +1; j < input.length(); j++) {
                        if (Character.isDigit(input.charAt(j))){
                            sb.append(input.charAt(j));
                            i++;
                        }
                        else {
                            break;
                        }
                    }

                    result.add(new Token(TokenType.NUMBER, sb.toString()));
                    break;


            }
        }
        return result;
    }

    public static Expression parse(List<Token> tokens){
        if (tokens.size() == 1)
            return new DoubleExpression(Double.parseDouble(tokens.get(0).getText()));

        Expression left = null, right = null;
        Type type = null;

        Expression tempExpression = null;
        List<Token> preExpression, sufExpression;

        for (int i = tokens.size() -1; i >= 0; i--) {
            Token token = tokens.get(i);
            switch (token.getType()) {

                case PLUS:
                    preExpression = new ArrayList<Token>(tokens.subList(0, i));
                    sufExpression = new ArrayList<Token>(tokens.subList(i + 1, tokens.size()));
                    left = parse(preExpression);
                    right = tempExpression != null ? tempExpression : parse(sufExpression);
                    type = Type.ADDITION;
                    i = -1;
                    break;
                case MINUS:
                    preExpression = new ArrayList<Token>(tokens.subList(0, i));
                    sufExpression = new ArrayList<Token>(tokens.subList(i + 1, tokens.size()));
                    left = parse(preExpression);
                    right = tempExpression != null ? tempExpression : parse(sufExpression);
                    type = Type.SUBTRACTION;
                    i = -1;
                    break;
                case RPAREN:
                    ArrayList<Token> subexpression = new ArrayList<>();
                    int rParenCount = 0;
                    for (int j = i - 1; j >= 0; j--) {
                        if (tokens.get(j).getType() == TokenType.RPAREN) {
                            subexpression.add(0, tokens.get(j));
                            rParenCount++;
                        } else if (tokens.get(j).getType() == TokenType.LPAREN && rParenCount > 0) {
                            subexpression.add(0, tokens.get(j));
                            rParenCount--;
                        } else if (tokens.get(j).getType() == TokenType.LPAREN && rParenCount == 0) {
                            i = j;
                            break;
                        } else {
                            subexpression.add(0, tokens.get(j));
                        }
                    }
                    tempExpression = parse(subexpression);
                    break;

            }
        }
        if (tempExpression != null && type == null) return tempExpression;
        BinaryExpression result = new BinaryExpression(left, right);
        result.setType(type);
        return result;












    }





}
