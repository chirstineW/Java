import java.util.Scanner;

public class Midterm_A2 {

    public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("�]�q�����q(����) ? ");	
		
		int a = scanner.nextInt();
		
		System.out.print("�Z��(�^��) ? ");
		
		int b = scanner.nextInt();
		
		int c = b/500;
		double d = b%500;
		double e = 1;
		double sum = c+e;
		
		
		
		if(a<=1&&a>=0.001&&d>0.001) {
		     System.out.print("�]�q���O��:"+90*sum);
		}
		else if(a<=1&&a>=0.001&&d<0.001) {
		     System.out.print("�]�q���O��:"+90*c);
		}
		else if(a<0.001) {
		     System.out.print("��J���~�A�S���]�q�O�t�Ȫ����q");
		}
		
		else if(a>1&&a<=5&&d>0.001) {
		     System.out.print("�]�q���O��:"+125*sum);
		}
		else if(a>1&&a<=5&&d<0.001) {
		     System.out.print("�]�q���O��:"+125*c);
		}     
		else if(a>5&&a<=10&&d>0.001) {
		     System.out.print("�]�q���O��:"+300*sum);
		}
		else if(a>5&&a<=10&&d<0.001) {
		     System.out.print("�]�q���O��:"+300*c);
		}     
		else if(a>10&&a<=20&&d>0.001) {
		     System.out.print("�]�q���O��:"+600*sum);
		}
		else if(a>10&&a<=20&&d<0.001) {
		     System.out.print("�]�q���O��:"+600*c);
		}     
		else if(a>20&&a<=30&&d>0.001) {
		     System.out.print("�]�q���O��:"+1000*sum);
		}
		else if(a>20&&a<=30&&d<0.001) {
		     System.out.print("�]�q���O��:"+1000*c);
		}     
		else if(a>30) {
		     System.out.print("�]�q���q�W���� 30 ����,�W�X 30 ����̤����z");
		}
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
	
	
	
	
