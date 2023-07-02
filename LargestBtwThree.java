
public class LargestBtwThree {

	public static void main(String[] args) {
		
		int a=153;
		int b=25;
		int c=56;
		
		
		if(a>b) {
			if(a>c)
				System.out.println("Largest number is "+a);
			else
				System.out.println("Largest number is "+c);
		}
		else {
			if(b>c)
				System.out.println("Largest number is "+b);
			else
				System.out.println("Largest number is "+c);
		}
	}
}
