# Day 33 - LeetCode Solutions

## Problem 1

**Problem Name:** XOR Operation in an Array
**Problem Number:** 1486
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

Given two integers `n` and `start`, an array is defined as:

`nums[i] = start + 2 * i`

Return the bitwise XOR of all elements in the array.

## Key Idea

* Start with `result = 0`.
* Generate each array value using `start + 2 * i`.
* XOR each value with `result`.
* Return the final XOR value.
* No need to create the actual array.

## Approach

1. Initialize `result = 0`.
2. Run a loop from `i = 0` to `n - 1`.
3. Calculate the current value using `start + 2 * i`.
4. Perform XOR using `result ^ current`.
5. Return `result`.

## Example

**Input:**

```text
n = 5
start = 0
```

**Array:**

```text
[0, 2, 4, 6, 8]
```

**XOR:**

```text
0 ^ 2 ^ 4 ^ 6 ^ 8 = 8
```

**Output:**

```text
8
```

## Complexity

**Time Complexity:** O(n)
**Space Complexity:** O(1)

## Files

* `XOROperationInAnArray.java`
