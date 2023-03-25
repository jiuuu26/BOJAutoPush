import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner((System.in));
        int w= sc.nextInt();    //가로 길이
        int h= sc.nextInt();    //세로 길이
        int n= sc.nextInt();    //상점 개수
        int i;
        int locate[] = new int[n+1];  //각 상점과 동근의 위치 정보
        int distance[] = new int[n+1];    //각 상점과 동근의 경계로부터의 거리
        int min[] = new int[n+1];    //최단거리
        min[n]=0;   //최단거리의 합

        //위치 정보 입력
        for(i=0; i<n+1; i++){
            locate[i]=sc.nextInt();
            distance[i]= sc.nextInt();
        }

        //동근이와 상점 사이의 최단 거리
        for(i=0; i<n; i++){
            if(locate[i]==locate[n]){
                min[i]= distance[n]-distance[i];
                if(min[i]<0) min[i] = Math.abs(min[i]);
            }
            else{
                if(locate[n]==1){   //동근이 북
                    if(locate[i]==2){
                        if(distance[i]+distance[n]<w) min[i]=distance[i]+distance[n]+h;
                        else min[i]=(2*w)-(distance[i]+distance[n])+h;
                    }
                    else if(locate[i]==3) min[i]=distance[i]+distance[n];
                    else min[i]=distance[i]+(w-distance[n]);

                }
                else if(locate[n]==2){  //동근이 남
                    if(locate[i]==1){
                        if(distance[i]+distance[n]<w) min[i]=distance[i]+distance[n]+h;
                        else min[i]=(2*w)-(distance[i]+distance[n])+h;
                    }
                    else if(locate[i]==3) min[i]=(h-distance[i])+distance[n];
                    else min[i]=(h-distance[i])+(w-distance[n]);
                }
                else if(locate[n]==3){  //동근이 서
                    if(locate[i]==4){
                        if(distance[i]+distance[n]<h) min[i]=distance[i]+distance[n]+w;
                        else min[i]=(2*h)-(distance[i]+distance[n])+w;
                    }
                    else if(locate[i]==1) min[i]=distance[i]+distance[n];
                    else min[i]=distance[i]+(h-distance[n]);

                }
                else if(locate[n]==4){  //동근이 동
                    if(locate[i]==3){
                        if(distance[i]+distance[n]<h) min[i]=distance[i]+distance[n]+w;
                        else min[i]=(2*h)-(distance[i]+distance[n])+w;
                    }
                    else if(locate[i]==1) min[i]=(w-distance[i])+distance[n];
                    else min[i]=(w-distance[i])+(h-distance[n]);
                }
            }
        }
        for(i=0;i<n;i++){
            min[n]+=min[i];
        }
        System.out.println(min[n]);

    }
}
