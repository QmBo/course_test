package ru.parsentev.task_017;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

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
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (note == values[0]) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(values[0]);
            result.add(list);
        } else {
            for (int i = values.length - 1; i >= 0; i--) {
                int tmp = note;
                if (tmp >= values[i]) {
                    int coin = tmp / values[i];
                    List<Integer> change = new ArrayList<Integer>();
                    for (int j = 0; j < coin; j++) {
                        change.add(values[i]);
                    }
                    result.add(change);
                    if (coin > 1 && values[i] != 1) {
                        List<Integer> subchange = new ArrayList<Integer>();
                        subchange.add(values[i]);
                        coin = (tmp - values[i]) / values[i - 1];
                        for (int j = 0; j < coin; j++) {
                            subchange.add(values[i - 1]);
                        }
                        result.add(subchange);
                    }
                }
            }
        }
        return result;
    }
}
