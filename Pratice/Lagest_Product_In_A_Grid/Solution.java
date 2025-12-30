package Lagest_Product_In_A_Grid;

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
        List<List<Integer>> grid = new ArrayList<>();


        IntStream.range(0, 20).forEach(i -> {
            try {
                grid.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();


        long max = 0;
        int rows = 20;
        int cols = 20;


        for (int n = 0; n < rows; n++) {
            for (int j = 0; j < cols; j++) {


                if (j < 17) {
                    long ngan =
                            (long) grid.get(n).get(j) * grid.get(n).get(j + 1) * grid.get(n).get(j + 2) * grid.get(n).get(j + 3);
                    if (ngan > max) max = ngan;
                }


                if (n < 17) {
                    long doc =
                            (long) grid.get(n).get(j) * grid.get(n + 1).get(j) * grid.get(n + 2).get(j) * grid.get(n + 3).get(j);
                    if (doc > max) max = doc;
                }


                if (n < 17 && j < 17) {
                    long cheochinh =
                            (long) grid.get(n).get(j) * grid.get(n + 1).get(j + 1) * grid.get(n + 2).get(j + 2) * grid.get(n + 3).get(j + 3);
                    if (cheochinh > max) max = cheochinh;
                }


                if (n < 17 && j >= 3) {
                    long cheophu =
                            (long) grid.get(n).get(j) * grid.get(n + 1).get(j - 1) * grid.get(n + 2).get(j - 2) * grid.get(n + 3).get(j - 3);
                    if (cheophu > max) max = cheophu;
                }
            }
        }

        System.out.println(max);
    }
}
