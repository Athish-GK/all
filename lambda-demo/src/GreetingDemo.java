
public class GreetingDemo {
	public static void main(String[] args) {
		Greeting g1=()->"Happy Mansoon";
		System.out.println(g1.sayHello());
		
		Greeting g2=()->{
			String greet="Happy holidays";
			return greet;
		};
		System.out.println(g2.sayHello());
		g1.greet();
		Greeting.sayBye();
		g1.call();
	}
}
