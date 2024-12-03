package Implementations.GPS;
/*
    Author: Vince Aivan P. Rumalay
    Section: BSCS2A
    Institution: Centro Escolar University
    Date Created: November 29 - December 3, 2023
*/
public class Route {
    LocationPoint start;
    LocationPoint destination;
    public Route() {}
    public void addPoint(String name, double longitude, double latitude, String desc, double distance) {
        LocationPoint newPoint = new LocationPoint(name, longitude, latitude, desc, distance);
        if (start == null) {
            start = newPoint;
        } else {
            LocationPoint traverser = start;
            while (traverser.next != null) {
                traverser = traverser.next;
            }
            traverser.next = newPoint;
            traverser.next.prev = traverser;
            traverser.next.calculatePrevDistance();
            destination = newPoint;
        }
    }

    public void displayRouteForwards() {
        System.out.println("[Route from: " + start.name + " to " + destination.name + "]");
        LocationPoint traverser = start;
        while (traverser != null) {
            System.out.println("Point Name: " + traverser.name);
            System.out.println("Longitude: " + traverser.longitude);
            System.out.println("Latitude: " + traverser.latitude);
            System.out.println("Distance from Previous Point: " + traverser.distanceToPrev);
            System.out.println("------");
            traverser = traverser.next;
        }
    }

    public void displayRouteBackwards() {
        System.out.println("[Route from: " + destination.name + " to " + start.name + "]");
        LocationPoint traverser = destination;
        while (traverser != null) {
            System.out.println("Point Name: " + traverser.name);
            System.out.println("Longitude: " + traverser.longitude);
            System.out.println("Latitude: " + traverser.latitude);
            System.out.println("Distance from Previous Point: " + traverser.distanceToPrev);
            System.out.println("------");
            traverser = traverser.prev;
        }
    }
}

class LocationPoint {
    String name;
    double longitude;
    double latitude;
    String description;
    double distance;
    double distanceToPrev;
    LocationPoint next;
    LocationPoint prev;
    public LocationPoint() {}
    public LocationPoint(String name, double x, double y, String desc, double distance) {
        this.name = name;
        this.longitude = x;
        this.latitude = y;
        this.description = desc;
        this.distance = distance;
        next = prev = null;
    }
    public void calculatePrevDistance() {
        if (prev != null) {
            this.distanceToPrev = distance - prev.distance;
        } else {
            this.distanceToPrev = 0;
        }
    }
}