package shapes;

public class Tests {

	public static void main(String[] args) {
		Cone cone = new Cone(4,4);
		Cylinder cyl = new Cylinder(7,7);
		OctagonalPrism octpri = new OctagonalPrism(10,10);
		PentagonalPrism pentpri = new PentagonalPrism(3,3);
		Pyramid pyr = new Pyramid (9,9);
		SquarePrism sqpri = new SquarePrism(2,2);
		TriangularPrism tripri = new TriangularPrism(8,8);
		
		System.out.println(cone.getHeight() + " " + cone.calculateBaseArea() + " " + cone.calculateVolume());
		System.out.println(cyl.getHeight() + " " + cyl.calculateBaseArea() + " " + cyl.calculateVolume());
		System.out.println(octpri.getHeight() + " " + octpri.calculateBaseArea() + " " + octpri.calculateVolume());
		System.out.println(pentpri.getHeight() + " " + pentpri.calculateBaseArea() + " " + pentpri.calculateVolume());
		System.out.println(pyr.getHeight() + " " + pyr.calculateBaseArea() + " " + pyr.calculateVolume());
		System.out.println(sqpri.getHeight() + " " + sqpri.calculateBaseArea() + " " + sqpri.calculateVolume());
		System.out.println(tripri.getHeight() + " " + tripri.calculateBaseArea() + " " + tripri.calculateVolume());
	}
}
