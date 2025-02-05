# Kotlin Immutability Gotcha with map() and toMutableList()

This repository demonstrates a subtle but important distinction in Kotlin regarding immutability and mutability when using the `map()` function with lists.  The example shows how attempting to modify a list created by `map()` directly without creating a mutable copy first leads to unexpected or compile-time errors.

The `bug.kt` file shows the problematic code.  The `bugSolution.kt` file provides the correct approach using `toMutableList()` to create a mutable copy before modification.

This is a common pitfall for developers new to Kotlin's focus on immutability, and this example serves as a clear illustration of best practices.
