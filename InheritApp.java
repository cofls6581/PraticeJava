class Calculator1{
	int n1,n2;
	Calculator1(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	
	public int sum() {return this.n1+this.n2;}
	public int minus() {return this.n1-this.n2;}
}

class Calculator2 extends Calculator1{
	Calculator2(int n1,int n2){
		super(n1,n2);
	}
	public int minus(int n3) {
		return this.n1-this.n2-n3;
	}
}

public class InheritApp {

	public static void main(String[] args) {
		Calculator1 c1=new Calculator1(7,2);
		Calculator2 c2=new Calculator2(5,1);
		
		System.out.println(c1.sum());
		System.out.println(c2.sum());
		System.out.println(c2.minus());
		System.out.println(c2.minus(2));
	}

}
