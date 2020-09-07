package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFromFile {
	public static void main(String[] args) {
		try {
			File myobj = new File("D:\\Documents\\filehandlingfile.txt"); //Enter path where file resides 
			Scanner myReader = new Scanner(myobj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} 
		catch(FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
