"""
Sunny and Johnny like to pool their money and go to the ice cream parlor.
Johnny never buys the same flavor that Sunny does. 
The only other rule they have is that they spend all of their money.
Given a list of prices for the flavors of ice cream, select the two that will cost all of the money they have.
Complete the function icecreamParlor below to return an array containing the indexes of the prices of the two flavors they buy. The returned array must be sorted ascending.

Link : https://www.hackerrank.com/challenges/icecream-parlor/problem
"""

#!/bin/python3
import sys

def icecreamParlor(m, a,n):
    d={}
    k=1
    for i in a:
        s=m-i
        if s in d:
            return d[s],k
        else:
            d[i]=k
        k=k+1  
if __name__ == "__main__":
    t = int(input().strip())
    for a0 in range(t):
        m = int(input().strip())
        n = int(input().strip())
        arr = list(map(int, input().strip().split(' ')))
        result = icecreamParlor(m, arr,n)
        print (" ".join(map(str, result)))
