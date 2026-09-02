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

# Day 33 - LeetCode Solutions

## Problem 2

**Problem Name:** Matrix Diagonal Sum
**Problem Number:** 1572
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

Given a square matrix `mat`, return the sum of the matrix diagonals.

The primary diagonal and secondary diagonal are included, but if an element belongs to both diagonals, it should be counted only once.

## Key Idea

* `mat[i][i]` → Primary diagonal ↘
* `mat[i][n - 1 - i]` → Secondary diagonal ↙
* Add both diagonal elements for every row.
* If `n` is odd, the center element is counted twice, so subtract it once.

## Approach

1. Find the matrix size `n`.
2. Initialize `sum = 0`.
3. Loop through each row using `i`.
4. Add the primary diagonal element.
5. Add the secondary diagonal element.
6. If the matrix size is odd, subtract the center element once.
7. Return the final sum.

## Example

**Input:**

```text
[[1,2,3],
 [4,5,6],
 [7,8,9]]
```

**Diagonal Elements:**

```text
Primary:   1 + 5 + 9
Secondary: 3 + 5 + 7
```

The center `5` is counted twice, so:

```text
1 + 5 + 9 + 3 + 7 = 25
```

**Output:**

```text
25
```

## Complexity

**Time Complexity:** O(n)
**Space Complexity:** O(1)

## Files

* `MatrixDiagonalSum.java`
