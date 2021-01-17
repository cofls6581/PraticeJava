
public class DividendMethod {/*순이익계산*/
	private static double Supply;
    private static double vatrate;
	private static double expense;
	public static void main(String[] args) {
		
		Supply = 123545.0;
		vatrate = 0.1;
		expense = 0.3;
		double Vat = getvat();
		double Sum = extracted();
		double exp = getexp();
		double income = getincome();
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

	private static double getincome() {
		double income = Supply-getexp();
		return income;
	}

	private static double getexp() {
		double exp = Supply*expense;
		return exp;
	}

	private static double extracted() {
		double Sum = Supply+getvat();
		return Sum;
	}

	private static double getvat() {
		return Supply*vatrate;
	}

}
