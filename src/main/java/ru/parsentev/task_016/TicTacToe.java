package ru.parsentev.task_016;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class TicTacToe {
    private static final Logger log = getLogger(TicTacToe.class);

    private final int[][] values;

    public TicTacToe(final int[][] values) {
        this.values = values;
    }

    public boolean hasWinner() {
        boolean result = false;
        int[] toSend = new int[3];
        for (int i = 0; i < 3; i++) {
            toSend = this.values[i];
            if (exists(toSend)) {
                result = true;
            }
        }
        for (int out = 0; out < 3; out++) {
            toSend = new int[3];
            for (int in = 0; in < 3; in++) {
                toSend[in] = this.values[in][out];
            }
            if (exists(toSend)) {
                result = true;
            }
        }
        toSend = new int[3];
        for (int in = 0; in < 3; in++) {
            toSend[in] = this.values[in][in];
        }
        if (exists(toSend)) {
            result = true;
        }
        toSend = new int[3];
        int out = 2;
            for (int in = 0; in < 3; in++) {
                toSend[in] = this.values[in][out];
                out--;
            }
        if (exists(toSend)) {
            result = true;
        }
        return result;
    }

    public boolean exists(int[] expect) {
        boolean result = false;
        for (int validate : expect) {
            if (validate != expect[0]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
