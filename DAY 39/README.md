# Day 39 - LeetCode Solutions

## Problem 1

**Problem Name:** Gas Station
**Problem Number:** 134
**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java

## Problem Statement

There are `n` gas stations arranged in a circle.

At station `i`:

* `gas[i]` represents the amount of gas available.
* `cost[i]` represents the gas required to travel from station `i` to the next station.

Find the starting gas station index from which we can travel around the entire circuit once and return to the starting station.

If it is impossible, return `-1`.

## Key Idea

Use a **Greedy Approach** with a single `for` loop.

* Calculate total gas and total cost.
* Track the current gas balance.
* If the current balance becomes negative, the current starting station cannot complete the journey.
* Move the starting station to the next station and reset the current balance.
* If total gas is less than total cost, completing the circuit is impossible.

## Approach

1. Initialize `totalGas`, `totalCost`, `currentGas`, and `start`.
2. Traverse all stations using one `for` loop.
3. Add `gas[i]` to `totalGas`.
4. Add `cost[i]` to `totalCost`.
5. Update current balance using:
   `currentGas += gas[i] - cost[i]`
6. If `currentGas < 0`:

   * Set `start = i + 1`
   * Reset `currentGas = 0`
7. After the loop:

   * If `totalGas < totalCost`, return `-1`.
   * Otherwise, return `start`.

## Example

**Input:**

```text
gas  = [1,2,3,4,5]
cost = [3,4,5,1,2]
```

**Output:**

```text
3
```

Starting from station `3`, we can complete the entire circuit.

## Complexity

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

## Files

* `GasStation.java`
