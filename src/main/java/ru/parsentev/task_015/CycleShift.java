package ru.parsentev.task_015;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class CycleShift {
    private static final Logger log = getLogger(CycleShift.class);

    private final int[] values;

    public CycleShift(final int[] values) {
        this.values = values;
    }

    public int[] shift(int position) {
        if (this.values.length > 1) {
            goRight(position);
        }
        return this.values;
    }
    private void goRight(int tims) {
        for (int j = 0; j < tims; j++) {
            int temp = this.values[this.values.length - 1];
            for (int i = this.values.length - 1; i > 0; i--) {
                this.values[i] = this.values[i - 1];
            }
            this.values[0] = temp;
        }
    }
}
