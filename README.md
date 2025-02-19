# Bank Management System

## Overview

This is a simple **Bank Management System** implemented in Java following **SOLID principles**. The system consists of two main roles:

1. **Client Side (Customers)** - Customers can manage their accounts, deposit, withdraw, and transfer money.
2. **Admin Side** - Administrators can create, view, and delete customer accounts.

## Features

### Client Features

- View account balance.
- Deposit money.
- Withdraw money.
- Transfer funds to another account.

### Admin Features

- Create new customer accounts.
- View all customer accounts.
- Remove customer accounts.

## SOLID Principles Applied

- **Single Responsibility Principle (SRP)**: Each class has a single responsibility.
- **Open/Closed Principle (OCP)**: The system is open for extension but closed for modification.
- **Liskov Substitution Principle (LSP)**: Subtypes can replace their base types without affecting functionality.
- **Interface Segregation Principle (ISP)**: Separate interfaces for customer and admin operations.
- **Dependency Inversion Principle (DIP)**: High-level modules depend on abstractions, not concrete implementations.

## Technologies Used

- Java (Core OOP principles)
- Collections Framework
- Exception Handling

## How to Run

1. Clone the repository:

   ```sh
   git clone https://github.com/yourusername/bank-management-system.git
   ```

2. Navigate to the project folder:

   ```sh
   cd bank-management-system
   ```

3. Compile the Java files:

   ```sh
   javac Main.java
   ```

4. Run the program:

   ```sh
   java Main
   ```
