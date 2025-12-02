
public class StringDemo {
	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Hello");
		String s3="Hello";
		
		System.out.println(s1);
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s3));
		
		s1=s1+"World";
		System.out.println(s1==s3);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(7));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='l') {
				System.out.println(i);
			}
		}
		
		String week="Sun-Mon-Tue-Wed-Thus-Fri-Sat";
		String [] days=week.split("-");
		System.out.println(days);
		for (String day : days) {
			System.out.println(day);
		}
	}

}
