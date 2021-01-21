import java.io.FileWriter;
import java.io.IOException;


public class ReturnFileApp {

	public static void main(String[] args) throws IOException {
		String show=info("Kim","Nauen");
		System.out.println(show);
		FileWriter fw=new FileWriter("info.txt");
		fw.write(show);
		fw.close();
		System.out.println(info("Lee","taehyun"));

	}
	
	public static String info(String family,String middle) {
			String show="";
			show=show+family+"\n";
			show=show+middle+"\n";
			return show;
		}

}
