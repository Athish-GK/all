
interface Addition<T>{
	T sum(T a, T b);
}

interface OddEven{
	boolean isOdd(int n);
}

interface Maximum{
	int max(int a,int b);
}

public class MathDemo {
	public static void main(String[] args) {
		Addition<Integer> a1=(a,b)->a+b;
		System.out.println(a1.sum(10, 20));
		
		Addition<Double> a2=(a,b)->a+b;
		System.out.println(a2.sum(1.20, 1.50));
		
		OddEven oe=(x)->x%2!=0;
		System.out.println(oe.isOdd(4));
		System.out.println(oe.isOdd(7));
		
		Maximum m1=(a,b)->{
			if(a>b) {
				return a;
			}
			return b;
		};
		
		System.out.println(m1.max(2,5));
	}
}
