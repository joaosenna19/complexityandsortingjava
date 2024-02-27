package appDomain;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
import shapes.

public class AppDriver
{

	public static void main( String[] args )
	{
		
		String fileName = "";
		String comparisonType = "";
		String sortingAlgorithm = "";
		
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
                     comparisonType = tValue;
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
		
		//Reading the file and creating the array of objects:
		try {
			//Creating a FileReader Object and then passing it into a BufferedReader object
			FileReader fileReader = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(fileReader);
			
			GeometricShape[] shapes = new GeometricShape[2];
			
		} 
		
		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
