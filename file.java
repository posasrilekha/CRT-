import java.io.File;
public class file{
	public static void main(String[] args){
        File myFile=new File("example.txt");
        if(myFile.exists()){
	        System.out.println("File exists:"+myFile.getName());
		}
		else{
			System.out.println("File doesn't exist.");
		}
	}
}
