Day 42 - LeetCode Solutions

Problem 1

Problem Name: Diameter of Binary Tree
Problem Number: 543
Platform: LeetCode
Difficulty: Easy
Language: Java

Problem Statement

Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in the tree.

The path may or may not pass through the root.

The length of a path is measured by the number of edges between the nodes.

Key Idea

Use Recursion to calculate the height of each node.

For every node:

Find the height of the left subtree.

Find the height of the right subtree.

Calculate the diameter passing through the current node.

Keep track of the maximum diameter found.

The diameter passing through a node is:

left height + right height

Approach

Start from the root node.

Recursively calculate the height of the left subtree.

Recursively calculate the height of the right subtree.

Calculate the diameter through the current node.

Update the maximum diameter.

Return the maximum height of the left or right subtree plus 1.

Continue until all nodes are processed.

Return the maximum diameter.

Example

Input:

[1,2,3,4,5]

Output:

3

Explanation:

The longest path is:

4 → 2 → 1 → 3

This path contains 3 edges, so the diameter is 3.

Data Structure

Binary Tree

The solution uses:

Recursion

Tree Traversal

Height Calculation

Complexity

Let n be the number of nodes and h be the height of the binary tree.

Time Complexity: O(n)

Space Complexity: O(h)

Files

DiameterOfBinaryTree.java
