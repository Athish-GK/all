import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryReadDemo {
	public static void main(String[] args) {
		String path = "C:\\Users\\athigk\\eclipse-workspace\\file-io\\src\\Untitled 1";
		
		FileInputStream istream = null;
		
		try {
			istream = new FileInputStream(path);
			/*int ch = 0;
			while (true) {
				ch = istream.read();
				if (ch == -1) {
					break;
				}
				System.out.println((char)ch);
;			}*/
			
			byte[] content = new byte[istream.available()];
			istream.read(content);
			System.out.println(new String(content));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
 
	}
}
