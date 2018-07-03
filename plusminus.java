/**
Given an array of integers, 
calculate the fractions of its elements that are positive, negative, and are zeros. 
Print the decimal value of each fraction on a new line.

Link : https://www.hackerrank.com/challenges/plus-minus/problem
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int posCount = 0 ;
        int negCount = 0 ;
        int zeroCount = 0 ; 
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] > 0){ posCount++;}
            if(arr[arr_i] < 0){ negCount++;}
            if(arr[arr_i] == 0){ zeroCount++;}
            
        }
        System.out.println((double)posCount/(double)n);
        System.out.println((double)negCount/(double)n);
        System.out.println((double)zeroCount/(double)n);
    }
}
