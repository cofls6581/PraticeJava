class Show{
	public String country="";
	public Show(String country) {
		this.country=country;
	}
	public void pop() {
		System.out.println(country+"-pop");
	}
	public void sport() {
		System.out.println(country+"-sport");
	}
}

public class ThisInstanceApp {

	public static void main(String[] args) {
		
		Show s1=new Show("k");
		Show s2=new Show("j");
		s1.pop();
		s2.pop();
		s1.sport();
		s2.sport();
	}

}
