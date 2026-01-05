package Large_Sum;
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
        BigInteger sum=BigInteger.ZERO;
        for(int tItr=0; tItr<t; tItr++) {
            try {
                BigInteger n = new BigInteger(bufferedReader.readLine().trim());
                sum =sum.add(n);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        };
        System.out.println(sum.toString().substring(0,10));
        bufferedReader.close();
    }
}