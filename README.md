# Subsets of Array (Recursion + Lexicographical Order)

This Java program generates **all subsets** of a given array of distinct positive integers using **recursion**.

---

## 📋 Problem Description

Given an array `A` with `N` distinct positive integers, the task is to print all **possible subsets** of the array (excluding the empty set) in **lexicographically sorted order**.

---

## 🧮 Example

### Input:
3
10 15 20


### Output:
10
10 15
10 15 20
10 20
15
15 20
20



---

## 💡 Explanation
All possible subsets of the array `[10, 15, 20]` have been printed in sorted (lexicographic) order.

---

## ⚙️ Algorithm Steps
1. Use **recursion** to explore all subsets:
   - Include the current element.
   - Exclude the current element.
2. Skip the empty subset.
3. Sort the subsets lexicographically before printing.

---
🧰 Requirements
Java 8 or higher

Any Java IDE (IntelliJ IDEA, VS Code, Eclipse)


🧩 Topics Covered
Recursion

Arrays

Sorting

📄 License
This project is open-source and available under the MIT License.

