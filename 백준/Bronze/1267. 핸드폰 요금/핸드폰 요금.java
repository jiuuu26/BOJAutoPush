import java.lang.*;
import java.util.Scanner;

/* Baekjoon #1267 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int youngBill=0;
		int minBill=0;
		int call = sc.nextInt();	//통화 개수
		int time;	//통화 시간
		int i;
		
		for(i=0 ; i < call ; i++) {
			time = sc.nextInt();
			youngBill+=((time/30)+1)*10;
			minBill+=((time/60)+1)*15;
		}
		
		if(youngBill < minBill) {
			System.out.println("Y "+youngBill);
		}
		else if(youngBill > minBill) {
			System.out.println("M "+minBill);
		}
		else {
			System.out.println("Y M "+minBill);
		}
		
		sc.close();
		
	}

}