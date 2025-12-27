package Multiple_Even_Fibonancci;
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
                long n = Long.parseLong(bufferedReader.readLine().trim());
                System.out.println(fibonancci(n));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
    public static long fibonancci (long value){
        long n1=0;
        long n2=1;
        long n3=0;
        long sum =0;
        while(n3<value){
            if (n3 % 2 == 0) {
                sum += n3;
            }
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
        return sum;
    }
}
