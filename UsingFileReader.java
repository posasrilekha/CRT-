import java.io.*;
public class UsingFileReader{
	public static void main(String[] args)throws IOException{
		FileWriter writer=new FileWriter("Output.txt");
		writer.write("Hello,JavaFileWriter!");
		writer.close();
		FileReader reader=new FileReader("Output.txt");
		int ch;
		while((ch=reader.read())!=-1){
			System.out.println((char)ch);
		}
		reader.close();
}
}
