import java.util.HashSet;
import java.util.Scanner;
public class StudentSet{
	public static void main(String[] args){
		HashSet<String>Students=new Hashst<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 student names:");
		for(int i=0;i<5;i++){
			String name=sc.nextLine();
			Students.add(name);
		}
		System.out.println("unique studentnames:"+Student);
	}
}
