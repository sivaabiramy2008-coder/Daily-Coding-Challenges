# Day 36 - LeetCode Solutions

## Problem 1

**Problem Name:** Guess Number Higher or Lower
**Problem Number:** 374
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

We are playing a Guess Game. A number is picked from `1` to `n`, and we need to find the picked number.

For every guess, the predefined `guess()` API returns:

* `-1` → The guessed number is higher than the picked number.
* `1` → The guessed number is lower than the picked number.
* `0` → The guessed number is equal to the picked number.

Return the number that was picked.

## Key Idea

* Use **Binary Search** to find the picked number efficiently.
* Maintain a search range from `1` to `n`.
* Find the middle number and pass it to the `guess()` API.
* If the result is `0`, the number is found.
* If the result is `-1`, search the left half.
* If the result is `1`, search the right half.

## Approach

1. Set `low = 1` and `high = n`.
2. Run a `while` loop while `low <= high`.
3. Find the middle number.
4. Call `guess(mid)`.
5. If the result is `0`, return `mid`.
6. If the result is `-1`, move `high` to `mid - 1`.
7. If the result is `1`, move `low` to `mid + 1`.
8. Continue until the picked number is found.
9. Return `-1` if the loop ends without finding the number.

## Example

**Input:**

```text
n = 10
pick = 6
```

**Binary Search:**

```text
Range: 1 → 10
Guess: 5
5 is lower than 6 → search right

Range: 6 → 10
Guess: 8
8 is higher than 6 → search left

Range: 6 → 7
Guess: 6
6 is correct
```

**Output:**

```text
6
```

## Complexity

**Time Complexity:** O(log n)

**Space Complexity:** O(1)

## Files

* `GuessNumberHigherOrLower.java`
