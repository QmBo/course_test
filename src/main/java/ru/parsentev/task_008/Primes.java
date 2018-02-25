package ru.parsentev.task_008;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Primes {
    private static final Logger log = getLogger(Primes.class);

    private final int limit;

    public Primes(final int limit) {
        this.limit = limit;
    }

    public List<Integer> calc() {
        List<Integer> result = new List<Integer>();
        for (int i = this.limit-1; i > 0 ; i--) {
            if (isNormal(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isNormal(int input) {
        boolean result = false;
        int twoOrMore = 0;
        for (int i = input - 1; i > 0; i--) {
            if ((input%i) == 0) {
                twoOrMore++;
            }
        }
        if (twoOrMore < 2) {
            result = true;
        }
        return result;
    }
}
