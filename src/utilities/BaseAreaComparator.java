package utilities;
import java.util.Comparator;
import shapes.GeometricShape;

public class BaseAreaComparator implements Comparator<GeometricShape>{

	@Override
	public int compare(GeometricShape shapeOne, GeometricShape shapeTwo) {
		return Double.compare(shapeOne.calculateBaseArea(), shapeTwo.calculateBaseArea());
	}

}
