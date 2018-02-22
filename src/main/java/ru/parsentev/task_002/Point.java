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
        return Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2));
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        Point point = (Point) obj;
        if ((this.x == point.x) && (this.y == point.y)) {
            result = true;
        }
        return result;
    }

    public boolean linCheck(Point second, Point third) {
        boolean result = false;
        if ((this.x == second.x)&&(this.x == third.x) || (this.y == second.y)&&(this.y == third.y) ||
                (this.xEqualsY() && second.xEqualsY() && third.xEqualsY())) {
            result = true;
        }
        return result;
    }

    private boolean xEqualsY() {
        boolean result = false;
        if (this.x == this.y) {
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(this.x) + String.valueOf(this.y);
    }

    public boolean linCheckSquare(Point second, Point third, Point fourth) {
        boolean result = false;
        if ((this.x == second.x)&&(this.x == third.x) || (this.y == second.y)&&(this.y == third.y) ||
                (this.xEqualsY() && second.xEqualsY() && third.xEqualsY())) {
            result = true;
        }
        return result;
    }
}
