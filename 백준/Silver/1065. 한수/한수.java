import java.util.Scanner;
public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int han=0;
		int h,t,o;
		int gap1,gap2;
		
		if(n<100) {
			han=n;
		}
		else
		{
			han=99;
			for(int i=100;i<=n;i++) {
				h=(i/100);
				t=(i-(h*100))/10;
				o=i-((h*100)+(t*10));
				gap1=(t-h);
				gap2=(o-t);
				if(gap1==gap2) {
					han++;
				}
			}
		}
		System.out.println(han);

	}

}
