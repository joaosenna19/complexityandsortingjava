package shapes;
import java.lang.Math;

public class Pyramid extends GeometricShape
{
    private double height;
    private double side;


    @Override
    public double calculateBaseArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculateVolume() {
        return calculateBaseArea()*height*(1/3);
    }

    @Override
    public double getHeight() {
        return this.height;
    }

}
