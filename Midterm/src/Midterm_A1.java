import java.util.Scanner;

public class Midterm_A1 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("�п�J�ιq�׼�:");	
		
		double a = scanner.nextInt();
		
		double b = a-100;
		double c = (b*4.5);
		double d = (100*3.1);
		double e = c+d;
		double f = a-300;
		double g = f*5.5;
		double h = c+d+f;
					
		
		if(a<=100) {
		     System.out.print("��ú�q�O:"+a*3.1);
		}
		else if(a>100&&a<=300) {
		     System.out.printf("��ú�q�O:%.1f",e);
		}
		else if(a>=301) {
		     System.out.printf("��ú�q�O:%.1f",h);
		}
		
	}
	
	
}
