## Algorithm

1.  Define a **`Node`** with **`data`** and a **`next`** pointer.
2.  Initialize the Stack's `top` pointer to `null`.
3.  Implement **`isEmpty()`** by checking if `top` is `null`.
4.  Implement **`push()`** by creating a **new Node**, linking it to the current `top`, and making it the new `top`.
5.  Implement **`pop()`** by checking for emptiness, saving the `top`'s data, and advancing `top` to the next node.
6.  Implement **`peek()`** to return the `top` node's data without moving the pointer.
7.  Implement **`display()`** by traversing the list from `top` and printing each node's data.
8.  Instantiate the Stack object.
9. Demonstrate operations with calls to  **`push`**, **`display`**, **`peek`**, and **`pop`**.