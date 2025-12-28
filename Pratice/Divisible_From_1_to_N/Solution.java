package Divisible_From_1_to_N;
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
    private static final List<Integer> list = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37);
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                System.out.println(findNumber(n));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    public static long findNumber(int n){
        int tam=0;
        long result = 1;
        for (Integer integer : list) {
            tam = integer;
            while (tam *integer <= n ) {
                tam = tam * integer;
            }
            if(integer>n){
                return result;
            }
            result = result * tam;
        }
        return result;
    }
}
