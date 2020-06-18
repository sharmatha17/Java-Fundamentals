import java.util.*;
public class FlowControl5 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a>=65&&a<=90||a>=97&&a<=122)
			System.out.println("Alphabet");
		else if(Character.isDigit(a))
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}
}