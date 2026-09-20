# Day 42 - LeetCode Solutions

## Problem 1

**Problem Name:** [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/)
**Problem Number:** 543
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in the tree.

The path may or may not pass through the root.

The length of a path is measured by the number of edges between the nodes.

## Key Idea

Use **Recursion** to calculate the height of each node.

For every node:

- Find the height of the left subtree.
- Find the height of the right subtree.
- Calculate the diameter passing through the current node.
- Keep track of the maximum diameter found.

The diameter passing through a node is:

```text
left height + right height
