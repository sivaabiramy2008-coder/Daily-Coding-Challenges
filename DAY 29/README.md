# Day 29 - LeetCode Solutions

## Problem 1

**Problem Name:** Binary Number with Alternating Bits

**Platform:** LeetCode

**Difficulty:** Easy

**Language:** Java

**Approach:** Bit Manipulation

**Time Complexity:** O(1)

**Space Complexity:** O(1)

## Problem Statement

Given a positive integer `n`, determine whether its binary representation has alternating bits. In other words, every two adjacent bits must be different.

## Key Idea

Use XOR with the right-shifted number:

`n ^ (n >> 1)`

If the bits are alternating, the result contains consecutive `1`s. We then use the property:

`x & (x + 1) == 0`

to check whether `x` consists entirely of `1`s.

## Files

- BinaryNumberWithAlternatingBits.java
