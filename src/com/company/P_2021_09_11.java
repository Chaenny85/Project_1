package com.company;

import java.util.Scanner;

public class P_2021_09_11 {
    public static void main(String[] args) {
        int N, tmp;
        int min = 1000000, max = -1000000;
        int[] arr = new int[1000000];

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for(int i=0; i<N; i++){
            //arr[i] = sc.nextInt();

            tmp = sc.nextInt();
            if(tmp<min){
                min = tmp;
            }
            if(tmp>max){
                max = tmp;
            }
        }

        //배열 쓰는 방식
        /*
        for(int i=0; i<N; i++){
            for(int j=0; j<N-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        */
        //System.out.print(arr[0]+" "+arr[N-1]);

        System.out.print(min+" "+max);

    }
}
