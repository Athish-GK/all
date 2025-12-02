
public class StringRegEx {
	public static void main(String[] args) {
		String name="Athish";
		String nameExp="[A-Z][a-z]{3,}";
		System.out.println(name.matches(nameExp));
		
		String mobile="9876543210";
		String mobileExp="[6-9][0-9]{9}";
		System.out.println(mobile.matches(mobileExp));
		
		
		String email="athish@gmail.com";
		String emailExp="[a-z]{4,}[@][a-z]{3,}[.][a-z]{2,}";
		System.out.println(email.matches(emailExp));
		
		String fullName="Athish gk";
		String fullNameExp="[A-Z][a-z]{3,}[ ][a-z]{2,}";
		System.out.println(fullName.matches(fullNameExp));
	}
}
