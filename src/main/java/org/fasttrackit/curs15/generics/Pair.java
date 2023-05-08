package org.fasttrackit.curs15.generics;

public class Pair<F extends Number, S extends Number> {
    private final F first;
    private final S secound;

    public Pair(F first, S secound) {
        this.first = first;
        this.secound = secound;
    }

    public F getFirst() {
        return first;
    }

    public S getSecound() {
        return secound;
    }
}
