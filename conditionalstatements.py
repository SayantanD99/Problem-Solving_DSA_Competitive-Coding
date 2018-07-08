"""
Task 
Given an integer, n , perform the following conditional actions:

If n  is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Link : https://www.hackerrank.com/challenges/30-conditional-statements/problem
"""

N = int(input())

def check(n):
    if(n%2!=0):
        print("Weird")
    elif(n%2==0):
        if(2<n<5):
            print("Not Weird")
        elif(6<n<21):
            print("Weird")
        elif(n>20):
            print("Not Weird")
        else:
            pass
    else:
        pass
        
check(N)
