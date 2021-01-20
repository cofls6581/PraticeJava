
public class LoopStringArray {

	public static void main(String[] args) {
		
		String[] names=new String[3];
		names[0]="Kim";
		names[1]="Lee";
		names[2]="Park";
		
		for(int i=0;i<(names.length-1);i++) {
			System.out.println(names[i]+",");
			}
		System.out.println(names[(names.length)-1]);
	}

}
