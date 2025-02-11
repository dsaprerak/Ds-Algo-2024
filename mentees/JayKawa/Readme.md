# Algorithm and Data Structures Implementation

## Description
This project contains implementations of popular algorithms and data structures in Java, along with solutions to several coding problems. The project is structured into three main folders:
1. **Algorithms**: Contains sorting and searching algorithms.
2. **Data Structures**: Includes implementations of stacks, queues, and linked lists.
3. **Test**: Contains solutions to specific coding problems.

## Folder Structure
- `Algorithm/`: Contains Java implementations of sorting and searching algorithms.
  - **Bubble Sort**
  - **Quick Sort**
  - **Linear Search**
  - **Binary Search**
  
- `DataStructures/`: Contains Java implementations of fundamental data structures.
  - **Stack** - Array-based
  - **Queue** - Array-based
  - **Linked List** 

- `Test/`: Solutions to coding problems.
  - **Problem 1**: Climbing Stairs 
  - **Problem 2**: Kth Largest Element in Array 
  - **Problem 3**: Finding Numbers with Odd Occurrence

## Algorithms Implemented

### 1. Bubble Sort
Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

### 2. Quick Sort
Quick sort is an efficient divide-and-conquer algorithm. It picks an element as a pivot and partitions the given array around the picked pivot.

### 3. Linear Search
Linear search is a simple searching algorithm that checks every element in the array until it finds the target value.

### 4. Binary Search
Binary search is an efficient algorithm for finding an item from a sorted list by repeatedly dividing the search interval in half.

## Data Structures Implemented

### 1. Stack
Implemented stack operations using Array. A stack is a Last In First Out (LIFO) data structure.

### 2. Queue
Implemented queue operations using Array. A queue is a First In First Out (FIFO) data structure.

### 3. Linked List
Created a custom implementation of a singly linked list to handle dynamic data storage.

## Problem Solving

### Problem 1: Climbing Stairs
Given `n` steps to reach the top of a staircase, you can either take 1 or 2 steps at a time. This problem calculates the number of distinct ways to reach the top using dynamic programming.

**Example:**
```plaintext
Input: n = 3
Output: 3
Explanation: There are three ways to reach the top:
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
```

### Problem 2: Kth Largest Element

Given an array of integers `nums` and an integer `k`, the task is to return the `kth largest` element in the array. This problem can be solved using sorting or a heap.

```plaintext
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
```
### Problem 3: Finding Numbers with Odd Occurrence

Given an `array` of integers the goal is to find the numbers whose occurrence in the array is `odd`.

```plaintext
Input: [1, 3, 4, 2, 4, 1, 4]
Output: [3, 4, 2]
Explanation: 3 and 2 appear once, and 4 appears three times.
```