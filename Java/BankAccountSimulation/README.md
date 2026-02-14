💻 Bank Account Simulation (Basic Version)

This program is a simple Java console-based Bank Management Simulation that performs basic banking operations such as deposit and withdrawal in a single execution.

The system interacts with the user, validates inputs, updates the balance, and ensures invalid transactions are prevented.

⚙️ How the Program Works

When the program starts, it welcomes the user and asks whether they want to use the system.

If the user enters "Y", the following steps are executed:

The user enters their Bank Account Number

The user enters a Deposit Amount

Deposit must be greater than 0

If valid, the amount is added to the balance

The user enters a Withdrawal Amount

Withdrawal must be greater than 0 and less than available balance

Prevents the balance from becoming zero

The program displays the remaining balance

If the user enters "N", the program exits safely with a message.

📚 Concepts Used

Java Basics (Variables, Input/Output)

Conditional Statements (if-else)

User Input using Scanner

Basic Validation Logic

Simple Banking Transaction Simulation

📌 Program Characteristics

Console-based application

Performs single deposit and single withdrawal

Prevents invalid deposit and withdrawal

Ensures balance never becomes zero

Beginner-friendly Java logic

▶️ Sample Execution
-----Welcome to Bank Management System-----
Do you want to use our system?
If yes please type "Y" else type "N"
Y

Please enter your account number:
12345

Enter the Deposit amount:
500
Deposited Amount: Rs. 500

Please enter the withdraw amount:
200
Balance Amount: Rs. 300

📊 Status

🟢 Completed – Basic Version
🟡 Next: Menu-Driven Version (Multiple Transactions)          
