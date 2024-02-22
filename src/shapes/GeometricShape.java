package shapes;

import java.util.Comparator;

abstract class GeometricShape implements Comparator<GeometricShape>, Comparable<GeometricShape> {

    public abstract double calculateBaseArea();

    public abstract double calculateVolume();

    public abstract double getHeight();

    @Override
    public int compare(GeometricShape shapeOne, GeometricShape shapeTwo) {
        int areaComparison = Double.compare(shapeOne.calculateVolume(), shapeTwo.calculateVolume());
        return areaComparison;
    }

    @Override
    public int compareTo(GeometricShape shape) {
        int heightComparison = Double.compare(this.getHeight(), shape.getHeight());
        return heightComparison;
    }
}
