package shapes;
import java.lang.Math;

public class Cone extends GeometricShape {
    private double height;
    private double radius;

    @Override
    public double calculateBaseArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        return calculateBaseArea()*(1/3)*height;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

}
