package ru.parsentev.task_006;

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
public class Square {
    private static final Logger log = getLogger(Square.class);

    private final double first;
    private final double second;
    private final double third;
    private final double fourth;
    private boolean isSquare;

    public Square(final Point first, final Point second, final Point third, final Point fourth) {
        this.first = first.distanceTo(second);
        this.second = second.distanceTo(third);
        this.third = third.distanceTo(fourth);
        this.fourth = fourth.distanceTo(first);
        if (isSquare = first.linCheckSquare(second, third, fourth)) {
            isSquare = first.equals(second) || second.equals(third) || first.equals(third);
        }

    }

    public boolean exists() {
        throw new UnsupportedOperationException();
    }
}
