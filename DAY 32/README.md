# Day 32 - LeetCode Solutions

## Problem 1

**Problem Name:** Richest Customer Wealth

**Platform:** LeetCode

**Difficulty:** Easy

**Language:** Java

**Approach:** 2D Array Traversal + Nested Loops

**Time Complexity:** O(m × n)

**Space Complexity:** O(1)

## Problem Statement

Given a 2D array `accounts`, where each row represents a customer and each value represents the amount of money in one bank account, find the customer with the maximum total wealth.

## Key Idea

- Traverse each customer using the outer loop.
- Calculate the total wealth of each customer using the inner loop.
- Compare each customer's wealth with the current maximum.
- Return the maximum wealth.

## Files

- RichestCustomerWealth.java

- # Day 32 - LeetCode Solutions

## Problem 2

**Problem Name:** Shuffle the Array

**Problem Number:** 1470

**Platform:** LeetCode

**Difficulty:** Easy

**Language:** Java

**Approach:** Array Traversal

**Time Complexity:** O(n)

**Space Complexity:** O(n)

## Problem Statement

Given an array `nums` containing `2n` elements in the form:

`[x1, x2, ..., xn, y1, y2, ..., yn]`

Return the array in the shuffled form:

`[x1, y1, x2, y2, ..., xn, yn]`

## Key Idea

The array is divided into two halves.

- `nums[i]` → element from the first half
- `nums[i + n]` → corresponding element from the second half
- Add them alternately to the result array.

## Example

Input:

`nums = [2,5,1,3,4,7], n = 3`

Output:

`[2,3,5,4,1,7]`

## Files

- ShuffleTheArray.java
