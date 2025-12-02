
public class Emailvalidator {
	public static void main(String[] args) {
		String email="athi@ema.co";
		
		int atcount=0;
		int dotcount=0;
		
		for (int i=0;i<email.length();i++) {
			if(email.charAt(i)=='@') {
				atcount++;
			}
			else if(email.charAt(i)=='.') {
				dotcount++;
			}
		}
		
		int atindex=email.indexOf('@');
		int dotindex=email.indexOf('.');
		
		if (atcount!=1 || dotcount!=1) {
			System.out.println("Invalide");
		}
		
		else if(dotindex<atindex) {
			System.out.println("Invalid");
		}
		else if(atindex<4) {
			System.out.println("Invalid");
		}
		else if((dotindex-atindex)<4) {
			System.out.println("Invalid");
		}
		else if((email.length()-dotindex)<3) {
			System.out.println("Invalid");
		}
		else {
			System.out.println("Valid");
		}
	}
}
