package ru.parsentev.task_008;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

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
        TreeSet<Integer> temp = new TreeSet<Integer>();
        for (int i = this.limit; i > 1 ; i--) {
            if (isNormal(i)) {
                temp.add(i);
            }
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.addAll(temp);
        return result;
    }

    private boolean isNormal(int input) {
        boolean result = false;
        int twoOrMore = 0;
        for (int i = input; i > 0; i--) {
            if ((input%i) == 0) {
                twoOrMore++;
            }
        }
        if (twoOrMore < 3) {
            result = true;
        }
        return result;
    }
}
