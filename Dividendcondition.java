
public class Dividendcondition {/*순이익계산*/

	public static void main(String[] args) {
		
		double Supply = 45641.0;
		double Vatrate = 0.1;
		double expense = 0.3;
		double Vat = Supply*Vatrate;
		double Sum = Supply+Vat;
		double exp = Supply*expense;
		double income = Supply-exp;
		double div1;
		double div2 ;
		
		if(income<2000.0) {
			 div1 = 1.0;
		     div2 = 0.0;
		}
		else {
			 div1 = 0.4;
		     div2 = 0.6;
		}
		
		System.out.println("value of supply: "+Supply);
		System.out.println("Vat: "+Vat);
		System.out.println("Sum :"+Sum);
		System.out.println("Expense: "+exp);
		System.out.println("Income: "+income);
		System.out.println("Dividend Kim: "+income*div1);
		System.out.println("Dividend Lee: "+income*div2);
	}

}
