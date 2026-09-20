# Day 41 - LeetCode Solutions

## Problem 1

**Problem Name:** Student Attendance Record II
**Problem Number:** 552
**Platform:** LeetCode
**Difficulty:** Hard
**Language:** Java

## Problem Statement

Given an integer `n`, return the number of possible attendance records of length `n` that satisfy the following conditions:

* The student must have **fewer than 2 absent (`A`) days**.
* The student must not have **3 or more consecutive late (`L`) days**.

The answer should be returned modulo `1,000,000,007`.

## Key Idea

Use **Dynamic Programming (DP)** with only 6 possible states.

We track:

* Number of `A` → `0` or `1`
* Consecutive `L` → `0`, `1`, or `2`

Therefore, there are:

```text
0A, 0L
0A, 1L
0A, 2L

1A, 0L
1A, 1L
1A, 2L
```

## Approach

For every day, try the three possible attendance choices:

### 1. Present (`P`)

* Number of `A` remains the same.
* Consecutive `L` becomes `0`.

### 2. Absent (`A`)

* Allowed only when the current number of `A` is `0`.
* Number of `A` becomes `1`.
* Consecutive `L` becomes `0`.

### 3. Late (`L`)

* Allowed only when consecutive `L` is less than `2`.
* Consecutive `L` increases by `1`.
* Number of `A` remains the same.

Repeat this process for all `n` days.

Finally, add the counts of all 6 valid states.

## Example

**Input:**

```text
n = 2
```

Possible valid records include:

```text
PP
PA
PL
AP
AL
LP
LA
LL
```

Therefore:

```text
Output = 8
```

## DP State

```text
dp[A count][L streak]

A count → 0 or 1
L streak → 0, 1 or 2
```

This gives only **6 states**, which makes the solution efficient even for large `n`.

## Modulo

Since the number of valid records can become extremely large, every calculation is performed modulo:

```text
1,000,000,007
```

## Complexity

**Time Complexity:** O(n)

**Space Complexity:** O(1)

Only 6 DP states are maintained at any time.

## Files

* `StudentAttendanceRecordII.java`
