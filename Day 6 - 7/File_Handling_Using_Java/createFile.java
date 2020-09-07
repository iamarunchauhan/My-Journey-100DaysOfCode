package filehandling;

import java.io.File;
import java.io.IOException;

public class createFile {
	public static void main(String[] args) {
		try {
			File myobj = new File("D:\\Documents\\filehandlingfile.txt"); //Enter path where file resides
			if(myobj.createNewFile()) {
				System.out.println("File Created - " + myobj.getName());
			} else {
				System.out.println("File Already Exists");
			}
		} catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
