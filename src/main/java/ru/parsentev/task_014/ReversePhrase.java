package ru.parsentev.task_014;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ReversePhrase {
    private static final Logger log = getLogger(ReversePhrase.class);
    private final String line;

    public ReversePhrase(final String line) {
        this.line = line;
    }

    public String reverse() {
        String result = new String();
        String[] rewers = this.line.split(" ");
        for (int i = rewers.length - 1; i >=0 ; i--) {
            result += rewers[i];
            if (i > 0) {
                result += " ";
            }
        }
        return result;
    }
}
