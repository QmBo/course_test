package ru.parsentev.task_017;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class CashMachine {
    private static final Logger log = getLogger(CashMachine.class);

    private final int[] values;

    public CashMachine(final int[] values) {
        this.values = values;
    }

    public List<List<Integer>> exchange(int note) {
        List<List<Integer>> resilt = new ArrayList<List<Integer>>();

        return resilt;
    }
}
