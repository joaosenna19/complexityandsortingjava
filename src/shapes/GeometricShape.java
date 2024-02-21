package shapes;

import java.util.Comparator;

abstract class GeometricShape implements Comparator<GeometricShape> {

    public abstract double calculateBaseArea();

    public abstract double calculateVolume();

    public abstract double getHeight();

    @Override
    public int compare(GeometricShape shapeOne, GeometricShape shapeTwo) {
        int areaComparison = Double.compare(shapeOne.calculateVolume(), shapeTwo.calculateVolume());
        return areaComparison;
    }

    public int compareTo(GeometricShape shapeOne, GeometricShape shapeTwo) {
        double heightDifference = shapeOne.getHeight() - shapeTwo.getHeight();

        if (heightDifference != 0) {
            return heightDifference > 0 ? 1 : -1;
        } else {
            return 0;
        }
    }
}
