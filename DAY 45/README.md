# Day 45 - LeetCode Solutions

## Problem 1

**Problem Name:** [Lemonade Change](https://leetcode.com/problems/lemonade-change/)
**Problem Number:** 860
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

At a lemonade stand, each lemonade costs `$5`.

Customers are standing in a queue and pay with either a `$5`, `$10`, or `$20` bill.

For each customer, you must provide the correct change using the bills you currently have.

Return `true` if you can provide the correct change to every customer; otherwise, return `false`.

## Input

```text
bills = [5,5,5,10,20]
```

## Output

```text
true
```

## Explanation

The lemonade costs `$5`.

The customers pay in the following order:

```text
$5  → No change needed
$5  → No change needed
$5  → No change needed
$10 → Give $5 as change
$20 → Give $10 + $5 as change
```

Therefore, every customer receives the correct change.

So the answer is:

```text
true
```

## Key Idea

Use two variables to keep track of the number of `$5` and `$10` bills available.

When a customer gives:

* `$5` → Add one `$5` bill.
* `$10` → Give one `$5` as change and receive one `$10` bill.
* `$20` → First try to give `$10 + $5`. If that is not possible, give three `$5` bills.

If the required change cannot be provided, return `false`.

## Approach

1. Create two variables `five` and `ten`.
2. Traverse each bill in the array.
3. If the customer gives `$5`, increase `five`.
4. If the customer gives `$10`, check whether a `$5` bill is available.
5. If no `$5` bill is available, return `false`.
6. If the customer gives `$20`, first try to give `$10 + $5`.
7. If `$10 + $5` is not available, try to give three `$5` bills.
8. If neither option is possible, return `false`.
9. If all customers are successfully served, return `true`.

## Example

**Input:**

```text
bills = [5,5,5,10,20]
```

**Output:**

```text
true
```

**Explanation:**

```text
5  → five = 1
5  → five = 2
5  → five = 3
10 → give 5 → five = 2, ten = 1
20 → give 10 + 5 → five = 1, ten = 0
```

Every customer receives the correct change.

## Data Structure / Concept

**Data Structure:** Variables / Counters

**Concept:** Greedy Algorithm

The solution processes customers in order and always tries to use `$10 + $5` first when giving change for a `$20` bill.

## Complexity

**Time Complexity:** O(n)

Each bill is processed once.

**Space Complexity:** O(1)

Only two counters are used.

## Files

* `Lemonade Change.java`

## LeetCode Link

https://leetcode.com/problems/lemonade-change/

---
# Day 45 - LeetCode Solutions

## Problem 2

**Problem Name:** [Find Common Characters](https://leetcode.com/problems/find-common-characters/)
**Problem Number:** 1002
**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java

## Problem Statement

Given a string array `words`, return a list of all characters that show up in all strings within the array, including duplicate characters.

If a character appears multiple times in every word, it should be included multiple times in the result.

## Input

```text
words = ["bella","label","roller"]
```

## Output

```text
["e","l","l"]
```

## Explanation

The characters that appear in all three words are:

```text
bella  → e, l, l
label  → e, l, l
roller → e, l, l
```

Therefore, the common characters are:

```text
["e","l","l"]
```

The character `l` appears twice in every word, so it is included twice in the result.

## Key Idea

Use a frequency array of size `26` to store the count of each lowercase English character.

First, count the characters in the first word.

For every remaining word, count its characters and keep the minimum frequency for each character.

The minimum frequency represents how many times that character appears in all words.

## Approach

1. Create an integer array of size `26` to store character frequencies.
2. Count all characters in the first word.
3. For each remaining word, create another frequency array.
4. Count the characters in the current word.
5. For each character from `a` to `z`, keep the minimum frequency between the previous count and the current count.
6. After processing all words, the frequency array contains the common characters.
7. Add each character to the result according to its minimum frequency.
8. Return the result list.

## Example

**Input:**

```text
words = ["bella","label","roller"]
```

**Output:**

```text
["e","l","l"]
```

**Explanation:**

```text
bella:
e → 1
l → 2

label:
e → 1
l → 2

roller:
e → 1
l → 2
```

Minimum frequencies:

```text
e → 1
l → 2
```

Therefore:

```text
["e","l","l"]
```

## Data Structure / Concept

**Data Structure:** Array / `int[26]`

**Concept:** Frequency Counting / Minimum Frequency

The solution uses a frequency array to count how many times each character appears and keeps the minimum frequency across all words.

## Complexity

**Time Complexity:** O(n × k + 26 × n)

Where `n` is the number of words and `k` is the average length of the words.

**Space Complexity:** O(26)

The solution uses fixed-size frequency arrays for the 26 lowercase English letters.

## Files

* `Find Common Characters.java`

## LeetCode Link

https://leetcode.com/problems/find-common-characters/
