# Day 02 — Quiz App

## What I Built
A console-based Java quiz application that presents multiple choice
questions, collects user input, and calculates a final score.
Built across three classes following a basic service layer pattern.

## Project Structure
```
day-02-quiz-app/
├── Main.java            — entry point, runs the quiz
├── Question.java        — model class representing a question
├── QuestionService.java — handles quiz logic, scoring, and I/O
```

## Concepts Practiced
- Classes and objects — Question as a data model
- Encapsulation — private fields with getters and setters
- Constructors — initializing Question objects with all fields
- Arrays — storing questions and user selections
- Loops — iterating questions and options with index-based char mapping
- Scanner — reading user input from the console
- Service layer pattern — separating data (Question) from logic (QuestionService)
- String comparison — `.equals()` for answer checking

## How to Run
```bash
javac Main.java Question.java QuestionService.java
java Main
```

## Key Takeaway
> Separating data (Question) from logic (QuestionService) is the 
> foundation of clean architecture — the same pattern used in