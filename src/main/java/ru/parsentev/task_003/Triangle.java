package ru.parsentev.task_003;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Triangle {
    private static final Logger log = getLogger(Triangle.class);

    protected final Point first;
    protected final Point second;
    protected final Point third;

    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean exists() {
        boolean result = true;
        if (first.equals(second) || second.equals(third) || first.equals(third)) {
            result = false;
        }
        if (first.linCheck(second, third)) {
            result = false;
        }
        return result;
    }

    public double area() {
        if (this.exists()) {
            double p = (first.distanceTo(second) + first.distanceTo(third) + second.distanceTo(third)) / 2;
            double result = Math.sqrt(p * (p - first.distanceTo(second)) * (p - first.distanceTo(third)) * (p - second.distanceTo(third)));
            return Math.round(result);
        } else {
            throw new IllegalStateException();
        }
    }
}
