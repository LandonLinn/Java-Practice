# Day 04 — Calculator

## What I Built
A console-based Java calculator that takes two numbers and an
operator from user input and returns the result. Built across
two classes separating calculator logic from the entry point.

## Project Structure
```
day-04-calculator/
├── Calc.java          — entry point, handles user input
├── Calculator.java    — encapsulates calculator logic
└── README.md
```

## Concepts Practiced
- **Encapsulation** — private instance variables, public methods
- **Constructor vs setters** — refactored to constructor for cleaner setup
- **Switch statement** — routing operations to correct calculation
- **Return type design** — `solve()` returns `double` instead of storing result
- **`Double.parseDouble()`** — converting String input to double
- **`charAt(0)`** — extracting char from String for operator
- **Class separation** — Calculator handles logic, Calc handles I/O

## How to Run
```bash
javac Calc.java Calculator.java
java Calc
```

## Sample Output
```
Enter 1st number: 10
Enter 2nd number: 5
Enter an operator (+, -, *, /, %): *
Answer: 50.0
```

## Bugs Found & Fixed
- **Invalid default case** — `Double.valueOf("Enter valid number.")`
  throws `NumberFormatException`. Fixed with a `println` instead.

## What I'd Improve Next
- Input validation — `try/catch` for non-numeric input
- Division by zero guard
- Loop to keep calculating until user exits
- Support chained calculations using previous answer

## Key Takeaway
> Constructors are cleaner than multiple setter calls when all
> values are known upfront.
