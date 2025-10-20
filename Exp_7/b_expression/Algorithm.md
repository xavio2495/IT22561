## Algorithm

1.	Initialize an empty stack
2.	Scan the postfix expression from left to right.
3.	If the character is an operand,then push it onto the stack
4.	If the character is an operator:
    - Pop top two elements from stack as val-2 and val-1.
    - Apply the operator (val-1 op val-2)
    - Push the result back onto the stack
5.	After scanning all characters, the final result is stored on top of the stack
6.	Print the result
