#https://www.hackerrank.com/challenges/diagonal-difference/problem

n = int(input().strip())

# instantiate empty list
a = []

# Populate 2D array as list[list[]]
for a_i in range(n):
    a_t = [int(a_temp) for a_temp in input().strip().split(' ')]
    a.append(a_t)

max_index = n-1


def get_primary_diagonal(index_num):
    """
    Pass max index number to start
    """
    # Base case
    if index_num == 0:
        return a[0][0]

    # Walk from bottom right a[max][max] to base case a[0][0]
    else:
        return a[index_num][index_num] + get_primary_diagonal(index_num-1)


def get_secondary_diagonal(x, y):
    """
    Pass max index number for x, 0 for y to start
    """
    # Base case
    if x == 0 and y == max_index:
        return a[0][max_index]

    # Walk from bottom left to top right until base case
    else:
        return a[x][y] + get_secondary_diagonal(x-1, y+1)

primary = get_primary_diagonal(max_index)
secondary = get_secondary_diagonal(max_index,0)

print(abs(primary - secondary))
