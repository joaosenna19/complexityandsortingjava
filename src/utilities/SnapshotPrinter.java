package utilities;
import shapes.GeometricShape;

public class SnapshotPrinter {
	
	 public static void printSnapshot(GeometricShape[] shapesArray, String comparisonType) {
	        System.out.println("Snapshot of the sorted array (First, Last, and every thousandth element):");

	        switch(comparisonType) {
	            case "v":
	                System.out.println("Volume of First Element: " + shapesArray[0].calculateVolume());
	                for(int i = 1; i < shapesArray.length; i++) {
	                    if(i % 1000 == 0) {
	                        System.out.println("Volume of element " + (i/1000) + "000 of the Array: " + shapesArray[i].calculateVolume());
	                    }
	                }
	                System.out.println("Volume of Last Element: " + shapesArray[shapesArray.length - 1].calculateVolume());
	                break;

	            case "a":
	                System.out.println("Base Area of First Element: " + shapesArray[0].calculateBaseArea());
	                for(int i = 1; i < shapesArray.length; i++) {
	                    if(i % 1000 == 0) {
	                        System.out.println("Base Area " + (i/1000) + "000 of the Array: " + shapesArray[i].calculateBaseArea());
	                    }
	                }
	                System.out.println("Base Area of Last Element: " + shapesArray[shapesArray.length - 1].calculateBaseArea());
	                break;

	            case "h":
	                System.out.println("Height of First Element: " + shapesArray[0].getHeight());
	                for(int i = 1; i < shapesArray.length; i++) {
	                    if(i % 1000 == 0) {
	                        System.out.println("Height of " + (i/1000) + "000 of the Array: " + shapesArray[i].getHeight());
	                    }
	                }
	                System.out.println("Height of Last Element: " + shapesArray[shapesArray.length - 1].getHeight());
	                break;

	            default:
	                System.out.println("Oh no something went wrong");
	        }
	    }
}
