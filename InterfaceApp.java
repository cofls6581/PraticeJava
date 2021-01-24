
interface CircleArea{
	double PI=3.14;
	double area(double r);
}

interface PrintArea{
	void print(double r);
}

class Cal implements CircleArea,PrintArea{
	
	public double area(double r) {
		return PI*r*r;
	}
	
	public void print(double r) {
		System.out.printf("%f", PI*r*r);
	}
}

public class InterfaceApp {

	public static void main(String[] args) {
		
		CircleArea c= new Cal();
		System.out.println(c.area(2.5));

	}

}
