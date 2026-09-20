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

# Day 41 - LeetCode Solutions

## Problem 2

**Problem Name:** Smallest Range Covering Elements from K Lists
**Problem Number:** 632
**Platform:** LeetCode
**Difficulty:** Hard
**Language:** Java

## Problem Statement

You are given `k` sorted lists.

Find the smallest range `[a, b]` such that at least one element from every list is included in the range.

If multiple ranges have the same size, the range with the smaller starting value is preferred.

## Key Idea

Use a **PriorityQueue (Min Heap)** to keep track of the smallest current element from each list.

At any point:

* `minimum` → smallest element in the heap
* `currentMax` → largest current element
* Current range → `[minimum, currentMax]`

When the smallest element is removed from the heap, move to the **next element of the same list** and add it to the heap.

## Approach

1. Create a `PriorityQueue` as a Min Heap.
2. Add the first element from every list.
3. Store:

   * Element value
   * List index
   * Element index
4. Find the initial `currentMax`.
5. Take the smallest element using `poll()`.
6. Create the current range using:

   * Left = minimum element
   * Right = `currentMax`
7. Update the best range if the current range is smaller.
8. Move to the next element from the list that provided the minimum.
9. Update `currentMax`.
10. Repeat until one list has no more elements.
11. Return the smallest range.

## Example

**Input:**

```text id="8x5x99"
[[4,10,15,24,26],
 [0,9,12,20],
 [5,18,22,30]]
```

One valid smallest range is:

```text id="q7c3um"
[20,24]
```

Because:

```text id="3yr2vo"
List 1 → 24
List 2 → 20
List 3 → 22
```

All three lists have at least one element inside `[20,24]`.

## Data Structure

**PriorityQueue / Min Heap**

Each heap element stores:

```text id="r9l0y3"
[value, listIndex, elementIndex]
```

This helps us find the minimum value and also know which list should be advanced.

## Complexity

Let `N` be the total number of elements across all lists and `k` be the number of lists.

**Time Complexity:** O(N log k)

**Space Complexity:** O(k)

## Files

* `SmallestRangeCoveringElementsFromKLists.java`

