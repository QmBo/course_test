package ru.parsentev.task_001;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author parsentev
 * @since 18.07.2016
 */
public class Calculator {
    private static final Logger log = getLogger(Calculator.class);
    private double result;

    public double getResult() {
        return result;
    }

    public void add(double first, double second) {
        this.result = first + second;
    }

    public void substract(double first, double second) {
        this.result = first - second;
    }

    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public void div (double first, double second) throws IllegalStateException {
        if (second == 0) {
            throw new IllegalStateException();
        } else {
            this.result = first / second;
        }
    }

    public void expand(double first, double second) {
        this.result = first;
        for (int i = 0; i < second; i++) {
            this.result *= first;
        }
    }
}
