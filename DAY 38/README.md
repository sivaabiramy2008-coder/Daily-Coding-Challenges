# Day 38 - LeetCode Solutions

## Problem 1

**Problem Name:** Add Two Integers
**Problem Number:** 2235
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

Given two integers `num1` and `num2`, return the sum of the two integers.

## Key Idea

* Take the two given integers.
* Add `num1` and `num2`.
* Return the calculated sum.

## Approach

1. Receive two integers `num1` and `num2`.
2. Add the two integers.
3. Store the result.
4. Return the sum.

## Example

**Input:**

```text
num1 = 12
num2 = 5
```

**Calculation:**

```text
12 + 5 = 17
```

**Output:**

```text
17
```

## Complexity

**Time Complexity:** O(1)

**Space Complexity:** O(1)

## Files

* `AddTwoIntegers.java`

# Day 38 - LeetCode Solutions

## Problem 2

**Problem Name:** Flipping an Image
**Problem Number:** 832
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

Given an `n x n` binary matrix `image`, flip the image horizontally and then invert it.

* **Horizontal flip:** Reverse each row of the image.
* **Invert:** Change every `0` to `1` and every `1` to `0`.

Return the resulting image.

## Key Idea

* Process the image row by row.
* Use an outer `for` loop to access each row.
* Use two pointers, `left` and `right`, to reverse each row.
* Swap the left and right elements while inverting them.
* Move `left` forward and `right` backward after each operation.
* When both pointers meet at the middle element, invert it as well.

## Approach

1. Start with the first row of the image.
2. Set `left` to the first column.
3. Set `right` to the last column.
4. Use a `while` loop while `left <= right`.
5. Swap the elements at `left` and `right`.
6. Invert both values while swapping.
7. Move `left` one position forward.
8. Move `right` one position backward.
9. Repeat the same process for every row.
10. Return the modified image.

## Example

**Input:**

```text
image =
[1, 1, 0]
[1, 0, 1]
[0, 0, 0]
```

**After Horizontal Flip:**

```text
[0, 1, 1]
[1, 0, 1]
[0, 0, 0]
```

**After Invert:**

```text
[1, 0, 0]
[0, 1, 0]
[1, 1, 1]
```

**Output:**

```text
[
  [1, 0, 0],
  [0, 1, 0],
  [1, 1, 1]
]
```

## Complexity

**Time Complexity:** O(n²)

**Space Complexity:** O(1)

## Files

* `FlippingAnImage.java`

