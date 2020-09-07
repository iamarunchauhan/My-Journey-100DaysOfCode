package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class writeToFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("D:\\Documents\\filehandlingfile.txt"); //Enter path where file resides
			myWriter.write("Today's Topic is File Handling in Java !");
			myWriter.close();
			System.out.println("Successfully wrote to the file !");
		} 
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
