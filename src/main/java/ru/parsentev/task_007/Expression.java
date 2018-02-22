package ru.parsentev.task_007;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Expression {
    private static final Logger log = getLogger(Expression.class);

    private final String expr;

    public Expression(final String expr) {
        this.expr = expr;
    }

    public double calc() throws IllegalStateException {
        double result = 0;
        String[] strings = expr.split("(-|\\+|/|\\*)");
        if (strings.length == 2) {
            result = this.cal(Double.valueOf(strings[0]), Double.valueOf(strings[1]),
                    expr.substring(strings[0].length(), strings[0].length() + 1));
        } else {
            throw new java.lang.IllegalStateException("no");
        }
        return result;
    }

    private double cal(Double first, Double second, String substring) {
        double result = 0;
        if (substring.equals("+")) {
            result = first + second;
        }
        else if (substring.equals("-")) {
            result = first - second;
        }
        else if (substring.equals("/")) {
            result = first / second;
        }
        else if (substring.equals("*")) {
            result = first * second;
        }
        return result;
    }
}
