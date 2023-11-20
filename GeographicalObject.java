package io.github.ausf_software.ii.oooo;

public class GeographicalObject {
    private String name;
    private double latitude;
    private double longitude;
    private String continent;

    private final double equatorRadius = 6371.0;

    public GeographicalObject(String name, double latitude, double longitude, String continent) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getContinent() {
        return continent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getDistanceFrom(double latitude2, double longitude2) {
        return 2 * equatorRadius * Math.asin(Math.sqrt( Math.pow(Math.sin((latitude2 - latitude) / 2), 2) +
                Math.cos(latitude2) * Math.cos(latitude) * Math.pow(Math.sin((longitude2 - longitude) / 2), 2) ));
    }

    public double getDistanceFromEquator() {
        return getDistanceFrom(0, longitude);
    }

    public static String name(GeographicalObject o) {
        return o.getName();
    }

    public static Object name(Object o) {
        if (o instanceof GeographicalObject) return null;
        GeographicalObject cast = (GeographicalObject) o;
        return cast.getName();
    }

    @Override
    public String toString() {
        return "{"  + name + "; " + latitude +
                "; " + longitude +
                "; " + continent +
                '}';
    }
}