package com.company;

import java.util.Scanner;

public class P_2021_09_06 {

    public static void main(String[] args) {
	    int N, K;

	    Scanner sc = new Scanner(System.in);
	    //System.out.println("N을 입력하세요.");
	    N = sc.nextInt();
        //System.out.println("K를 입력하세요.");
        K = sc.nextInt();

        int[] list = new int[N];
        int n = 1;

        for(int i=1; i<=N; i++){
            if(N%i==0){
                list[n] = i;
                n++;
            }
        }

        System.out.println(list[K]);
    }
}
