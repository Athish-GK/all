import java.util.*;
 
public class QueueDemo {
 
	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<String>();
		
		que.offer("Apple");
		que.offer("Banana");
		que.offer("Cherrry");
		
		System.out.println(que.peek());//fetch value but doesn't remove
		
		while(!que.isEmpty())
			System.out.println(que.poll()); //fetch value and remove from queue
		
	}
}