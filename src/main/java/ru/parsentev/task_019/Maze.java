package ru.parsentev.task_019;

import org.slf4j.Logger;
import ru.parsentev.task_002.Point;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Maze {
    private static final Logger log = getLogger(Maze.class);

    private final int[][] values;
    private boolean[][] isCheck;
    private final int xLength;
    private final int yLength;
    private List<Point> result;
    private boolean trackDone = false;

    public Maze(final int[][] values) {
        this.values = values;
        this.xLength = values.length;
        this.yLength = values[0].length;
        this.isCheck = new boolean[this.xLength][this.yLength];
        for (int x = 0; x < this.xLength; x++) {
            for (int y = 0; y < this.yLength; y++) {
               this.isCheck[x][y] = false;
            }
        }
    }

    public List<Point> solution(Point start, Point finish) {
        this.result = new ArrayList<Point>();
        foundTrack(start.getX(), start.getY(), finish);
        ArrayList<Point> tmp = new ArrayList<Point>(result);
        this.trackDone = false;
        this.result.clear();
        this.isCheck[start.getX()][start.getY()] = false;
        this.isCheck[finish.getX()][finish.getY()] = false;
        foundTrack(start.getX(), start.getY(), finish);
        if (tmp.size() < this.result.size() || this.result.size() == 1) {
            this.result = new ArrayList<Point>(tmp);
        }
        return result;
    }

    private void foundTrack(int x, int y, Point finish) {
        if (!(this.trackDone)) {
            if (x > -1 && x < this.xLength && y > -1 && y < this.yLength){
                if (!(this.isCheck[x][y])) {
                    if (this.values[x][y] == 1){
                        this.isCheck[x][y] = true;
                        this.result.add(new Point(x, y));
                        if (new Point(x, y).equals(finish)){
                            this.trackDone = true;
                        }
                        foundTrack(x-1, y, finish);
                        foundTrack(x+1, y, finish);
                        foundTrack(x, y-1, finish);
                        foundTrack(x, y+1, finish);
                    }
                }
            }
        }
    }
}