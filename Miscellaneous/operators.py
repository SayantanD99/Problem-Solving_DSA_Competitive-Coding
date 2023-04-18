"""
Task :

Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal
Find and print the meal's total cost.

Link :https://www.hackerrank.com/challenges/30-operators/problem

"""

mealCost = float(input())
tipPercent = int(input())
taxPercent = int(input())
tip = mealCost * tipPercent / 100
tax = mealCost * taxPercent / 100
totalCost = mealCost + tip + tax
print("The total meal cost is " + str(round(totalCost)) + " dollars.")
