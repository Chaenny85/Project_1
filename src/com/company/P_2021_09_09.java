package com.company;

import java.util.Scanner;

public class P_2021_09_09 {
    public static void main(String[] args) {
        int T, N;

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();


        for(int i = 0; i<T; i++){
            //여기에서 N이랑 p선언 --> 테스트케이스 적용
            N = sc.nextInt();
            int p = 0;
            while (N > 0) {
                if (N % 2 == 1) {
                    System.out.print(p+" ");
                }
                p++;
                N = N / 2;
            }
            System.out.println();
        }
    }
}

//정답 코드2
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int T, N;

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for(int i=0; i<T; i++){
            N = sc.nextInt();
            String Birary_N = Integer.toBinaryString(N);
            for(int j=Birary_N.length()-1; j>=0; j--) {
                if (Birary_N.charAt(j) == '1') {
                    System.out.print(Birary_N.length()-j-1 +" ");
                }
            }
            System.out.println();
        }
    }
}
 */