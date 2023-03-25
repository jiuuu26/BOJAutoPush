import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		int n=1;
		int one=0;
		int two=0;
		int b=0;
		int a=sc.nextInt();
		int f =0;
		
		if(a>=10&&a<=99) {
			one= a%10;
			two= a/10;
		}
		else if(a>=0&&a<=9) {
			one=0;
			two=a;
		}
		b=one+two;
		one=(a%10);
		for(;;) {
			if(b<10) {
				f=(one*10)+b; //68
			}
			else if(b>=10){
				f=(b%10)+(one*10);
			}
			if (a==f) break;
			b=f;
			one= f%10;//4
			two=f/10;//8
			b=one+two;//12
			n++;
		}
		System.out.print(n);
		
	}

}
