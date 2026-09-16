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

# Day 40- LeetCode Solutions

## Problem 2

**Problem Name:** Merge Two Binary Trees
**Problem Number:** 617
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

Given two binary trees, merge them into a single binary tree.

If two nodes overlap at the same position, add their values together.

If only one tree has a node at a particular position, use that existing node in the merged tree.

## Key Idea

Use **Recursion** to traverse both binary trees simultaneously.

* If `root1` is `null`, return `root2`.
* If `root2` is `null`, return `root1`.
* If both nodes exist, add their values.
* Recursively merge the left subtrees.
* Recursively merge the right subtrees.

## Approach

1. Start with the root nodes of both trees.
2. Check if either node is `null`.
3. If `root1` is `null`, return `root2`.
4. If `root2` is `null`, return `root1`.
5. Add the values of both nodes.
6. Recursively merge the left children.
7. Recursively merge the right children.
8. Return the merged tree.

## Example

**Input:**

```text id="r3qf6k"
Tree 1:        Tree 2:

    1              2
   / \            / \
  3   2          1   3
 /              \
5                4
```

**Output:**

```text id="3n0s5p"
      3
     / \
    4   5
   / \
  5   4
```

The overlapping node values are added together.

## Complexity

**Time Complexity:** `O(n)`
**Space Complexity:** `O(h)`

Where `n` is the number of nodes processed and `h` is the height of the tree.

## Files

* `MergeTwoBinaryTrees.java`

