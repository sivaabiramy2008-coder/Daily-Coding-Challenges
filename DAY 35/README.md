# Day 35 - LeetCode Solutions

## Problem 1

**Problem Name:** Rotate String
**Problem Number:** 796
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

Given two strings `s` and `goal`, return `true` if and only if `s` can become `goal` after some number of shifts.

In one shift, the leftmost character of `s` is moved to the rightmost position.

## Key Idea

* First, check whether `s` and `goal` have the same length.
* Rotate `s` one character at a time.
* After every rotation, compare `s` with `goal`.
* If they become equal, return `true`.
* If all possible rotations are checked without a match, return `false`.

## Approach

1. Check if both strings have the same length.
2. Run a loop for `s.length()` rotations.
3. Compare `s` and `goal` using `equals()`.
4. Store the first character.
5. Remove the first character using `substring()`.
6. Add the first character to the end.
7. Continue until a match is found or all rotations are checked.
8. Return the result.

## Example

**Input:**

```text
s = "abcde"
goal = "cdeab"
```

**Rotations:**

```text
abcde
bcdea
cdeab
```

**Output:**

```text
true
```

## Complexity

**Time Complexity:** O(n²)

**Space Complexity:** O(n)

## Files

* `RotateString.java`
