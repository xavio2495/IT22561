## Algorithm
1.  Initialize an empty stack.
2.  Read the postfix expression from **left to right**.
3.  If the current character is an **operand**, push it onto the stack.
4.  If the current character is an **operator**, pop the top two elements from the stack:
     The first popped element is the **second operand**.
     The second popped element is the **first operand**.
5.  Apply the operator to these two operands, and push the **result** back onto the stack.
6.  Continue this process until the entire postfix expression has been scanned.
7.  The final result will be the single element remaining on the top of the stack.
8.  Print the result.

## Program Output
```
Infix to Postfix Conversion

Infix Expression:  a+b*(c^d-e)^(f+g*h)-i
Postfix Expression: abcd^e-fgh*+^*+i- 
```