
1.  Set up project: Create `MyBankApp` folder, with `bank/Bank.java` and `Main.java` in respective locations.
2.  In `Bank.java`, declare `package bank;` and define account attributes (number, name, balance, type, pin).
3.  Implement methods for bank operations (create, display, withdraw, deposit, change PIN, check balance, close) within `Bank.java`.
4.  In `Main.java`, `import bank.*;` to access the `Bank` class.
5.  In `Main.java`'s `main` method, initialize a `Scanner` and create a `Bank` object (`bankAcc`).
6.  Display a welcome message.
7.  Start an infinite loop for the main menu.
8.  Display menu options: Create, Display, Withdraw, Deposit, Change PIN, Check Balance, Close Account, Exit.
9.  Read the user's integer choice.
10. Use a `switch` statement to handle the user's choice.
11. If choice is 1, 2, 3, 4, 5, 6, or 7, call the corresponding `bankAcc` method (`createAccount`, `displayAccount`, `withdraw`, `deposit`, `changePin`, `checkBalance`, `closeAccount`).
12. If choice is 8 (Exit), print exit message, close the scanner, and terminate the program.
13. If the choice is any other number, print "Invalid choice."
14. Continue the loop to redisplay the menu.
15. End of program.