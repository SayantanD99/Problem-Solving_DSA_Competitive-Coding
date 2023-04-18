#Link : https://www.hackerrank.com/challenges/py-if-else/problem

#!/bin/python3

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
