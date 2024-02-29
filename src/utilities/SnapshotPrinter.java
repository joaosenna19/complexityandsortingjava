package utilities;
import shapes.GeometricShape;

public class SnapshotPrinter {
	
	 public static void printSnapshot(GeometricShape[] shapesArray, String comparisonType) {
	        System.out.println("Snapshot of the sorted array (First, Last, and every thousandth element):");

	        switch(comparisonType) {
	            case "v":
	            	double volumeOne = shapesArray[1].calculateVolume();
                	String formattedVolumeOne = String.format("%.2f", volumeOne);
	                System.out.println("Base Area of First Element: " + formattedVolumeOne);
	                for(int i = 1; i < shapesArray.length; i++) {
	                    if(i % 1000 == 0) {
	                    	double volume = shapesArray[i].calculateVolume();
	                    	String formattedVolume = String.format("%.2f", volume);
	                    	System.out.println("Volume of element " + (i/1000) + "000 of the Array: " + formattedVolume);
	                    }
	                }
	                double volume = shapesArray[shapesArray.length - 1].calculateVolume();
                	String formattedVolume = String.format("%.2f", volume);
	                System.out.println("Volume of Last Element: " + formattedVolume);
	                break;

	            case "a":
	            	double areaOne = shapesArray[1].calculateBaseArea();
                	String formattedAreaOne = String.format("%.2f", areaOne);
	                System.out.println("Base Area of First Element: " + formattedAreaOne);
	                for(int i = 1; i < shapesArray.length; i++) {
	                    if(i % 1000 == 0) {
	                    	double area = shapesArray[i].calculateBaseArea();
	                    	String formattedArea = String.format("%.2f", area);
	                    	System.out.println("Area of element " + (i/1000) + "000 of the Array: " + formattedArea);
	                    }
	                }
	                double area = shapesArray[shapesArray.length - 1].calculateBaseArea();
                	String formattedArea = String.format("%.2f", area);
	                System.out.println("Volume of Last Element: " + formattedArea);
	                break;

	            case "h":
	            	double heightOne = shapesArray[1].getHeight();
                	String formattedHeightOne = String.format("%.2f", heightOne);
	                System.out.println("Base Area of First Element: " + formattedHeightOne);
	                for(int i = 1; i < shapesArray.length; i++) {
	                    if(i % 1000 == 0) {
	                    	double height = shapesArray[i].getHeight();
	                    	String formattedHeight = String.format("%.2f", height);
	                    	System.out.println("Area of element " + (i/1000) + "000 of the Array: " + formattedHeight);
	                    }
	                }
	                double height = shapesArray[shapesArray.length - 1].getHeight();
                	String formattedHeight = String.format("%.2f", height);
	                System.out.println("Volume of Last Element: " + formattedHeight);
	                break;

	            default:
	                System.out.println("Oh no something went wrong");
	        }
	    }
}
