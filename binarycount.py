"""
Task :
Given a base-10 integer,n, convert it to binary (base-2). 
Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.

#Day 10
Link : https://www.hackerrank.com/challenges/30-binary-numbers/problem
"""

import sys

n = int(input().strip())

binary = list(bin(n)[2:])
count = 0
max_count = 0
for i in binary:
    if (i == '1'):
        count += 1
    else:
        if count > max_count:
            max_count = count
        count = 0
if count > max_count:
    max_count = count
print (max_count)
