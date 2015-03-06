package org.lotus.edu;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Utility class to deal with Fibonacci numbers.
 */
public class FibonacciUtils {

    private FibonacciUtils() {
    }

    /**
     * Returns the sequence of Fibonacci numbers from 0 index to the provided inclusive boundary index.
     *
     * @param boundaryIndex - boundary index
     * @return list of Fibonacci numbers
     */
    public static List<Integer> f(int boundaryIndex) {
        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).mapToInt(t -> t[0])
                .limit(boundaryIndex + 1).boxed().collect(toList());
    }
}
