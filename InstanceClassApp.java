
class Info{
	public String name;
	public int number;
	public void print() {
		System.out.println(name+"  "+number);
	}
}

public class InstanceClassApp {

	public static void main(String[] args) {
		Info info1=new Info();
		info1.name="Kim";
		info1.number=1111;
		info1.print();
		
		Info info2=new Info();
		info2.name="Lee";
		info2.number=2222;
		info2.print();
		
		

	}

}
