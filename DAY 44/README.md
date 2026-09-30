# Day 44 - LeetCode Solutions

## Problem 1

**Problem Name:** [Leaf-Similar Trees](https://leetcode.com/problems/leaf-similar-trees/)
**Problem Number:** 872
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

Given the roots of two binary trees, determine whether the two trees are leaf-similar.

Two binary trees are leaf-similar if their leaf value sequence is the same.

A leaf node is a node that has no left child and no right child.

The leaf values are considered from left to right.

## Input

```text
root1 = [3,5,1,6,2,9,8,null,null,7,4]
root2 = [3,5,1,6,7,4,2,null,null,null,null,9,8]
```

## Output

```text
true
```

## Explanation

The leaf nodes of the first tree are:

```text
6 → 7 → 4 → 9 → 8
```

The leaf nodes of the second tree are:

```text
6 → 7 → 4 → 9 → 8
```

Both trees have the same leaf value sequence.

Therefore, the result is `true`.

## Key Idea

Use **DFS (Depth First Search)** to traverse both binary trees and collect only the leaf node values.

A node is a leaf when:

```text
left == null && right == null
```

The leaf values are stored in an `ArrayList`.

Finally, compare the two lists.

If both lists are equal, return `true`; otherwise, return `false`.

## Approach

1. Create two `ArrayList` objects to store the leaf values of both trees.
2. Traverse the first tree using DFS.
3. Whenever a leaf node is found, add its value to the first list.
4. Traverse the second tree using DFS.
5. Whenever a leaf node is found, add its value to the second list.
6. Compare both lists using `equals()`.
7. If both lists contain the same values in the same order, return `true`.
8. Otherwise, return `false`.

## Example

**Input:**

```text
root1 = [3,5,1,6,2,9,8,null,null,7,4]
root2 = [3,5,1,6,7,4,2,null,null,null,null,9,8]
```

**Output:**

```text
true
```

**Explanation:**

```text
Tree 1 Leaf Sequence:
6 → 7 → 4 → 9 → 8

Tree 2 Leaf Sequence:
6 → 7 → 4 → 9 → 8

Both sequences are the same.
Therefore, the answer is true.
```

## Data Structure / Concept

**Data Structure:** ArrayList

**Concept:** Binary Tree, DFS, Recursion, Leaf Node Traversal

The solution uses DFS recursion to visit the nodes and an `ArrayList` to store the leaf values in left-to-right order.

## Complexity

**Time Complexity:** O(n + m)

Where `n` is the number of nodes in the first tree and `m` is the number of nodes in the second tree.

**Space Complexity:** O(n + m)

The space is used for storing the leaf values and the recursion stack.

## Files

* `Leaf-Similar Trees.java`

## LeetCode Link

https://leetcode.com/problems/leaf-similar-trees/

---

## Problem 2

**Problem Name:** [Projection Area of 3D Shapes](https://leetcode.com/problems/projection-area-of-3d-shapes/)
**Problem Number:** 883
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

You are given an `n × n` grid where `grid[i][j]` represents the height of a stack of cubes at position `(i, j)`.

Find the total area of the shape's projections onto the `xy`, `yz`, and `zx` planes.

The total projection area is the sum of the areas from the top, front, and side views.

## Input

```text
grid = [[1,2,0],[3,4,0],[0,0,1]]
```

## Output

```text
20
```

## Explanation

The total projection area is calculated from three views.

### Top View

Every cell with a value greater than `0` contributes `1` to the top projection.

```text
1 2 0
3 4 0
0 0 1
```

There are 5 non-zero cells.

```text
Top Area = 5
```

### Front View

For each row, take the maximum height.

```text
Row 1 → 2
Row 2 → 4
Row 3 → 1
```

```text
Front Area = 2 + 4 + 1 = 7
```

### Side View

For each column, take the maximum height.

```text
Column 1 → 3
Column 2 → 4
Column 3 → 1
```

```text
Side Area = 3 + 4 + 1 = 8
```

Therefore:

```text
Total Area = Top Area + Front Area + Side Area
           = 5 + 7 + 8
           = 20
```

## Key Idea

The projection area can be divided into three parts:

* **Top View:** Count every non-zero cell.
* **Front View:** Find the maximum value in every row.
* **Side View:** Find the maximum value in every column.

Add all three areas to get the final answer.

## Approach

1. Create a variable `area` to store the total projection area.
2. Traverse the 2D grid using nested loops.
3. If `grid[i][j] > 0`, add `1` for the top projection.
4. Find the maximum value in the current row.
5. Find the maximum value in the current column.
6. Add the row maximum and column maximum to the total area.
7. Return the final area.

## Example

**Input:**

```text
grid = [[1,2,0],[3,4,0],[0,0,1]]
```

**Output:**

```text
20
```

**Explanation:**

```text
Top Area = 5
Front Area = 7
Side Area = 8

Total Area = 5 + 7 + 8
           = 20
```

## Data Structure / Concept

**Data Structure:** 2D Array

**Concept:** Matrix Traversal, Row Maximum, Column Maximum

The solution uses nested loops to traverse the grid and calculates the top, front, and side projection areas.

## Complexity

**Time Complexity:** O(n²)

The grid contains `n × n` elements, and each element is visited once.

**Space Complexity:** O(1)

Only a few variables are used apart from the input grid.

## Files

* `Projection Area of 3D Shapes.java`

## LeetCode Link

https://leetcode.com/problems/projection-area-of-3d-shapes/
