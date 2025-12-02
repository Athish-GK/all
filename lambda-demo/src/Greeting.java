
public interface Greeting  {
	String sayHello();
	
	default void greet() {
		System.out.println("Howdy?");
	}
	
	default void call() {
		System.out.println(msg());
	}
	
	static void sayBye() {
		System.out.println("Good bye");
	}
	
	private String msg() {
		return "Whatup?";
	}
}
