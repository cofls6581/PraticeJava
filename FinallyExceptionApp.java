import java.io.FileWriter;
import java.io.IOException;

public class FinallyExceptionApp {

	public static void main(String[] args) {
		FileWriter f=null;
		try {
			f= new FileWriter("hello.txt");
			f.write("hello");
		}
		catch(IOException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		finally {
			if(f!=null) {
				try {
					f.close();
				}
				catch(IOException e) {
					System.out.println("error");
					e.printStackTrace();
				}
			}
		}
	}

}
