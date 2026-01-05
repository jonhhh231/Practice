package Longest_Collatz_Sequence;

import java.io.*;
import java.util.*;

public class Solution {

    // khai bao so luong phan tu can phai tinh toan
    static final int LIMIT = 5000000;

    // khai bao mang de co the luu step da duoc tinh tranh viec lap lai
    static int[] cache = new int[LIMIT + 1];

    // khai bao ket qua da tinh toan
    // vi du ans[1] = 1 thi so 1 la so co step lop nhat ans[3]=3 thi so 3 la co buoc step lon nhat
    // vi du ans[5] van la 3 vi so step cua 5 nho hon 3
    static int[] ans = new int[LIMIT + 1];

    public static void main(String[] args) throws IOException {
        precompute();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        for (int i = 0; i < t; i++) {
            String s = bufferedReader.readLine();
            if (s == null) break;
            int n = Integer.parseInt(s.trim());

            System.out.println(ans[n]);
        }
        bufferedReader.close();
    }

    static void precompute() {
        // gia tri collatz cua i thi tinh bang ham findStep
        for (int i = 1; i <= LIMIT; i++) {
            cache[i] = findStep(i);
        }

        // tao bien de luu so step da tinh
        int maxChainLength = 0;
        int maxNumber = 1;

        // doan code nay la de tim so lon nhat trong pham vi
        for (int i = 1; i <= LIMIT; i++) {
            if (cache[i] >= maxChainLength) {
                maxChainLength = cache[i];
                maxNumber = i;
            }

            ans[i] = maxNumber;
        }
    }

    static int findStep(long n) {
        // neu = 1 thi return 1 luon
        if (n == 1) return 1;

        // neu nam trong pham vi da tinh tinh return luon
        if (n <= LIMIT && cache[(int)n] != 0) {
            return cache[(int)n];
        }

        // tinh so ma chua duoc tinh
        long nextN;
        if (n % 2 == 0) {
            nextN = n / 2;
        } else {
            nextN = 3 * n + 1;
        }

        // dung de quy de tinh so lan no can phai lap lai de quay ve 1
        int result = 1 + findStep(nextN);

        // neu n nam trong gioi han thi tra ve ket qua
        if (n <= LIMIT) {
            cache[(int)n] = result;
        }

        return result;
    }
}