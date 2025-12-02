
public class StringSerachDemo {
	private String [] data= {"Alfa","Romeo","Charlie","Beta","Frank","Indigo","Sean","Bea"};
	public void search(String query) {
		for (String str : data) {
			if(str.contains(query)) {
				System.out.println(str);
			}
		}

	}
	public static void main(String[] args) {
		StringSerachDemo demo=new StringSerachDemo();
		demo.search("an");
		demo.search("Be");
		demo.search("lie");
	}
}
