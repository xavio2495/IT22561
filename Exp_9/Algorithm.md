## Algorithm
1.  Initialize the queue with array, capacity, and pointers.
2.  Define `isEmpty()` and `isFull()` checks.
3.  Implement enqueue with `EnQ()`: Check `isFull()`. Update `r = (r+1) % cap`, insert item, increment `c`.
4.  Implement dequeue with `DeQ()`: Check `isEmpty()`. Save data, update `f = (f+1) % cap`, decrement `c`.
5.  Reset `f=-1, r=-1` if the queue becomes empty.
6.  Implement `Disp()`: Loop `c` times, using `(f+i) % cap` for circular printing.
7.  Execute Main: Test the queue with a sequence of enqueue and dequeue operations.