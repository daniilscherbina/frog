package io.github.ausf_software.ii.oooo;

import java.util.List;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class GeographicalPool {

    private List<GeographicalObject> objects;

    public GeographicalPool() {
        objects = new ArrayList<>();
    }

    public void add(GeographicalObject a) {
        objects.add(a);
    }

    public void delete(GeographicalObject a) {
        objects.remove(a);
    }

    public List<GeographicalObject> getSortByName() {
        return objects.stream()
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .collect(Collectors.toList());
    }

    public List<GeographicalObject> getSortByContinent() {
        return objects.stream()
                .sorted((a, b) -> a.getContinent().compareTo(b.getContinent()))
                .collect(Collectors.toList());
    }

    public List<GeographicalObject> getSortByDistanceFromEquator() {
        return objects.stream()
                .sorted((a, b) -> new Double(a.getDistanceFromEquator())
                        .compareTo(b.getDistanceFromEquator()))
                .collect(Collectors.toList());
    }

    public List<GeographicalObject> searchByName(String value) {
        return objects.stream()
                .filter((a) -> a.getName().equals(value)).collect(Collectors.toList());
    }

    public List<GeographicalObject> searchByContinent(String value) {
        return objects.stream()
                .filter((a) -> a.getContinent().equals(value)).collect(Collectors.toList());
    }

    public List<GeographicalObject> searchByDistanceFromEquator(double value) {
        return objects.stream()
                .filter((a) -> a.getDistanceFromEquator() == value).collect(Collectors.toList());
    }

}
