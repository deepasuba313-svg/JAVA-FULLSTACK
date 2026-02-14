📌 Overview

This project is a Java console-based Bank Management Simulation implemented using Object-Oriented Programming (OOP) concepts.
The system allows users to create an account, deposit money, withdraw money, view balance, and exit through a menu-driven interface.

🎯 Objective

To demonstrate the use of Encapsulation, Class & Object, and Method-based transaction handling in Java by building a simple banking system.

🧠 OOP Concepts Used

Class & Object – base class represents bank operations, object used in main program

Encapsulation – Account number and balance are private and accessed through methods

Method Abstraction – Each banking operation handled through separate methods

Data Hiding – Direct access to balance is restricted

⚙️ Features

Create bank account

Deposit money (validates positive amount)

Withdraw money (prevents invalid withdrawal)

View account balance

Exit system safely

Menu-driven continuous execution

🔄 Program Flow

The system welcomes the user and asks whether they want to continue.

If the user enters "Y", a menu-driven loop is displayed:

1. Add Account  
2. Deposit  
3. Withdraw  
4. View Balance  
5. Exit  


Based on the selected option:

Add Account → Creates a new bank account using bankacc()

Deposit → Adds money to account using amtdep()

Withdraw → Deducts money if valid using withdraw()

View Balance → Displays current balance using viewbalance()

Exit → Ends program using exit()

🏗 Class Structure

Class: base

Method	Description
bankacc(int)	Creates account
amtdep(int)	Deposits amount
withdraw(int)	Withdraws amount
viewbalance()	Displays balance
exit()	Exit message
▶️ Sample Execution
-----Welcome to Bank Management System-----
Do you want to use our system?
If yes please type "Y" else type "N"
Y

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

📊 Project Progress

✅ Step-1: Basic Single Transaction Version

✅ Step-2: Menu Driven Version

✅ Step-3: OOP Based Version

🔜 Next: Exception Handling + Advanced OOP + File Storage

💡 Key Highlights

Beginner-friendly OOP implementation

Demonstrates encapsulation and modular design

Supports multiple transactions in one execution

Prevents invalid deposit and withdrawal

Simple real-world banking simulation
