package Multiple_Three_Five;
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
                n-=1; // dòng này đảm bảo là n sẽ nhỏ hơn số đề bài cho
                long p3=n/3; // tính có bao nhiêu số nhỏ hơn n và chia hết cho 3
                long p5 =n/5;
                long p15=n/15;
                long sum3= 3 *(p3*(p3+1))/2; // tính tổng các số hạng chia hết cho 3
                long sum5= 5 *(p5*(p5+1))/2;
                long sum15= 15 *(p15*(p15+1))/2;
                System.out.println(sum3+sum5-sum15);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


        bufferedReader.close();
    }
}
