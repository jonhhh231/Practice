package Find_Largest_Prime;
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
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

    }

    public static long largestPrime(long n) {
        long kq=n;
        long max=-1;
        while(kq%2==0){
            max=2;
            kq=kq/2;
        }
        for(long i=3;i*i<=kq;i+=2){ // sửa chỗ này thành long để không bị tràng số hạng khi lấy i*i
            while(kq%i==0){
                max=i;
                kq=kq/i;
            }
        }
        if(kq>2) {
            return kq;
        } else {
            return max;
        }
    }
}
