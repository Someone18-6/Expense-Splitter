# Expense Splitter

## Problem Statement

Managing shared expenses during trips, outings, and group activities can be challenging. Different people pay for different expenses, making it difficult to track balances and determine who owes whom. This project provides an automated solution to record expenses, calculate balances, and minimize settlement transactions.

## Why I Built This

During group trips with friends, tracking expenses manually became confusing and time-consuming. Calculating balances often led to mistakes and disagreements. I built this application to simplify expense tracking and automate settlements.

## Features

- Add users
- Create groups
- Record expenses
- Calculate balances automatically
- Track who owes whom
- Minimize settlement transactions
- Store expense history

## Tech Stack

- Java
- PostgreSQL
- JDBC / Spring Boot
- Git
- GitHub

## Project Structure

```text
src/
├── model/
├── service/
├── database/
├── utils/
└── main/
```

## How It Works

1. Create users
2. Create a group
3. Add expenses
4. Calculate balances
5. Generate optimized settlements

## Example

### Expense

```text
Trip Dinner: ₹900

Paid By: Shasank

Participants:
- Shasank
- Akshaj
- Chetan
```

### Output

```text
Chetan owes Shasank ₹2000
Akshaj owes Shasank ₹3000
```

## Challenges Solved

- Shared expense tracking
- Balance calculation
- Debt management
- Settlement optimization

## Future Enhancements

- User authentication
- Group invitations
- Expense categories
- Monthly reports
- Data visualization
- Mobile application

## Installation

```bash
git clone https://github.com/yourusername/ExpenseSplitter.git
```

```bash
cd ExpenseSplitter
```

Run the project using your preferred IDE.

## Author

Shasank
