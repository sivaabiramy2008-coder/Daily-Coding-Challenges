# Day 31 - LeetCode Solutions

## Problem 1

**Problem Name:** Binary Watch

**Platform:** LeetCode

**Difficulty:** Easy

**Language:** Java

**Approach:** Bit Manipulation + Brute Force

**Time Complexity:** O(1)

**Space Complexity:** O(1) (excluding the output list)

## Problem Statement

A binary watch has 4 LEDs representing hours from `0` to `11` and 6 LEDs representing minutes from `0` to `59`.

Given an integer `turnedOn`, return all possible times where the total number of turned-on LEDs is exactly `turnedOn`.

## Key Idea

Check every possible hour and minute. Count the set bits using `Integer.bitCount()`.

If:

`Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn`

then the time is valid and is added to the result.

## Files

- BinaryWatch.java
