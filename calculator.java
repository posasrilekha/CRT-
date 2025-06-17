import java.io.*;
import java.util.*;
class calculator
{
	public static void main(String []arr)
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		char c=in.next().charAt(0);
		switch(c){
			case '+':
			    System.out.println(a+b);
				break;
			case '-':
			    System.out.println(a-b);
				break;
			case '*':
			    System.out.println(a*b);
				break;
			case '/':
			    System.out.println(a/b);
				break;
			default:
			    System.out.println("Enter valid operator");
		}
	}
}


			
		