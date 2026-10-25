# Assignment 5: Strategy Design Pattern — Calculator Domain

**Student:** Akzhigit Agabekov

**Group:** SE-2523

**Course:** Software Design Patterns (ShP-2216)

**Academic Year:** 2026–2027

## 📌 Project Overview

This project demonstrates the **Strategy Behavioral Design Pattern** implemented in Java (JDK 17) for Option B (Calculator).

The application encapsulates interchangeable mathematical algorithms (`AddStrategy`, `SubtractStrategy`, `MultiplyStrategy`, `DivideStrategy`) behind a unified interface (`OperationStrategy`). The `CalculatorContext` delegates computation to the active strategy, enabling runtime strategy switching without conditional logic (`if/else` or `switch`).

## 🛠 Project Structure

```
src/
├── context/
│   └── CalculatorContext.java
├── strategy/
│   ├── OperationStrategy.java
│   ├── AddStrategy.java
│   ├── SubtractStrategy.java
│   ├── MultiplyStrategy.java
│   └── DivideStrategy.java
└── Main.java

```

## 🚀 How to Build & Run

1. Clone the repository:

   ```
   git clone https://github.com/Akzhig1t01/Assignment5-Strategy-Pattern.git
   
   ```

2. Open the project in **IntelliJ IDEA** (configured for JDK 17).

3. Build the project (`Ctrl + F9` / `Cmd + F9`).

4. Run `src/Main.java`.

## ➕ How to Add a New Strategy

1. Create a new class inside `src/strategy/` implementing `OperationStrategy` (e.g., `PowerStrategy.java`).

2. Implement the `execute(double a, double b)` method:

   ```
   package strategy;
   
   public class PowerStrategy implements OperationStrategy {
       @Override
       public double execute(double a, double b) {
           return Math.pow(a, b);
       }
   }
   
   ```

3. Pass the new strategy instance to `calculator.setStrategy(new PowerStrategy())` at runtime.

*Note: Neither `CalculatorContext` nor existing strategy classes need to be modified, adhering to the Open/Closed Principle (OCP).*

## 📜 Commit History Strategy

The repository features an incremental commit history following clean git practices:

1. `Initial commit: Add project structure and gitignore`

2. `feat: Implement OperationStrategy interface and concrete strategy classes`

3. `feat: Implement CalculatorContext supporting dynamic strategy switching`

4. `test: Add runtime strategy demonstration scenarios in Main`

5. `docs: Add UML class diagram and Clean Code report for Assignment 5`