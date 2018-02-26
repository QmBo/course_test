package ru.parsentev.task_012;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class SequenceArray {
    private static final Logger log = getLogger(SequenceArray.class);

    private final int[] values;

    public SequenceArray(final int[] values) {
        this.values = values;
    }

    public boolean containsOneSequence() {
        boolean result = false;
        int threeOrMore = 0;
        for (int input : values) {
            threeOrMore = (input == 1) ? (threeOrMore + 1) : 0;
            if (threeOrMore > 2) {
                result = true;
            }
        }
        return result;
    }
}
