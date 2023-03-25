import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
	
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int prize=0;
		
		if(a==b && b!=c) {
			prize=1000+a*100;
		}
		else if(a==c&&a!=b) {
			prize=1000+a*100;
		}
		else if(b==c && a!=b) {
			prize=1000+b*100;
		}
		else if(a==b&&b==c) {
			prize=10000+a*1000;
		}
		else if (a!=b&&b!=c&&a!=c) {
			if(a>b&&a>c) {
				prize=a*100;
			}
			else if(b>a&&b>c) {
				prize=b*100;
			}
			else {
				prize=c*100;
			}
		}
		System.out.println(prize);
		
	}

}
