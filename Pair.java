package io.github.ausf_software.ii;

public interface Pair {

    float getFirst();
    float getSecond();

    Pair sum(Pair a);
    Pair sub(Pair a);
    Pair div(Pair a);
    Pair mul(Pair a);

}
