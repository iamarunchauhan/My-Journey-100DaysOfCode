package RegularExpression;
import java.util.regex.*;

public class regexSolution {
	public static void main(String args[])
	{		
		Pattern pattern = Pattern.compile(".ru.");
		Matcher matcher = pattern.matcher("Arun");
		
		System.out.print("String matches the gives Regex - "+matcher.matches());
	}
}
