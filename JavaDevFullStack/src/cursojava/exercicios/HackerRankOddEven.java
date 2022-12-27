package cursojava.exercicios;

public class HackerRankOddEven {
    public static void main(String[] args) {

        int n = 18;

        int nOddEven = n % 2;

        // System.out.println(nOddEven);

        if (nOddEven == 1){
            System.out.println("Weird");
        }
        else if(nOddEven == 0 && nOddEven >= 2 && nOddEven <= 5){
            System.out.println("Not Weird");
        }
        else if(nOddEven == 0 && nOddEven >= 6 && nOddEven <= 20){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }

    }
}

/*  ####### Resolução 
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

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        int nOddEven = N % 2;

        // System.out.println(nOddEven);

        if (nOddEven == 1){
            System.out.println("Weird");
        }
        else if(nOddEven == 0 && N >= 2 && N <= 5){
            System.out.println("Not Weird");
        }
        else if(nOddEven == 0 && N >= 6 && N <= 20){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
        
        
        
    }
        
}
 */