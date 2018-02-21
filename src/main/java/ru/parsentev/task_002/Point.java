package ru.parsentev.task_002;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Class Point defines a point in coordination system (x, y).
 * @author parsentev
 * @since 19.07.2016
 */
public class Point {
    private static final Logger log = getLogger(Point.class);

    private final int x;
    private final int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(final Point point) {
        int xDist = Math.abs(this.x - point.x);
        int yDist = Math.abs(this.y - point.y);
        double result = Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2));
        return result;
    }

//    public int getX() {
//        return this.x;
//    }
//
//    public int getY() {
//        return this.y;
//    }
}
