#!/usr/bin/python

def bruteforce(arr):
	l = len(arr)
	prod = []
	for i in range(l):
		product = 1
		for j in range(l):
			if i != j:
				product *= arr[j]
		prod.append(product)
	return prod

def usingDivision(arr):
	product = 1
	for number in arr:
		product *= number

	prod = [product//x for x in arr]
	return prod

def withoutdivision(arr):
	left = [1 for _ in range(3)]
	print(left)
	right = [1 for _ in range(3)]
	print(right)
	prod = [1 for _ in range(3)]
	print(prod)
	print
	
	for i in range(1,3):
		left[i] = arr[i-1] * left[i-1]
		print left
	print

	for i in range(3-2, -1, -1):
		right[i] = arr[i+1] * right[i+1]
		print right
	print

	for i in range(3):
		prod[i] = left[i] * right[i]

	return prod

if __name__ == "__main__":
	arr = [1, 2, 3]
#	print(bruteforce(arr))
#	print(usingDivision(arr))
	print(withoutdivision(arr))
