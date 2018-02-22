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

    protected final double ab;
    protected final double bc;
    protected final double ca;
    protected boolean notATriangle;

    public Triangle(final Point first, final Point second, final Point third) {
        this.ab = first.distanceTo(second);
        this.bc = second.distanceTo(third);
        this.ca = third.distanceTo(first);
        if (!(notATriangle = first.linCheck(second, third))) {
            notATriangle = first.equals(second) || second.equals(third) || first.equals(third);
        }
    }

    public boolean exists() {
        boolean result = true;
        if (notATriangle) {
            result = false;
        }
        return result;
    }

    public double area() {
        if (this.exists()) {
            double p = (this.ab + this.bc + this.ca) / 2;
            double result = Math.sqrt(p * (p - this.ab) * (p - this.bc) * (p - this.ca));
            return Math.rint(result);
        } else {
            throw new IllegalStateException();
        }
    }
}
