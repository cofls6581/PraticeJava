
public class ExceptionApp {

	public static void main(String[] args) {
		
		int [] numbers= {12,543,21,452};
		
		try {
			System.out.println("start!");
			System.out.println(numbers[1]);
			System.out.println(numbers[4]);
			System.out.println(5/0);
		}
		catch(ArithmeticException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("error");
			e.printStackTrace();
		}
	}

}
