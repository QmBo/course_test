package ru.parsentev.task_010;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Brackets {
    private static final Logger log = getLogger(Brackets.class);
    private final String line;

    public Brackets(final String line) {
        this.line = line;
    }

    public boolean isCorrect() {
        boolean result = false;
        ArrayList<Character> input = new ArrayList<Character>();
        for (char c : this.line.toCharArray()) {
            input.add(c);
        }
        if (input.get(0) == '(') {
            int open = 0;
            int closed = 0;
            for (char c : input) {
                if (c == '(') {
                    open++;
                }
                if (c == ')') {
                    closed++;
                }
            }
            if (open == closed) {
                return true;
            }
        }
        return result;
    }
}
