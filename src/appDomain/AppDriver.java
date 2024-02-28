package appDomain;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import sorting.*;
import utilities.*;
import shapes.*;

public class AppDriver
{

	public static void main( String[] args ) throws FileNotFoundException
	{
		
		String fileName = "";
		String userInputComparisonType = "";
		String sortingAlgorithm = "";
		
		Comparator<GeometricShape> comparisonType = null;
		boolean compareByHeight = true;
		
		long algStartTime;
 		long algEndTime;
		
		//Evaluating user input args:
		if (args.length !=3) {
			System.out.println("Number of arguments has to be exactly 3. Correct usage: java -jar Sort.jar -ffile_name -tv -sb");
		}
		
		for(int i = 0; i < args.length; i++) {
			//gets first char after the dash and converts it to lowercase
			String identifier = String.valueOf(args[i].charAt(1)).toLowerCase();
			
			switch(identifier) {
			case "f":
				//Looping through the argument and adding each character to the fileName string.
				for(int j = 2; j < args[i].length(); j++) {
					String character = String.valueOf(args[i].charAt(j));
					fileName = fileName + character;
				}
				break;
				
			case "t":
				String tValue = String.valueOf(args[i].charAt(2)).toLowerCase();
				 if (tValue.equals("v") || tValue.equals("h") || tValue.equals("a")) {
					 userInputComparisonType = tValue;
                 } else {
                     System.out.println("Invalid comparison type specified.");
                     return;
                 }
				 break;
				
			case "s":
				String sValue = String.valueOf(args[i].charAt(2)).toLowerCase();
				if (sValue.equals("b") || sValue.equals("s") || sValue.equals("i") ||
						sValue.equals("m") || sValue.equals("q") || sValue.equals("z")) {
                    sortingAlgorithm = sValue;
                } else {
                    System.out.println("Invalid sorting algorithm specified.");
                    return;
                }
                break;
                
			default:
				System.out.println("This program must take -s, -t and -f as flags.");
			}
		}
		
        try {
        	 // File path is passed as parameter
            File file = new File(fileName);
     
            // Creating an object of BufferedReader class
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
     
            // Declaring a string variable
            String line;
            
        	GeometricShape[] shapesArray = new GeometricShape[Integer.parseInt(reader.readLine())];
        	 for (int lineNumber = 1; (line = reader.readLine()) != null; lineNumber++) {
                	 String[] explodedLine = line.split(" ");
                	 String typeOfShape = explodedLine[0];
                	 
                	 switch(typeOfShape) {
                	 case "Cone":
                		 Cone cone = new Cone(Double.parseDouble(explodedLine[1]), Double.parseDouble(explodedLine[2]));
                		 shapesArray[lineNumber-1] = cone;
                		 break;
                	 case "Cylinder":
                		 Cylinder cylinder = new Cylinder(Double.parseDouble(explodedLine[1]), Double.parseDouble(explodedLine[2]));
                		 shapesArray[lineNumber-1] = cylinder;
                		 break;
                	 case "OctagonalPrism":
                		 OctagonalPrism octagonalPrism = new OctagonalPrism(Double.parseDouble(explodedLine[1]), Double.parseDouble(explodedLine[2]));
                		 shapesArray[lineNumber-1] = octagonalPrism;
                		 break;
                	 case "PentagonalPrism":
                		 PentagonalPrism pentagonalPrism = new PentagonalPrism(Double.parseDouble(explodedLine[1]), Double.parseDouble(explodedLine[2]));
                		 shapesArray[lineNumber-1] = pentagonalPrism;
                		 break;
                	 case "Pyramid":
                		 Pyramid pyramid = new Pyramid(Double.parseDouble(explodedLine[1]), Double.parseDouble(explodedLine[2]));
                		 shapesArray[lineNumber-1] = pyramid;
                		 break;
                	 case "SquarePrism":
                		 SquarePrism squarePrism = new SquarePrism(Double.parseDouble(explodedLine[1]), Double.parseDouble(explodedLine[2]));
                		 shapesArray[lineNumber-1] = squarePrism;
                		 break;
                	 case "TriangularPrism":
                		 TriangularPrism triangularPrism = new TriangularPrism(Double.parseDouble(explodedLine[1]), Double.parseDouble(explodedLine[2]));
                		 shapesArray[lineNumber-1] = triangularPrism;
                		 break;
                		 default:
                			 System.out.println("Ops something went wrong with creating your object");
                	 }
                 }
        	 
        	//comparing according to user input
     		switch(userInputComparisonType) {
     		case "v":
     			comparisonType = new VolumeComparator();
     			compareByHeight = false;
     			break;
     		case "a":
     			comparisonType = new BaseAreaComparator();
     			compareByHeight = false;
     			break;
     		case "h":
     			break;
     		default:
     			System.out.println("Oh no something went wrong");
     		}
     		
     		//Recording current time BEFORE the sorting algorithm ran
     		algStartTime = System.currentTimeMillis();
     		
     		//sorting according to user input
     		switch(sortingAlgorithm) {
     			
     		case "b":
     			if (compareByHeight) {
     	            BubbleSort.bubbleSort(shapesArray);
     	        } else {
     	            BubbleSort.bubbleSort(shapesArray, comparisonType);
     	        }
         		// Recording current time AFTER the sorting algorithm ran
         		algEndTime = System.currentTimeMillis();
         		// Printing time spent
         		System.out.println("Time spent to sort the Array is: " + (algEndTime - algStartTime) + " miliseconds!");
     			
     			break;
     		case "s":
     			if (compareByHeight) {
     	            SelectionSort.selectionSort(shapesArray);
     	        } else {
     	        	SelectionSort.selectionSort(shapesArray, comparisonType);
     	        }
         		// Recording current time AFTER the sorting algorithm ran
         		algEndTime = System.currentTimeMillis();
         		// Printing time spent
         		System.out.println("Time spent to sort the Array is: " + (algEndTime - algStartTime) + " miliseconds!");
     			
     			break;
     		case "i":
     			if (compareByHeight) {
     	            InsertionSort.insertionSort(shapesArray);
     	        } else {
     	        	InsertionSort.insertionSort(shapesArray, comparisonType);
     	        }
         		// Recording current time AFTER the sorting algorithm ran
         		algEndTime = System.currentTimeMillis();
         		// Printing time spent
         		System.out.println("Time spent to sort the Array is: " + (algEndTime - algStartTime) + " miliseconds!");
     			
     			break;
     		case "m":
     			if (compareByHeight) {
     	            MergeSort.mergeSort(shapesArray);
     	        } else {
     	        	MergeSort.mergeSort(shapesArray, comparisonType);
     	        }
         		// Recording current time AFTER the sorting algorithm ran
         		algEndTime = System.currentTimeMillis();
         		// Printing time spent
         		System.out.println("Time spent to sort the Array is: " + (algEndTime - algStartTime) + " miliseconds!");
         		
         		SnapshotPrinter.printSnapshot(shapesArray, userInputComparisonType);
     			
     			break;
     		case "q":
     			if (compareByHeight) {
     				System.out.println("Faltou implementar quickSort aqui");
     	        } else {
     	        	System.out.println("Faltou implementar quickSort aqui");
     	        }
         		// Recording current time AFTER the sorting algorithm ran
         		algEndTime = System.currentTimeMillis();
         		// Printing time spent
         		System.out.println("Time spent to sort the Array is: " + (algEndTime - algStartTime) + " miliseconds!");
     			
     			break;
     		case "z":
     			if (compareByHeight) {
     	            HeapSort.heapSort(shapesArray);
     	        } else {
     	            HeapSort.heapSort(shapesArray, comparisonType);
     	        }
         		// Recording current time AFTER the sorting algorithm ran
         		algEndTime = System.currentTimeMillis();
         		// Printing time spent
         		System.out.println("Time spent to sort the Array is: " + (algEndTime - algStartTime) + " miliseconds!");
         		
     			break;
     		}
     		
        	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void displayElements() {
		// TODO Auto-generated method stub
		
	}
}
