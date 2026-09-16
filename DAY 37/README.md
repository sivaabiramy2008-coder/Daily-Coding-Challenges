# Day 37 - LeetCode Solutions

## Problem 1

**Problem Name:** Peak Index in a Mountain Array
**Problem Number:** 852
**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java

## Problem Statement

You are given a mountain array where the values first increase and then decrease.

Return the **index of the peak element**.

A peak element is an element that is greater than both its previous and next elements.

## Key Idea

* Use a `for` loop to check each element from index `1`.
* Compare the current element with the previous and next elements.
* If the current element is greater than both, it is the peak.
* Return the current index `i`.
* The first and last elements are not checked because a peak must have both a previous and next element.

## Approach

1. Start the loop from `i = 1`.
2. Continue until `arr.length - 1`.
3. Compare `arr[i]` with `arr[i - 1]`.
4. Compare `arr[i]` with `arr[i + 1]`.
5. If `arr[i]` is greater than both, return `i`.
6. If no peak is found, return `-1`.

## Example

**Input:**

```text
arr = [0, 2, 4, 3, 1]
```

**Index:**

```text
0  1  2  3  4
```

**Values:**

```text
0  2  4  3  1
```

The peak value is `4`, which is present at index `2`.

**Output:**

```text
2
```

## Complexity

**Time Complexity:** O(n)

**Space Complexity:** O(1)

## Files

* `PeakIndexInAMountainArray.java`
