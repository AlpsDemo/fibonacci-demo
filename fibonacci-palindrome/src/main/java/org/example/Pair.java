package org.example;

/**
 *
 * @param <S>
 * @param <T>
 */
public interface Pair<S, T> {


    /**
     * Returns the first element of the Pair.
     *
     * @return first element
     */

    S getFirst();


    /**
     * Returns the second element of the Pair.
     *
     * @return second element
     */

    T getSecond();

    T get(S key);

    void put(S key, T newValue);

    int getSize();

    boolean isEmpty();
}
