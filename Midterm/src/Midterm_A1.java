import java.util.Scanner;

public class Midterm_A1 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("請輸入用電度數:");	
		
		double a = scanner.nextInt();
		
		double b = a-100;
		double c = (b*4.5);
		double d = (100*3.1);
		double e = c+d;
		double f = a-300;
		double g = f*5.5;
		double h = c+d+f;
					
		
		if(a<=100) {
		     System.out.print("應繳電費:"+a*3.1);
		}
		else if(a>100&&a<=300) {
		     System.out.printf("應繳電費:%.1f",e);
		}
		else if(a>=301) {
		     System.out.printf("應繳電費:%.1f",h);
		}
		
	}
	
	
}
