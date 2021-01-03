package org.itstep.step02;

public class Pair<One,Two>
{
    private final One oneElement;
    private final Two twoElement;

    public Pair(One oneElement, Two twoElement) {
        this.oneElement = oneElement;
        this.twoElement = twoElement;
    }

    public One getFirst() {
        return oneElement;
    }

    public Two getSecond() {
        return twoElement;
    }

}
