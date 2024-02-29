package shapes;
import java.lang.Math;

public class Cylinder extends GeometricShape
{

    private double height;
    private double radius;
    
    public Cylinder (double height, double radius) {
    	this.height = height;
    	this.radius = radius;
    }


    @Override
    public double calculateBaseArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        return calculateBaseArea()*height;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

}
