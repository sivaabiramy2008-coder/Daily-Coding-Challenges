# Day 28 - LeetCode Solutions

## Problem 1

**Problem Name:** Defanging an IP Address

**Platform:** LeetCode

**Difficulty:** Easy

**Language:** Java

**Approach:** String Manipulation

**Time Complexity:** O(n)

**Space Complexity:** O(n)

## Problem Statement

Given a valid IPv4 address, return a defanged version of that IP address. A defanged IP address replaces every period `.` with `[.]`.

### Example

Input:
`1.1.1.1`

Output:
`1[.]1[.]1[.]1`

## Key Idea

Replace every `.` in the string with `[.]`.

## Files

- DefangingIPAddress.java

# Day 28 - LeetCode Solutions

## Problem 2

**Problem Name:** Kids With the Greatest Number of Candies

**Platform:** LeetCode

**Difficulty:** Easy

**Language:** Java

**Approach:** Array Traversal + Find Maximum

**Time Complexity:** O(n)

**Space Complexity:** O(n)

## Problem Statement

Given an array `candies` representing the number of candies each kid has and an integer `extraCandies`, determine for each kid whether they can have the greatest number of candies after receiving all the extra candies.

## Key Idea

First, find the maximum number of candies among all kids. Then, for each kid, check whether:

`candies[i] + extraCandies >= max`

If true, add `true` to the result; otherwise, add `false`.

## Files

- KidsWithTheGreatestNumberOfCandies.java
