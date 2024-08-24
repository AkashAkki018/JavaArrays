import java.util.*;
public class Charshifter
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String a=sc.nextLine();
		int n=sc.nextInt();
		char b;
		String r="";
	    for(int i=0;i<a.length();i++)
	    {
	        b=a.charAt(i);
	        r=r+  (char)(((int)b)+n);
	    }
	    System.out.println(r);
	    
	}
}