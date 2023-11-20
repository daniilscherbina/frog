package io.github.ausf_software.ii.oooo;

import java.util.List;

public class GeographicalPoolDemo {
    public static void main(String[] args) {
        GeographicalPool pool = new GeographicalPool();

        GeographicalObject obj1 = new GeographicalObject("Object 1", 40.7128,
                -74.0060, "North " + "America");
        GeographicalObject obj2 = new GeographicalObject("Object 2", 51.5074,
                -0.1278, "Europe");
        GeographicalObject obj3 = new GeographicalObject("Object 3", -33.8651,
                151.2099, "Australia");
        GeographicalObject obj4 = new GeographicalObject("Object 4", -33.8651,
                151.2099, "Europe");


        pool.add(obj3);
        pool.add(obj1);
        pool.add(obj4);
        pool.add(obj2);


        List<GeographicalObject> sortedByName = pool.getSortByName();
        System.out.println("Objects sorted by name:");
        System.out.println(sortedByName);

        List<GeographicalObject> sortedByContinent = pool.getSortByContinent();
        System.out.println("Objects sorted by continent:");
        System.out.println(sortedByContinent);

        List<GeographicalObject> sortedByDistance = pool.getSortByDistanceFromEquator();
        System.out.println("Objects sorted by distance from the equator:");
        System.out.println(sortedByDistance);

        List<GeographicalObject> searchByName = pool.searchByName("Object 1");
        System.out.println("Objects with name 'Object 1':");
        System.out.println(searchByName);

        List<GeographicalObject> searchByContinent = pool.searchByContinent("Europe");
        System.out.println("Objects in Europe:");
        System.out.println(searchByContinent);

        List<GeographicalObject> searchByDistance = pool.searchByDistanceFromEquator(0);
        System.out.println("Objects with distance from the equator 0:");
        System.out.println(searchByDistance);
    }
}
