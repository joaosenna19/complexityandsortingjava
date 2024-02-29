package shapes;
import java.lang.Math;

public class Cone extends GeometricShape {
    private double height;
    private double radius;
    
    public Cone (double height, double radius) {
    	this.height = height;
    	this.radius = radius;
    }

    @Override
    public double calculateBaseArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        return calculateBaseArea()*(0.3333333)*height;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

}
