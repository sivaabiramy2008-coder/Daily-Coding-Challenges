
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



# Day 43 - LeetCode Solutions

## Problem 2

**Problem Name:** [Relative Ranks](https://leetcode.com/problems/relative-ranks/)
**Problem Number:** 506
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

Given an integer array `score` where `score[i]` represents the score of the `i`th athlete, return an array of strings `answer` where `answer[i]` is the rank of the `i`th athlete.

The highest score receives the `Gold Medal`, the second highest receives the `Silver Medal`, and the third highest receives the `Bronze Medal`.

All other athletes receive their numerical rank.

## Input

```text
score = [5, 4, 3, 2, 1]
````

## Output

```text
["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
```

## Explanation

The athletes are ranked based on their scores.

* The athlete with score `5` gets the `Gold Medal`.
* The athlete with score `4` gets the `Silver Medal`.
* The athlete with score `3` gets the `Bronze Medal`.
* The athlete with score `2` gets rank `4`.
* The athlete with score `1` gets rank `5`.

Therefore, the output is:

```text
["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
```

## Key Idea

Use sorting to determine the rank of each athlete.

The scores are sorted in ascending order. The position of each score in the sorted array is used to determine its rank.

The top three ranks are replaced with:

* `Gold Medal`
* `Silver Medal`
* `Bronze Medal`

All remaining ranks are stored as numbers in string format.

## Approach

1. Create a result array to store the rank of each athlete.
2. Create a copy of the original `score` array.
3. Sort the copied array.
4. For each original score, find its position in the sorted array.
5. Calculate the rank based on the position.
6. If the rank is `1`, assign `Gold Medal`.
7. If the rank is `2`, assign `Silver Medal`.
8. If the rank is `3`, assign `Bronze Medal`.
9. For all other athletes, store their numerical rank as a string.
10. Return the result array.

## Example

**Input:**

```text
score = [5, 4, 3, 2, 1]
```

**Output:**

```text
["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
```

**Explanation:**

```text
Score 5 → Gold Medal
Score 4 → Silver Medal
Score 3 → Bronze Medal
Score 2 → Rank 4
Score 1 → Rank 5
```

## Data Structure / Concept

**Concept:** Array, Sorting, Binary Search

The solution uses an array to store the scores and another sorted array to determine the rank of each athlete.

`Arrays.sort()` is used to sort the scores, and `Arrays.binarySearch()` is used to find the position of each score.

## Complexity

**Time Complexity:** O(n log n)

Sorting the scores takes O(n log n), and finding each score using binary search takes O(log n).

**Space Complexity:** O(n)

An additional array is used to store the sorted scores and another array is used for the result.

## Files

* `Relative Ranks.java`

