import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int temparr[] = new  int[n];
        int i, j;
        int temp=0;
        int sum=0;



        for(i=0 ;i<n ;i++){
            a[i]=sc.nextInt();
        }
        for(i=0 ;i<n ;i++){
            b[i]=sc.nextInt();
            temparr[i]=b[i];
        }


        for(i=0 ;i<n ;i++){
            for(j=0; j<n-i-1; j++){
                if(a[j] > a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(i=0 ;i<n ;i++){
            for(j=0; j<n-i-1; j++){
                if(temparr[j] < temparr[j+1]){
                    temp=temparr[j];
                    temparr[j]=temparr[j+1];
                    temparr[j+1]=temp;
                }
            }
        }


        for(i=0 ;i<n ;i++){
            sum+= a[i]*temparr[i];
        }


        System.out.println(sum);




    }
}
