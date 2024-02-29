package utilities;
import java.util.Comparator;
import shapes.GeometricShape;

public class VolumeComparator implements Comparator<GeometricShape>{

	@Override
	public int compare(GeometricShape shapeOne, GeometricShape shapeTwo) {
		return Double.compare(shapeOne.calculateVolume(), shapeTwo.calculateVolume());
	}
}
