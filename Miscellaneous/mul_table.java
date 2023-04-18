"""
Task :

Given an integer,n, print its first 10 multiples. Each multiple n x i (where 1<=i<=10) should be printed on a new line in the form : 
n x i = result.

Link : https://www.hackerrank.com/challenges/30-loops/problem
"""

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class table {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            for(int i =1; i<=10; i++){
                System.out.println(N + " x " + i + " = " + N*i);

            }
        }
    }
