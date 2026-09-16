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


# Day 37 - LeetCode Solutions

## Problem 2

**Problem Name:** Reverse Prefix of Word
**Problem Number:** 2000
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

Given a string `word` and a character `ch`, reverse the substring of `word` that starts at index `0` and ends at the first occurrence of `ch`.

If `ch` does not appear in `word`, return the original string.

## Key Idea

* Find the **first occurrence** of `ch` in the string.
* Use a `for` loop to search for `ch`.
* Once `ch` is found, use two pointers to reverse the prefix.
* Use a `while` loop with `left` and `right` pointers.
* Keep all characters after `ch` unchanged.
* If `ch` is not found, return the original string.

## Approach

1. Start searching from the first character of `word`.
2. Use a `for` loop to find the first occurrence of `ch`.
3. Store the index of the first occurrence.
4. If `ch` is not found, return the original string.
5. Convert the string into a character array so that characters can be modified.
6. Set `left` to the first index and `right` to the index of `ch`.
7. Use a `while` loop to swap the characters at `left` and `right`.
8. Move `left` forward and `right` backward.
9. Continue until the prefix is completely reversed.
10. Convert the character array back into a string and return it.

## Example

**Input:**

```text
word = "abcdefd"
ch = "d"
```

**First occurrence of `d`:**

```text
a  b  c  d  e  f  d
0  1  2  3  4  5  6
         ↑
      index 3
```

**Reverse the prefix:**

```text
a  b  c  d
↓  ↓  ↓  ↓
d  c  b  a
```


**Space Complexity:** O(1)

## Files

* `PeakIndexInAMountainArray.java`
