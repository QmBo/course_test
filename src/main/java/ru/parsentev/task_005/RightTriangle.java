package ru.parsentev.task_005;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.*;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class RightTriangle extends Triangle {
    private static final Logger log = getLogger(RightTriangle.class);

    public RightTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        boolean result = super.exists();
        if (result) {
            if ((pow(this.ab, 2) + pow(this.bc, 2) == pow(this.ca, 2)) ||
                    (pow(this.ca, 2) + pow(this.bc, 2) == pow(this.ab, 2)) ||
                    (pow(this.ca, 2) + pow(this.ab, 2) == round(pow(this.bc, 2)))) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
