import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) {
		String path = "C:\\Users\\athigk\\eclipse-workspace\\file-io\\src\\Untitled 1";
		BufferedReader reader = null;
		String line = null;
		
		try {
			FileReader fr = new FileReader(path);
			// opening file stream
			// Wrapping buffer around it
			reader = new BufferedReader(fr);
			
			while(true) {
				line = reader.readLine();
				// Reads a line from buffer
				if(line == null)
				// EOF
				break;
				System.out.println(line);
			}
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
				reader.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		} 
		 
	}
}
