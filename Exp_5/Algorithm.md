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

## Program Output
```
        Singly Linked List Operations
Menu:
1. Create new list
2. Insert value into list
3. Delete last value from list       
4. Delete list
5. Display list
6. Search for a value
7. Exit
Choose an option: 1
Creating new list.

Enter the number of nodes: 5
Enter value for node 1: 3
List: 3 -> NULL
Enter value for node 2: 9
List: 3 -> 9 -> NULL
Enter value for node 3: 11
List: 3 -> 9 -> 11 -> NULL
Enter value for node 4: 5
List: 3 -> 9 -> 11 -> 5 -> NULL
Enter value for node 5: 8
List: 3 -> 9 -> 11 -> 5 -> 8 -> NULL
        Singly Linked List Operations
Menu:
1. Create new list
2. Insert value into list
3. Delete last value from list
4. Delete list
5. Display list
6. Search for a value
7. Exit
Choose an option: 2
Enter value to insert: 14
List: 3 -> 9 -> 11 -> 5 -> 8 -> 14 -> NULL
        Singly Linked List Operations
Menu:
1. Create new list
2. Insert value into list
3. Delete last value from list
4. Delete list
5. Display list
6. Search for a value
7. Exit
Choose an option: 3
Deleting last node.
List: 3 -> 9 -> 11 -> 5 -> 8 -> NULL
        Singly Linked List Operations
Menu:
1. Create new list
2. Insert value into list
3. Delete last value from list
4. Delete list
5. Display list
6. Search for a value
7. Exit
Choose an option: 5
List: 3 -> 9 -> 11 -> 5 -> 8 -> NULL
        Singly Linked List Operations
Menu:
1. Create new list
2. Insert value into list
3. Delete last value from list
4. Delete list
5. Display list
6. Search for a value
7. Exit
Choose an option: 6
Enter value to search: 8
Value: 8
Position: 5
        Singly Linked List Operations
Menu:
1. Create new list
2. Insert value into list
3. Delete last value from list
4. Delete list
5. Display list
6. Search for a value
7. Exit
Choose an option: 4
List deleted.
        Singly Linked List Operations
Menu:
1. Create new list
2. Insert value into list
3. Delete last value from list
4. Delete list
5. Display list
6. Search for a value
7. Exit
Choose an option: 7
Exiting...
```