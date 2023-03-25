import java.lang.*;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

/*2164*/
//큐 컬렉션 사용하여 풀기
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        int i;
        int n = sc.nextInt();

        for(i=0; i<n; i++){
            q.offer(i+1);
        }

        while(q.size()>1){
            q.poll();
            q.offer(q.poll());
        }

        System.out.println(q.poll());


    }
}

