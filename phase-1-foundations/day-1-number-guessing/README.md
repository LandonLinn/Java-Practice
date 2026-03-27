# Day 03 — Random Number Guessing Game

## What I Built
A console-based Java guessing game where the user tries to guess 
a randomly generated number between 1 and 10. Built across two 
classes separating entry point from game logic.

## Project Structure
```
day-03-random-number-game/
├── Main.java         — entry point, creates RandomNum and starts game
├── RandomNum.java    — handles random generation, user input, and result
└── README.md
```

## Concepts Practiced
- **Encapsulation** — private field, public methods only
- **`Math.random()`** — generating a random double and casting to int
- **Type casting** — `(int)(Math.random() * 10) + 1` for range 1–10
- **`Integer.parseInt()`** — converting String input to int (not casting)
- **Scanner** — reading user input from the console
- **Class separation** — `Main` as entry point, `RandomNum` as logic owner

## How to Run
```bash
javac Main.java RandomNum.java
java Main
```

## Sample Output
```
Guess a number 1-10: 7
Sorry, the correct answer is: 3
```

## Bugs & Issues Encountered
- **`cannot be resolved to a type`** — IDE was not resolving `RandomNum` 
  from `Main`. Code compiled and ran correctly in terminal. Root cause: 
  VS Code workspace config, not a code error. Always verify in terminal 
  before assuming the code is wrong.
- **Invalid cast** — attempted `(int) sc.nextLine()` which fails because 
  `String` cannot be cast directly to `int`. Fixed with `Integer.parseInt()`.

## What I'd Improve Next
- Loop until the user guesses correctly
- Add a score tracker across multiple rounds
- Validate input range — reject guesses outside 1–10
- Move Scanner out of the method

## Key Takeaway
> `String` and `int` are not compatible for casting — use 
> `Integer.parseInt()` to convert. Always verify bugs in terminal
