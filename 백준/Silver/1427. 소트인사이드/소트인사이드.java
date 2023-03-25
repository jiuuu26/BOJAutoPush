import java.lang.*;
import java.util.*;

public class Main {
    //일단 int로 입력 받고 몇자리 수인지 계산한 다음 나머지 계산으로 한자리씩 빼서 배열에 입력
    //그 후 comparator을 사용하여 내림차순으로 정렬
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt();
        int a = n;
        int x = 1;
        int i;
        
        while (true) {
            n /= 10;
            x++;
            if (n==0) break;
        }
        n=a;
        for(i=1; i<x; i++){
            list.add(n%10);
            n /= 10;
        }
        list.sort(Comparator.reverseOrder());

        for(i=1; i<x; i++){
            System.out.print(list.get(i-1));
        }

    }
}
