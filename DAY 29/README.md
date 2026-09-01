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

# Day 29 - LeetCode Solutions

## Problem 2

**Problem Name:** Self Dividing Numbers

**Platform:** LeetCode

**Difficulty:** Easy

**Language:** Java

**Approach:** Mathematics + Digit Extraction

**Time Complexity:** O(n × d), where `n` is the range size and `d` is the number of digits

**Space Complexity:** O(n) for the output list

## Problem Statement

Given two integers `left` and `right`, return a list of all the self-dividing numbers in the range `[left, right]`.

A self-dividing number is a number that is divisible by every digit it contains. A number containing the digit `0` is not considered a self-dividing number.

## Key Idea

Extract each digit using `% 10` and remove the last digit using `/ 10`. For every digit, check whether the original number is divisible by that digit.

## Files

- SelfDividingNumbers.java
