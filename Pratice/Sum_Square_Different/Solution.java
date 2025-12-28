package Sum_Square_Different;
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

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                System.out.println(Square_N_First_Number(n)-Each_Square_N_Number(n));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    public static long Square_N_First_Number(long n){
        long result = (long) Math.pow((((1+n)*n)/2),2);
        return result;
    }
    public static long Each_Square_N_Number(long n){
        long result = 0;
        result =(n*(n+1)*(2*n+1))/6;
        return result;
    }
}
