📌 Overview

This project is a Java console-based Bank Management Simulation that allows users to perform multiple banking operations using a menu-driven system. The program runs continuously until the user chooses to exit and supports basic account operations like account creation, deposit, withdrawal, and balance checking.

🎯 Objective

To implement a simple banking system using Java that demonstrates menu-driven programming, loops, conditional logic, and user interaction.

⚙️ Features

Add a new bank account

Deposit money (validates positive input)

Withdraw money (prevents invalid withdrawal)

View current balance

Exit system safely

Continuous execution using loop until user exits

🧠 Concepts Used

Java Basics (Variables, Input/Output)

Scanner for user input

Conditional Statements (if-else, switch)

Looping (while(true))

Basic transaction validation

🔄 Program Flow

The system welcomes the user and asks whether they want to use the program.

If the user enters "Y", the menu is displayed continuously:

1. Add Account  
2. Deposit  
3. Withdraw  
4. View Balance  
5. Exit  


Based on the selected option:

Add Account → User enters account number and account is created

Deposit → Accepts only positive amount and updates balance

Withdraw → Allows withdrawal only if amount is valid and less than balance

View Balance → Displays current bank balance

Exit → Terminates the program

If the user enters "N", the system exits with a message.

▶️ Sample Execution
-----Welcome to Bank Management System-----
Do you want to use our system?
If yes please type "Y" else type "N"
Y

Choose any one choice:

1.Add Account
2.Deposit
3.withdraw
4.Veiw Balance
5.Exit

Enter your choice: 1
Enter your account number: 12345
Account created successfully!!!

Enter your choice: 2
Enter the Deposit amount: 500
Deposited Amount: Rs. 500

Enter your choice: 3
Please enter the withdraw amount: 200
Balance Amount: Rs. 300

Enter your choice: 4
Your bank balance: 300

Enter your choice: 5
Exiting.....

📌 Project Characteristics

Console-based application

Beginner-friendly Java logic

Supports multiple transactions in one run

Prevents invalid deposit and withdrawal

Simple menu-driven implementation

📊 Status

🟢 Completed – Menu Driven Version
🔜 Next Step – OOP Version (Class & Object Based Bank System)
