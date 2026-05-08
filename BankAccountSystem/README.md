# Banking Application (Java OOP)

## Classes

### BankAccount
- accountNumber
- accountHolderName
- balance

Methods:
- deposit()
- withdraw()
- displayAccountDetails()

---

### SavingAccount extends BankAccount
- interestRate

Methods:
- addInterest()

---

### CurrentAccount extends BankAccount
- interestRate

Methods:
- displayAccountDetails() (override)

---

## Main Class
- BankingApplication
- Creates objects and performs operations:
  - deposit
  - withdraw
  - addInterest
  - displayAccountDetails
