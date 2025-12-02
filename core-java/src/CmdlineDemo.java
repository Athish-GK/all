import static java.lang.Integer.*;
public class CmdlineDemo {
	public static void main(String[] args) {
		int total=0;
		for (String s : args) {
			total+=Integer.parseInt(s);
			System.out.println(s);
		}
		System.out.println("Total: "+total);
		
		int o=10;
		Integer iobj=o;
		int i=5;
		int x=iobj;
		System.out.println(i+iobj);
		
	}
	 
}
