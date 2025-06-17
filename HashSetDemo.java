import java.util.HashSet;
public class HashSetDemo{
	public static void main(String[] args){
		HashSet<Integer>intSet=new HashSet<>();
		intSet.add(10);
		intSet.add(20);
		intSet.add(10);
		System.out.println("Integerset:"+intSet);
		HashSet<String>StrSet=new HashSet<>();
		StrSet.add("Apple");
		StrSet.add("Banana");
		StrSet.add(null);
		StrSet.add("Apple");
		System.out.println("StringSet:"+StrSet);
	}
}
