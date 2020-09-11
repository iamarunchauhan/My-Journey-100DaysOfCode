//Learning Set in Collection with this Example

package Collections;

import java.util.HashSet;
//import java.util.TreeSet;
import java.util.Iterator;


public class set {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		//TreeSet<String> ts = new TreeSet<>(); Data is Unordered but alphabetically sorted 
		
		//Data is not added in indexing approach
		//We got HashCode for elements which are being added
		
		hs.add("Arun");
		hs.add("Madhav");
		hs.add("Ananya");
		hs.add("Arun");
		hs.add("Arun");
		hs.add("Arun");
		hs.add("Arun");
		
		//Data is Unique, not duplicate
		//Unordered data in Output because of Hashing Technique
		
		System.out.println("My Set is - " +hs);
	
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
	}

}



