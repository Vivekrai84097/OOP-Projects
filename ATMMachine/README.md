# ATM Machine (Java OOP Project)

## Project Overview
This is a basic **ATM Machine System** developed using **Java OOP concepts**.  
It simulates core ATM functionalities such as:

- PIN Verification
- Withdraw Money
- Check Account Balance
- Secure access using PIN

---

## OOP Concepts Used

### 1. Encapsulation
- `balance` and `PIN` are declared as `private`
- Sensitive data is protected from direct external access

### 2. Constructor
- Initializes ATM with starting balance and valid 4-digit PIN

### 3. Methods
- `verifyPin()`
- `withdrawMoney()`
- `checkBalance()`

---

## Features

### PIN Verification
Checks whether the entered PIN matches the stored PIN.

### Withdraw Money
Allows withdrawal only if:
- PIN is correct
- Amount > 0
- Amount ≤ Available Balance

### Check Balance
Displays available balance only after correct PIN entry.

---

## Security Rule
Only users with the correct **4-digit PIN** can access sensitive operations.

---

## Project Structure
```bash
ATMMachine/
 - ATM.java
 - ATMMachine.java