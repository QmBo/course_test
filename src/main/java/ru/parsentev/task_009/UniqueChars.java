package ru.parsentev.task_009;

import java.util.ArrayList;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class UniqueChars {
    private final String line;

    public UniqueChars(final String line) {
        this.line = line;
    }

    public int unique() {
        ArrayList<Character> unique = new ArrayList<Character>();
        for (char c : line.toCharArray()) {
            if (!(unique.contains(c))) {
                unique.add(c);
            }
        }
        return unique.size();
    }
}
