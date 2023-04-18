/**

Task :

Write a factorial function that takes a positive integer, N  as a parameter and prints the result of N! ( N factorial).

Note : Using Recursion

#Day 9

Link : https://www.hackerrank.com/challenges/30-recursion/problem

*/

import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println( factorial(scan.nextInt()) );
    }
        
    public static long factorial( int n )
    {
        return (n == 1) ? 1 : n*factorial(n-1) ;
    }
}
