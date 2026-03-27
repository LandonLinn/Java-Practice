# Day 01 — BankAccount

## What I Built
A BankAccount class in Java demonstrating core OOP principles 
including encapsulation, constructors, instance methods, and 
basic guard logic.

## Concepts Practiced
- Encapsulation — private fields, public methods only
- Constructors — initializing object state with `this`
- Instance methods — deposit, withdraw, getBalance
- Guard clause — preventing withdrawal when funds are insufficient
- `toString()` override — clean object representation

## How to Run
```bash
javac BankAccount.java
java BankAccount
```

## Sample Output
```
After deposit: 300000.0
After withdraw: 250000.0
Insufficient Funds
```

## Key Takeaway
> Private fields + public methods = controlled access.
> Nothing outside the class should directly touch internal state.
> Guard clauses fail fast and keep methods clean.
