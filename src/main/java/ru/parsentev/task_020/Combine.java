package ru.parsentev.task_020;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Combine {
    private static final Logger log = getLogger(Combine.class);

    private final List<Integer> values;
    private List<List<Integer>> result;

    public Combine(final int[] values) {
        this.values = new ArrayList<Integer>();
        for (int i = 0; i < values.length; i++) {
            this.values.add(values[i]);
        }
    }

    public List<List<Integer>> generate() {
        result = new ArrayList<List<Integer>>();
        permute(this.values,0);
        return result;
    }

    private void permute(List<Integer> arr, int k){
        for(int i = k; i < arr.size(); i++){
            java.util.Collections.swap(arr, i, k);
            permute(arr, k+1);
            java.util.Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            List<Integer> temp = new ArrayList<Integer>(arr);
            this.result.add(temp);
        }
    }
}
