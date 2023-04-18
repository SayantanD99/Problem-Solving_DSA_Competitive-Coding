"""
Task :
Given an array, A , of N integers, print A's elements in reverse order as a single line of space-separated numbers.

#Day 7

Link : https://www.hackerrank.com/challenges/30-arrays/problem
"""

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))
    print(" ".join(map(str, arr[::-1])))
