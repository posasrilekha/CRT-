import java.util.HashMap;
import java.util.Scanner;
public class ccm{
	public static void main(String[] args){
		HashMap<String,String>countryCapital=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		countryCapital.put("India","NewDelhi");
		countryCapital.put("USA","Washington D.C");
		countryCapital.put("Japan","Tokyo");
		countryCapital.put("France","Paris");
		System.out.println("Enter a country to find its capital:");
		String country=sc.nextLine();
		 if (countryCapital.containsKey(country)) {
			System.out.println("Capital of " + country + " is " + countryCapital.get(country));
        } else {
            System.out.println("Country not found in the list.");
        }

        sc.close();
    }
}
		
		