import java.util.Scanner;

public class Midterm_A3 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入你的名字 :");
		
		String a = scanner.next();
		
		System.out.print("請輸入你的體重 :");
		
		double d = scanner.nextInt();
		
        System.out.print("請輸入你的名字 :");
		
		String b = scanner.next();
		
		System.out.print("請輸入你的體重 :");
		
		double e = scanner.nextInt();
		
        System.out.print("請輸入你的名字 :");
		
		String c = scanner.next();
		
		System.out.print("請輸入你的體重 :");
		
		double f = scanner.nextInt();
		
		double sum = (d+e+f)/3;
		
		int money = 1000;
		
		double one = (sum-d)*1000;
		
		double two = (sum-e)*1000;
		
		double three = (sum-f)*1000;
		
		System.out.printf("平均體重:%.2f\n  ",sum);
		
		
		if(d<sum) {
	         System.out.printf(a+"%.0f\n  ",one);   
	}
		
		if(e<sum) {
	         System.out.printf(b+"%.0f\n  ",two);
	}
		
	    if(f<sum) {
	         System.out.printf(c+"%.0f\n  ",three);
	}	
		
		
		
		
		
		
	}
}
