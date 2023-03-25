import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		int h=sc.nextInt();
		int m= sc.nextInt();
		int p= sc.nextInt();
		int sum=m+p;
		int x=sum/60;
		
		if(x>0) {
			h+=x;
			sum=sum-60*x;
		}
		
		if(h>23) {
			h-=24;	
		}
		System.out.print(h+" "+sum);
		
		
	}

}
