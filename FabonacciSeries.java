import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		
		int c=a+b;
		
		System.out.println("How many Numbers in fabonacci series you want : ");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		System.out.print(a+" "+b+" ");
		for(int i=0;i<count-2;i++) {
			
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
		scanner.close();

	}

}
