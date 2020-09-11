//Learning List in Collection with this Example

package Collections;

import java.util.ArrayList;

class Student {
	int rollno;
	String name;
}

public class List {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(); //type specific
		
		list1.add("Arun Chauhan"); //0
		list1.add("Rahul"); //1
		list1.add("Sourabh Jain"); //2
		
		ArrayList list2 = new ArrayList(); //any type of data
		
		Student s1 = new Student();
		s1.rollno = 07;
		s1.name = "Arun Chauhan";
		
		list2.add("#100DaysOfCode");
		list2.add(10);
		list2.add(s1);
		
		System.out.println("The List 1 is - " +list1);
		System.out.println("The List 2 is - " +list2);
		
		//Get elements from list
		
		String name = list1.get(0);
		System.out.println("My Name is: " +name);
		
		Object o = list2.get(1);
		System.out.println("O is: "+o);
		
		list1.set(1, "Github");
		System.out.println("Updated list1 is: "+list1);
		
		list1.remove(1);
		System.out.println("List1 after removal is: "+list1);
		
		if(list1.contains("Arun Chauhan")) {
			System.out.println("Arun Chauhan is in the list !");
		}
		
		//Enhanced For-Loop
		System.out.println("-----------------------------------");
		
		for(String str: list1)
			System.out.println(str);
		
		
		
	}
}
