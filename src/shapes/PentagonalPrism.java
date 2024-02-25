package shapes;
import java.lang.Math;

public class PentagonalPrism extends GeometricShape
{
    private double height;
    private double side;

    @Override
    public double calculateBaseArea() {
        return ( 5 * Math.pow(side, 2) * Math.tan(54) /4);
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
