import java.util.ArrayList;
public class dup {
	
	public static void main(String[] args) {
		
		int number=1;
		String name="pineapple";
		String[] Arrstr=name.split("");
		ArrayList<String> letters=new ArrayList<>();
		for (String l : Arrstr) {
			letters.add(l);
		}
		
		System.out.println(letters.size());
		
		for(int i=0;i<letters.size();i++) {
			for(int j=i+1;j<letters.size();j++) {
				if(letters.indexOf(i)==letters.indexOf(j)) {
					number++;
					letters.remove(j);
					System.out.println(letters.indexOf(i)+": "+number);
				}
				number=1;
			}
		}
		

		
	}
	
}
//for(int i=0; i<name.length();i++) {
//for (int l=i+1;l<name.length();l++) {
//	if(name.charAt(i)==name.charAt(l)) {
//		number++;
//		System.out.println(name.charAt(i)+": "+number);
//	}
//}
//number=1;
//}