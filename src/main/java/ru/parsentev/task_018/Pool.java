package ru.parsentev.task_018;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Pool {
    private static final Logger log = getLogger(Pool.class);

    private final int[][] values;
    private boolean[][] check;
    private final int xLimit;
    private final int yLimit;
    private int temp = 0;

    public Pool(final int[][] values) {
        this.values = values;
        this.xLimit = values.length - 1;
        this.yLimit = values[0].length - 1;
        this.check = new boolean[values.length][values.length];
        for (int x = 0; x <= this.xLimit; x++) {
            for (int y = 0; y <= this.yLimit; y++) {
                this.check[x][y] = false;
            }
        }

    }

    public int maxUnion() {
        int result = 0;
        masterCheck(0,0);
        if (this.temp > result) {
            result = temp;
        }
        return result;
    }

    private void masterCheck(int x, int y) {
        if (x > -1 && x <= this.xLimit && y > -1 && y <= this.yLimit) {
            if (!(this.check[x][y])){
                if (this.values[x][y] == 1){
                    this.temp +=1;
                    this.check[x][y] = true;
                    masterCheck(x,y+1);
                    masterCheck(x,y-1);
                    masterCheck(x+1,y);
                    masterCheck(x-1,y);
                }
            }
        }
    }
}
