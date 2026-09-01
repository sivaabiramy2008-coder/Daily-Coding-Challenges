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

# Day 31 - LeetCode Solutions

## Problem 2

**Problem Name:** Unique Morse Code Words

**Platform:** LeetCode

**Difficulty:** Easy

**Language:** Java

**Approach:** String Manipulation + HashSet

**Time Complexity:** O(n × m)

**Space Complexity:** O(n × m)

## Problem Statement

Given an array of words, convert each word into its Morse code representation and return the number of unique Morse code transformations.

## Key Idea

- Use a `String[]` to store Morse codes for all 26 lowercase English letters.
- Use `StringBuilder` to construct the Morse representation of each word.
- Use a `HashSet` to store only unique transformations.
- Return the size of the `HashSet`.

## Files

- UniqueMorseCodeWords.java

then the time is valid and is added to the result.

## Files

- BinaryWatch.java
