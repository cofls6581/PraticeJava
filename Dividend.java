
public class Dividend {/*순이익계산*/

	public static void main(String[] args) {
		
		double Supply = Double.parseDouble(args[0]);
		double Vatrate = 0.1;
		double expense = 0.3;
		double Vat = Supply*Vatrate;
		double Sum = Supply+Vat;
		double exp = Supply*expense;
		double income = Supply-exp;
		double div1 = 0.4;
		double div2 = 0.6;
		
		System.out.println("value of supply: "+Supply);
		System.out.println("Vat: "+Vat);
		System.out.println("Sum :"+Sum);
		System.out.println("Expense: "+exp);
		System.out.println("Income: "+income);
		System.out.println("Dividend Kim: "+income*div1);
		System.out.println("Dividend Lee: "+income*div2);
	}

}
