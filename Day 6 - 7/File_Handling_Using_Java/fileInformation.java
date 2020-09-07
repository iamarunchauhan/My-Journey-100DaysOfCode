package filehandling;

import java.io.File;
import java.io.IOException;

public class fileInformation {
	public static void main(String[] args) {
		
		File myobj = new File("D:\\Documents\\filehandlingfile.txt"); //Enter path where file resides
		if(myobj.exists()) {
			System.out.println("File Name - " + myobj.getName());
			System.out.println("Absolute Path - " + myobj.getAbsolutePath());
			System.out.println("Writeable - " + myobj.canWrite());
			System.out.println("Readable - " + myobj.canRead());
			System.out.println("File Size in Bytes - " + myobj.length());
		} else {
			System.out.println("The file doesn't exists !");
		}
	
	}
}
