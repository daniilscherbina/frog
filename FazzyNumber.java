package io.github.ausf_software.ii;

public class FazzyNumber implements Pair {

    private float a1;
    private float x;
    private float a2;

    public FazzyNumber(float e1, float x, float e2) {
        this.a1 = x - e1;
        this.x = x;
        this.a2 = x + e2;
    }

    @Override
    public float getFirst() {
        return a1;
    }

    @Override
    public float getSecond() {
        return a2;
    }

    public float getX() {
        return x;
    }

    @Override
    public Pair sum(Pair a) {
        if (!(a instanceof FazzyNumber))
            throw new IllegalArgumentException("an object of the FazzyNumber class is required");
        FazzyNumber arg = (FazzyNumber) a;
        return new FazzyNumber(a1 + arg.getFirst(), x + arg.getX(), a2 + arg.getSecond());
    }

    @Override
    public Pair sub(Pair a) {
        if (!(a instanceof FazzyNumber))
            throw new IllegalArgumentException("an object of the FazzyNumber class is required");
        FazzyNumber arg = (FazzyNumber) a;
        return new FazzyNumber(a1 + arg.getFirst(), x - arg.getX(), a2 + arg.getSecond());
    }

    @Override
    public Pair div(Pair a) {
        if (!(a instanceof FazzyNumber))
            throw new IllegalArgumentException("an object of the FazzyNumber class is required");
        FazzyNumber arg = (FazzyNumber) a;
        return new FazzyNumber((x - a1) / (arg.getX() + arg.getSecond()), x / arg.getX(),
                (x + a2) / (arg.getX() - arg.getFirst()));
    }

    @Override
    public Pair mul(Pair a) {
        if (!(a instanceof FazzyNumber))
            throw new IllegalArgumentException("an object of the FazzyNumber class is required");
        FazzyNumber arg = (FazzyNumber) a;
        return new FazzyNumber(arg.getX() * a1 + x * arg.getFirst() - arg.getFirst() * a1,
                x * arg.getX(), arg.getX() * a2 + x * arg.getSecond() + arg.getSecond() * a2);
    }

    @Override
    public String toString() {
        return "[" + a1 + ", " + x + ", " + a2 + "]";
    }
}
