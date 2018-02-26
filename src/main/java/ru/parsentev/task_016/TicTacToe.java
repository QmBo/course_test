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
        boolean isAWinner = false;
        int[] toSend = new int[3];
        for (int i = 0; i < 3; i++) {
            toSend = this.values[i];
            if (exists(toSend)) {
                isAWinner = true;
            }
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                toSend[i] = this.values[i][j];
            }
            if (exists(toSend)) {
                isAWinner = true;
            }
        }
        for (int i = 0; i < 3; i++) {
            toSend[i] = this.values[i][i];
        }
        if (exists(toSend)) {
            isAWinner = true;
        }
        for (int j = 2; j >= 0; j--) {
            for (int i = 0; i < 3; i++) {
                toSend[i] = this.values[i][j];
            }
        }
        if (exists(toSend)) {
            isAWinner = true;
        }
        return isAWinner;
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
