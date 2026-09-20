
# Day 43 - LeetCode Solutions

## Problem 1

**Problem Name:** [Count Numbers with Unique Digits](https://leetcode.com/problems/count-numbers-with-unique-digits/)
**Problem Number:** 357
**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java

## Problem Statement

Given an integer `n`, return the count of all numbers with unique digits in the range `0 ≤ x < 10^n`.

A number has unique digits if no digit is repeated.

## Input

```text
n = 2
````

## Output

```text
91
```

## Explanation

For `n = 2`, the range is from `0` to `99`.

There are 100 numbers in total.

The numbers with repeated digits are:

```text
11, 22, 33, 44, 55, 66, 77, 88, 99
```

There are 9 numbers with repeated digits.

Therefore:

```text
100 - 9 = 91
```

So, the answer is `91`.

## Key Idea

Use **combinatorics** to count numbers whose digits are all unique.

For one-digit numbers, there are 10 possibilities including `0`.

For two-digit numbers:

* The first digit has 9 choices (`1-9`).
* The second digit has 9 remaining choices.

Therefore:

```text
9 × 9 = 81
```

For every additional digit, one fewer digit is available.

## Approach

1. If `n = 0`, return `1` because only the number `0` is possible.
2. Limit `n` to `10` because there are only 10 unique decimal digits.
3. Start with `10` valid numbers for `0` to `9`.
4. For two-digit numbers, calculate `9 × 9`.
5. For each additional digit, multiply by the number of remaining available digits.
6. Add each count to the result.
7. Return the final count.

## Example

**Input:**

```text
n = 2
```

**Output:**

```text
91
```

**Explanation:**

```text
One-digit numbers = 10

Two-digit numbers:
9 × 9 = 81

Total:
10 + 81 = 91
```

## Data Structure / Concept

**Concept:** Combinatorics / Counting

The solution uses combinatorics to count the possible numbers without repeating digits.

## Complexity

**Time Complexity:** O(1)

**Space Complexity:** O(1)

Since there are only 10 unique decimal digits, the loop runs at most 10 times.

## Files

* `Count Numbers with Unique Digits.java`

## LeetCode Link

[https://leetcode.com/problems/count-numbers-with-unique-digits/](https://leetcode.com/problems/count-numbers-with-unique-digits/)

```
```
