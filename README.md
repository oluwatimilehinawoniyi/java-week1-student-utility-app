# Student Utility App

A simple, interactive Java console application designed for students to perform basic mathematical operations and utility tasks.

## Features

The application provides a user-friendly menu with the following capabilities:
- **Add two numbers**: Performs basic addition.
- **Check Even/Odd**: Determines if a given integer is even or odd.
- **Number Sequence**: Prints all numbers from 1 to a specified number N.
- **Day of the Week**: Converts a number (1-7) to its corresponding day name (Sunday-Saturday).
- **Graceful Exit**: Allows users to safely close the application.

## Prerequisites

- **Java Development Kit (JDK)**: Version 25 or higher (as specified in `pom.xml`).
- **Apache Maven**: For building and managing project dependencies.

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/oluwatimilehinawoniyi/java-week1-student-utility-app.git
   cd "student utility app"
   ```

2. **Build the project**:
   Use Maven to compile the source code:
   ```bash
   mvn clean compile
   ```

## Usage

To run the application, use the following Maven command:

```bash
mvn exec:java -Dexec.mainClass="com.Main"
```

Once launched, follow the on-screen prompts to select an option and interact with the utility.

### Example Interaction

```text
 ===== STUDENT UTILITY APP =====
 1. Add two numbers
 2. Check if a number is EVEN or ODD
 3. Print numbers from 1 to N
 4. Display day of the week
 5. Exit
 
 Enter your choice: 1
 Enter first number: 10
 Enter second number: 5
 Sum: 15
```

## Project Structure

- `src/main/java/com/Main.java`: The entry point of the application handling user input and menu logic.
- `src/main/java/com/utilities/Utilities.java`: Contains the core logic for the utility functions.
- `pom.xml`: Maven configuration file.
