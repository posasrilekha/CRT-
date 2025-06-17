import java.io.*;
public class FileDemo{
	public static void main(String[] args){
		try{
			BufferedWriter writer=new BufferedWriter(new FileWriter("Students.txt"));
			writer.write("Alice\nBob\nCharlie");
			writer.close();
			BufferedReader reader=new BufferedReader(new FileReader("Students.txt"));
			String line;
			System.out.println("Student Names:");
			while((line=reader.readLine())!=null){
				System.out.println(line);
			}
			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

