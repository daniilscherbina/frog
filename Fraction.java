package io.github.ausf_software.ii;

public class Fraction implements Pair {

    private float first;
    private float second;

    public Fraction(float first, float second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public float getFirst() {
        return first;
    }

    @Override
    public float getSecond() {
        return second;
    }

    @Override
    public Pair sum(Pair a) {
        if (!(a instanceof Fraction))
            throw new IllegalArgumentException("an object of the Fraction class is required");
        if (second == a.getSecond()) return new Fraction(first + a.getFirst(), second);
        return new Fraction(first * a.getSecond() + second * a.getFirst(), a.getSecond() * second);
    }

    @Override
    public Pair sub(Pair a) {
        if (!(a instanceof Fraction))
            throw new IllegalArgumentException("an object of the Fraction class is required");
        if (second == a.getSecond()) return new Fraction(first - a.getFirst(), second);
        return new Fraction(first * a.getSecond() - second * a.getFirst(), a.getSecond() * second);
    }

    @Override
    public Pair div(Pair a) {
        if (!(a instanceof Fraction))
            throw new IllegalArgumentException("an object of the Fraction class is required");
        return new Fraction(first * a.getSecond(), second * a.getFirst());
    }

    @Override
    public Pair mul(Pair a) {
        if (!(a instanceof Fraction))
            throw new IllegalArgumentException("an object of the Fraction class is required");
        return new Fraction(first * a.getFirst(), second * a.getSecond());
    }

    @Override
    public String toString() {
        return first + "/" + second;
    }
}
