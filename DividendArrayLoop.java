
public class DividendArrayLoop {/*순이익계산*/

	public static void main(String[] args) {
		
		double Supply = 1231341.0;
		double Vatrate = 0.1;
		double expense = 0.3;
		double Vat = Supply*Vatrate;
		double Sum = Supply+Vat;
		double exp = Supply*expense;
		double income = Supply-exp;
		double[] divrate=new double[3];
		divrate[0]=0.2;
		divrate[1]=0.3;
		divrate[2]=0.5;
		double div1=income*divrate[0];
		double div2=income*divrate[1];
		double div3=income*divrate[2];
		int i=0;
		
		System.out.println("value of supply: "+Supply);
		System.out.println("Vat: "+Vat);
		System.out.println("Sum :"+Sum);
		System.out.println("Expense: "+exp);
		System.out.println("Income: "+income);
		
		while(i<divrate.length) {
			System.out.println("Dividend"+(i+1)+ ": "+(income*divrate[i]));
			i=i+1;
		}
	}

}
