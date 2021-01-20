
public class LogicApp {

	public static void main(String[] args) {
		
		String customers [][]= { {"Kim","1234"},{"Lee","5678"},{"Park","1111"}};
		String inputName=args[0];
		String inputNum=args[1];
		boolean isRight=false;
		
		for(int i=0;i<customers.length;i++) {
			String[] compare=customers[i];
			if(compare[0].equals(inputName)&&compare[1].equals(inputNum)) {
				isRight=true;
				break;
			}
		}
		if(isRight)
			System.out.println("Welcome!");
		else {
			System.out.println("Error!");
		}
	}

}
