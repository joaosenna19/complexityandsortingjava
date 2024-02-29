package shapes;

public class OctagonalPrism extends GeometricShape
{
    private double height;
    private double side;
    
    public OctagonalPrism (double height, double side) {
    	this.height = height;
    	this.side = side;
    }


    @Override
    public double calculateBaseArea() {
        return 2*(1 + Math.sqrt(2)) * Math.pow(side, 2);
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
