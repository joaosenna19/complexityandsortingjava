package shapes;

import java.util.Comparator;

public abstract class GeometricShape implements Comparable<GeometricShape> {
	
    public abstract double calculateBaseArea();

    public abstract double calculateVolume();

    public abstract double getHeight();
    
    
    @Override
    public int compareTo(GeometricShape shape) {
        int heightComparison = Double.compare(this.getHeight(), shape.getHeight());
        return heightComparison;
    }
}
