# Employee Salary System

## Overview
This is a Java OOP project based on **Abstraction** and **Method Overriding**.

The system calculates salary for different types of employees:
- FullTime Employee
- PartTime Employee

Each employee type has its own salary calculation logic.

---

## Concepts Used
- Abstract Class
- Method Overriding
- Inheritance
- Constructor
- Runtime Polymorphism

---

## Class Structure

### Abstract Class
`Employee`

Method:
- `calculateSalary()`

---

### Child Classes

#### 1. FullTime
- Fixed salary: 40000
- Overrides `calculateSalary()`

#### 2. PartTime
- Salary calculated using:
  `days × ratePerHour × hours`
- Uses constructor for input validation
- Overrides `calculateSalary()`

---

## Sample Output

```text
Full Time Salary : 40000
Part Time Salary : 16000
```

---

## Example Input Used

```java
PartTime(20, 100, 8)
```

---

## Learning Purpose
This project helps to understand:
- Abstraction in Java
- Real-world salary calculation logic
- Constructor validation
- Runtime polymorphism

---

## Author
Vivek Kumar