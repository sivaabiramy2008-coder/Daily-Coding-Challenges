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

* # Day 35 - LeetCode Solutions

## Problem 2

**Problem Name:** Arranging Coins
**Problem Number:** 441
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

Given `n` coins, arrange them in a staircase where:

* Row 1 needs 1 coin
* Row 2 needs 2 coins
* Row 3 needs 3 coins
* And so on.

Return the number of **complete rows** that can be formed.

## Key Idea

Think of the coins as a **right-angle staircase**.

For every row:

1. Check whether enough coins are available.
2. Subtract the required number of coins.
3. Increase the completed row count.
4. Move to the next row.
5. Stop when there are not enough coins for the next row.

## Approach

1. Initialize `count = 0`.
2. Start the row number from `1`.
3. Check whether `n >= row`.
4. Subtract `row` from `n`.
5. Increase `count`.
6. Continue until the next row cannot be completed.
7. Return `count`.

## Example

**Input:**

```text
n = 8
```

**Process:**

```text
Row 1 → 8 - 1 = 7
Row 2 → 7 - 2 = 5
Row 3 → 5 - 3 = 2
Row 4 → Not enough coins
```

Therefore:

```text
Output = 3
```

## Complexity

**Time Complexity:** O(√n)

**Space Complexity:** O(1)

## Files

* `ArrangingCoins.java`

