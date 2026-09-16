# Day 40 - LeetCode Solutions

## Problem 1

**Problem Name:** Bulb Switcher
**Problem Number:** 319
**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java

## Problem Statement

There are `n` bulbs that are initially OFF.

In each round, we toggle a set of bulbs:

* Round 1: Toggle every bulb.
* Round 2: Toggle every 2nd bulb.
* Round 3: Toggle every 3rd bulb.
* Continue until round `n`.

Return the number of bulbs that remain ON after all rounds.

## Key Idea

A bulb is toggled once for every divisor of its position.

A bulb remains ON only when it is toggled an **odd number of times**.

Only **perfect square numbers** have an odd number of divisors.

Therefore, the number of bulbs that remain ON is:

`√n`

## Approach

1. Consider each bulb's position as a number.
2. A bulb is toggled for every divisor of its position.
3. Numbers with an even number of divisors end up OFF.
4. Perfect square numbers have an odd number of divisors.
5. Therefore, count the perfect squares up to `n`.
6. The integer part of `√n` gives the answer.
7. Use `Math.sqrt(n)` and convert it to an integer.

## Example

**Input:**

```text
n = 10
```

Perfect squares up to 10:

```text
1, 4, 9
```

Number of perfect squares = `3`

**Output:**

```text
3
```

## Complexity

**Time Complexity:** `O(1)`
**Space Complexity:** `O(1)`

## Files

* `BulbSwitcher.java`
