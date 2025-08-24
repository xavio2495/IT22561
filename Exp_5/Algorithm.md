## Algorithm:
1. **Start** the program and initialize an empty linked list (`head = null`).
2. **Display menu** of operations (Create, Insert, Delete Last, Delete List, Display, Search, Exit).
3. **Read user’s choice**.
4. **If Create**:
   * Ask for number of nodes.
   * For each node, read data and insert at the end.
5. **If Insert**:
   * Read new data.
   * Create a node and append at the end of the list.
6. **If Delete Last**:
   * If list empty → print message.
   * Else remove last node by traversing till second-last node.
7. **If Delete List**:
   * Set `head = null` to clear the entire list.
8. **If Display**:
   * Traverse from head, printing each node’s value in order.
9. **If Search**:
   * Traverse from head, comparing each node’s value.
   * Print position if found, else print "not found".
10. **If Exit**: Stop program, otherwise go back to Step 2.
