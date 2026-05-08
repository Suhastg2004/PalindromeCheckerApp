# Palindrome Checker App

A Java console-based learning project that demonstrates multiple ways to check whether a string is a palindrome.

## Project Objective

This repository is designed to help learners practice:

- Core Java fundamentals
- Loops, conditionals, and recursion
- Data structures like arrays, stacks, queues, deques, and linked lists
- Object-oriented design
- Strategy Pattern
- Basic performance benchmarking

## Use Cases (UC1–UC13)

1. **UC1 – Welcome Message**: Display app name/version and welcome text.
2. **UC2 – Hardcoded Palindrome Check**: Check a fixed string (e.g., `madam`).
3. **UC3 – Reverse String Method**: Reverse and compare with original.
4. **UC4 – Two-Pointer Char Array**: Compare chars from both ends.
5. **UC5 – Stack-Based Check**: Use `Stack` push/pop operations.
6. **UC6 – Queue + Stack**: Compare dequeue vs pop behavior.
7. **UC7 – Deque-Based Check**: Compare front/back efficiently using `ArrayDeque`.
8. **UC8 – LinkedList-Based Check**: Compare symmetric positions in `LinkedList`.
9. **UC9 – Recursive Check**: Compare outer chars recursively.
10. **UC10 – Normalized Input Check**: Ignore spaces and case.
11. **UC11 – OOP Service Class**: Encapsulate logic in a `PalindromeChecker` class.
12. **UC12 – Strategy Pattern**: Switch algorithms via strategy implementations.
13. **UC13 – Performance Comparison**: Benchmark approaches with `System.nanoTime()`.

## Getting Started

### Prerequisites

- Java 17+ (or your course-required Java version)
- A terminal/command prompt

### Clone Repository

```bash
git clone https://github.com/Suhastg2004/PalindromeCheckerApp.git
cd PalindromeCheckerApp
```

### Build and Run

If your Java files are under a `src` folder and the entry point is `Main.java`, you can use:

```bash
javac src/Main.java
java -cp src Main
```

If you use packages, compile all files and run with the fully qualified class name:

```bash
javac -d out src/**/*.java
java -cp out com.example.Main
```

> Note: `src/**/*.java` is a bash/zsh-style glob pattern. On shells that do not support it, list files explicitly (for example, `javac -d out src/Main.java src/utils/Helper.java`).

## Learning Focus

This project is intentionally structured as progressive use cases so each step builds on the previous one and introduces one new concept at a time.

## Contributing

Contributions are welcome. Feel free to open an issue or pull request to improve examples, add tests, or enhance documentation.

## License

Add your preferred license (for example, MIT) in a `LICENSE` file if not already present.
