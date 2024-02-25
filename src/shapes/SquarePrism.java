package shapes;
import java.lang.Math;

public class SquarePrism extends GeometricShape
{

    private double height;
    private double side;

    @Override
    public double calculateBaseArea() {
        return Math.pow(side, 2);
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
