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

* Find the height of the left subtree.
* Find the height of the right subtree.
* Calculate the diameter passing through the current node.
* Keep track of the maximum diameter found.

The diameter passing through a node is:

```text
left height + right height




# Day 42 - LeetCode Solutions

## Problem 2

****Problem Name**:** [Triangle Judgement](https://leetcode.com/problems/triangle-judgement/)
**Problem Number:** 610
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** SQL

## Problem Statement

Given three side lengths `x`, `y`, and `z`, determine whether these three sides can form a valid triangle.

A valid triangle must satisfy all three conditions:

* `x + y > z`
* `x + z > y`
* `y + z > x`

If all three conditions are satisfied, return `Yes`; otherwise, return `No`.

## Key Idea

Use a **CASE statement** to check whether the three sides satisfy the triangle inequality.

If all three conditions are true, the result is `Yes`.

Otherwise, the result is `No`.

## Approach

1. Select the three side lengths `x`, `y`, and `z`.
2. Use a `CASE` statement to check all three triangle conditions.
3. Check whether `x + y > z`.
4. Check whether `x + z > y`.
5. Check whether `y + z > x`.
6. If all three conditions are true, return `Yes`.
7. Otherwise, return `No`.

## Example

**Input:**

```text
x   y   z
13  15  17
1   2   3
8   10  5
