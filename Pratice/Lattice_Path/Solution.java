package Lattice_Path;
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
        BigInteger MOD = new BigInteger("1000000007");

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] inputNumbers = bufferedReader.readLine().trim().split("\\s+");

                long n = Long.parseLong(inputNumbers[0]);
                long k = Long.parseLong(inputNumbers[1]);
                System.out.println(combination(n + k, k).mod(MOD));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
    static BigInteger combination(long n, long k) {
        if (k < 0 || k > n) return BigInteger.ZERO;

        if (k > n - k) k = n - k;

        BigInteger result = BigInteger.ONE;
        // ap dung cong thuc toan hoc to hop cua (20,2) = (20.18)
        // luon chon vong lap nho de toi uu toc do
        for (int i = 1; i <= k; i++) {
            result = result.multiply(BigInteger.valueOf(n - k + i));
            result = result.divide(BigInteger.valueOf(i));
        }
        return result;
    }

}
