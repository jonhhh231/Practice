package Highly_Divisible_Triangular_Number;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                int i = 1;
                long num = 0;
                int count = 0;
                while (count <= n) {
                    num = (long) i * (i + 1) / 2;
                    if (i % 2 == 0) {
                        count = countDivisors(i / 2) * countDivisors(i + 1);
                    } else {
                        count = countDivisors(i) * countDivisors((i + 1) / 2);
                    }
                    i++;
                }
                System.out.println(num);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        bufferedReader.close();
    }

    public static int countDivisors(long number) {
        int count = 0;
        long sqrt = (long) Math.sqrt(number);

        for (long i = 1; i <= sqrt; i++) {
            if (number % i == 0) {

                if (i * i == number) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
