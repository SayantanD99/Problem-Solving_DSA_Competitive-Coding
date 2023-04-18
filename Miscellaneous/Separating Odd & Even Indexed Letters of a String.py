"""
Task : 

Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

Input Format : 

The first line contains an integer,  (the number of test cases). 
Each line  of the  subsequent lines contain a String, .

Constraints :
1<=T<=10
2<Length of S<10000

Output Format : 

For each String  (where 0<J<T-1 ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

Link : https://www.hackerrank.com/challenges/30-review-loop/problem
"""

def strman():
    t=int(input())
    while  t>0 :
        s=input()
        for i in range(0,len(s)):
            if i%2==0:
                print(s[i],end="")
        print(end=" ")
        for i in range(0,len(s)):
            if i%2!=0:
                print(s[i],end="")
        t=t-1
        print("")

strman()
