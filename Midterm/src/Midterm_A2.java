import java.util.Scanner;

public class Midterm_A2 {

    public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("包裹的重量(公斤) ? ");	
		
		int a = scanner.nextInt();
		
		System.out.print("距離(英哩) ? ");
		
		int b = scanner.nextInt();
		
		int c = b/500;
		double d = b%500;
		double e = 1;
		double sum = c+e;
		
		
		
		if(a<=1&&a>=0.001&&d>0.001) {
		     System.out.print("包裹的費用:"+90*sum);
		}
		else if(a<=1&&a>=0.001&&d<0.001) {
		     System.out.print("包裹的費用:"+90*c);
		}
		else if(a<0.001) {
		     System.out.print("輸入錯誤，沒有包裹是負值的重量");
		}
		
		else if(a>1&&a<=5&&d>0.001) {
		     System.out.print("包裹的費用:"+125*sum);
		}
		else if(a>1&&a<=5&&d<0.001) {
		     System.out.print("包裹的費用:"+125*c);
		}     
		else if(a>5&&a<=10&&d>0.001) {
		     System.out.print("包裹的費用:"+300*sum);
		}
		else if(a>5&&a<=10&&d<0.001) {
		     System.out.print("包裹的費用:"+300*c);
		}     
		else if(a>10&&a<=20&&d>0.001) {
		     System.out.print("包裹的費用:"+600*sum);
		}
		else if(a>10&&a<=20&&d<0.001) {
		     System.out.print("包裹的費用:"+600*c);
		}     
		else if(a>20&&a<=30&&d>0.001) {
		     System.out.print("包裹的費用:"+1000*sum);
		}
		else if(a>20&&a<=30&&d<0.001) {
		     System.out.print("包裹的費用:"+1000*c);
		}     
		else if(a>30) {
		     System.out.print("包裹重量上限為 30 公斤,超出 30 公斤者不受理");
		}
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
	
	
	
	
