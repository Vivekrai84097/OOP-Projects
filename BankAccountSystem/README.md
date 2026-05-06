# Bank Account System (Java OOP Project)

## Project Overview
This is a basic **Bank Account System** built using **Java OOP concepts**.  
It simulates simple banking operations like:

- Deposit money
- Withdraw money
- Check current balance
- Minimum balance rule (₹500)

---

## OOP Concepts Used

### 1. Encapsulation
- `balance` is declared as `private`
- Direct access from outside the class is restricted

### 2. Constructor
- Used to initialize account with starting balance

### 3. Methods
- `deposit()`
- `withdraw()`
- `checkBalance()`

---

## Features

### Deposit
Adds money to account if amount is valid.

### Withdraw
Allows withdrawal only if:
- Amount > 0
- Remaining balance ≥ ₹500

### Check Balance
Displays total account balance.

---

## Minimum Balance Rule
The account must always maintain at least:

### ₹500

If withdrawal breaks this rule, transaction is rejected.

---

## Project Structure
```bash
BankAccountSystem/
 - Bank.java
 - BankAccountSystem.java