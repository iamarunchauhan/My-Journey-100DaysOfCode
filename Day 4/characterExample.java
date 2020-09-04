package RegularExpression;

import java.util.regex.*;

public class characterExample {
	public static void main(String args[])
	{
		System.out.println(Pattern.matches("[xyz]", "mnop"));
		System.out.println(Pattern.matches("[xyz]", "x"));
		System.out.println(Pattern.matches("[xyz]", "xxyyyyz"));
	}
}
