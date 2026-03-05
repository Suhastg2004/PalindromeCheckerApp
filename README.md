# Palindrome Checker App

A Java console-based application that demonstrates multiple methods for checking whether a string is a palindrome. The project is structured into Use Cases (UC1–UC13), each introducing a new concept, data structure, or algorithm.

---

## 📌 Project Objective

The goal of the Palindrome Checker App is to help learners understand:

- Java fundamentals  
- Loops, conditionals, recursion  
- Arrays, stacks, queues, deques, linked lists  
- Object-oriented principles  
- Strategy Pattern  
- Performance benchmarking  
- Clean, modular Java code  

Each use case is a small, focused feature that builds toward a complete learning project.

---

## 📚 Use Cases Overview

### **UC1 – Welcome Message**
Displays application name, version, and welcome text.

### **UC2 – Hardcoded Palindrome Check**
Checks a fixed string such as `"madam"` using simple comparison.

### **UC3 – Palindrome Using Reverse String**
Reverses the string using a loop and compares with the original.

### **UC4 – Character Array Two-Pointer**
Uses a `char[]` and compares characters from both ends.

### **UC5 – Stack-Based Palindrome**
Uses Java’s built-in `Stack` to push/pop characters.

### **UC6 – Queue + Stack**
Uses both `Queue` (`FIFO`) and `Stack` (`LIFO`) to compare dequeue vs pop.

### **UC7 – Deque-Based Palindrome**
Uses `ArrayDeque` to compare front and end characters efficiently.

### **UC8 – LinkedList-Based Palindrome**
Uses Java’s built-in `LinkedList` to compare elements at symmetric positions.

### **UC9 – Recursive Palindrome**
Checks palindrome using a recursive function that compares the outer characters.

### **UC10 – Case-Insensitive & Space-Ignored Palindrome**
Normalizes the input by removing spaces and converting to lower case.

### **UC11 – Object-Oriented Palindrome Service**
Implements a `PalindromeChecker` class with a public `checkPalindrome()` method.

### **UC12 – Strategy Pattern for Palindrome Algorithms**
Implements:
- `PalindromeStrategy` interface  
- `StackStrategy` and `DequeStrategy`  
- `PalindromeContext` to switch algorithms dynamically  

### **UC13 – Performance Comparison**
Benchmarks all algorithms using the same input string and `System.nanoTime()`:
1. Two-pointer  
2. Reverse string  
3. Char array  
4. Stack  
5. Queue + Stack  
6. Deque  
7. LinkedList  
8. Recursion  

---

## 🗂 Project Structure (Suggested)
