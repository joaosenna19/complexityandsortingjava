package shapes;
import java.lang.Math;

public class Pyramid extends GeometricShape
{
    private double height;
    private double side;

    public Pyramid (double height, double side) {
    	this.height = height;
    	this.side = side;
    }

    @Override
    public double calculateBaseArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculateVolume() {
        return calculateBaseArea()*height*(0.333333333);
    }

    @Override
    public double getHeight() {
        return this.height;
    }

}
