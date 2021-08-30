package com.bridgelabz.logical;

import java.util.*;

class fibonacci {

    static int fib(int n) {
        int[] f = new int[n + 2];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number of Fibonacci you want: ");
        int N = sc.nextInt();
        System.out.print("Fibonacci series are: ");
        for (int i = 0; i < N; i++)
            System.out.print(fib(i) + " ");
    }
}

