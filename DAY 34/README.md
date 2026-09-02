# Day 34 - LeetCode Solutions

## Problem 1

**Problem Name:** Excel Sheet Column Number
**Problem Number:** 171
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

Given a string `columnTitle` representing an Excel column name, return its corresponding column number.

For example:

```text
A  -> 1
B  -> 2
...
Z  -> 26
AA -> 27
AB -> 28
```

## Key Idea

Treat the Excel column title like a **Base-26 number**.

* `A = 1`
* `B = 2`
* ...
* `Z = 26`

For every character:

1. Convert the character into its numeric value.
2. Multiply the previous result by `26`.
3. Add the current character value.

Formula:

```text
result = result * 26 + characterValue
```

## Approach

1. Initialize `result = 0`.
2. Traverse every character in `columnTitle`.
3. Convert the character using:
   `character - 'A' + 1`
4. Update the result.
5. Return the final result.

## Example

**Input:**

```text
columnTitle = "AB"
```

**Calculation:**

```text
A = 1
B = 2

result = 0 * 26 + 1
       = 1

result = 1 * 26 + 2
       = 28
```

**Output:**

```text
28
```

## Complexity

**Time Complexity:** O(n)

**Space Complexity:** O(1)

## Files

* `ExcelSheetColumnNumber.java`
