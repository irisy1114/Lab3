package edu.wctc;

public class Triplet<T> {
    private T first;
    private T second;
    private T third;

    public Triplet(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public String GetFullString(String displayName, String delimiter) {
        return displayName + ":" + first + delimiter + second + delimiter + third;
    }

}
