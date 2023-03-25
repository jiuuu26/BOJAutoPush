import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i, j;
		int guard=0, nec1=0, nec2=0;	//nec1: 행에 필요한, nec2: 열에 필요한 guard 수 
		int realnec;	//실제 필요한 guard
		int x= sc.nextInt();	//열
		int y= sc.nextInt();	//행
		char arr[][]= new char [x][y];
		
		//guard 위치 배열로 저장
		for(i=0;i<x;i++) {
			String s =sc.next();	
			arr[i]=s.toCharArray();	
		}
		
		//각 행에서 guard가 없다면 행에 필요한 guard 수(nec1) 증가 
		for(i=0;i<x;i++) {
			for(j=0;j<y;j++) {
				if(arr[i][j]!='.') guard++;
			}
			if(guard==0) nec1++;
			guard=0;
		}
		
		//각 열에서 guard가 없다면 열에 필요한 guard 수(nec2) 증가 
		for(j=0;j<y;j++) {
			for(i=0;i<x;i++) {
				if(arr[i][j]!='.')guard++;
			}
			if(guard==0) nec2++;
			guard=0;
		}
		
		//행에 필요한 guard 수와 열에 필요한 guard 수 비교해서 큰 것 선택
		if(nec1>nec2) realnec=nec1;
		else realnec=nec2;
		
		System.out.println(realnec);
	}

}
