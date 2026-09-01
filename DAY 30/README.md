# Day 30 - LeetCode Solutions

## Problem 1

**Problem Name:** Find Minimum in Rotated Sorted Array

**Platform:** LeetCode

**Difficulty:** Medium

**Language:** Java

**Approach:** Binary Search

**Time Complexity:** O(log n)

**Space Complexity:** O(1)

## Problem Statement

Given a rotated sorted array of unique integers, find and return the minimum element in the array.

## Key Idea

Use binary search by comparing `nums[mid]` with `nums[right]`.

- If `nums[mid] > nums[right]`, the minimum is on the right side.
- Otherwise, the minimum is at `mid` or on the left side.

## Files

- FindMinimumInRotatedSortedArray.java
