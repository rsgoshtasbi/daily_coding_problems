#!/usr/bin/python
'''
This problem was asked by Google.

Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.

For example, given the following Node class:

class Node:
	def __init__(self, val, left=None, right=None):
		self.val = val
		self.left = left
		self.right = right
		
-------------easier to understand meaning-------------
class Node:
	val = val
	left = left
	right = right
	def __init__(self, val, left=None, right=None):
-------------easier to understand meaning-------------


The following test should pass:
node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'

'''

class Node:
	def __init__(self, val, left=None, right=None):
		self.val = val
		self.left = left
		self.right = right
