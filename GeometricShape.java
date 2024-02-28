package classes;

import java.util.Comparator;

public abstract class GeometricShape implements Comparator<GeometricShape>, Comparable<GeometricShape> {
	
    public abstract double calculateBaseArea();

    public abstract double calculateVolume();

    public abstract double getHeight();
    
    @Override
    public int compare(GeometricShape shapeOne, GeometricShape shapeTwo) {
    	
    	int compare = 0;
    	
    	switch(compareBy) {
    	// Will compare the objects by the area of their bases
    	case "a":
    	compare = Double.compare(shapeOne.calculateBaseArea(), shapeTwo.calculateBaseArea());
    	break;
    	
    	// Will compare the objects by their volumes
    	case "v": 
    	compare = Double.compare(shapeOne.calculateVolume(), shapeTwo.calculateVolume());
    	break;
    	}
    	
    	return compare;

    }

    @Override
    public int compareTo(GeometricShape shape) {
        int heightComparison = Double.compare(this.getHeight(), shape.getHeight());
        return heightComparison;
    }
}
