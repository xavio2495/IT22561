## Algorithm

1.  Initialize the queue with an array, capacity, and pointers `f=0`, `r=-1`, `c=0`.
2.  Define `isEmpty()` and `isFull()` checks.
3.  Implement `EnQ()`: Check for `isFull()`, then increment `r`, insert item at `arr[r]`, and increment `c`.
4.  Implement `DeQ()`: Check for `isEmpty()`, then save `arr[f]`, increment `f`, and decrement `c`.
5.  Reset `r=-1` if the queue is empty after `DeQ`.
6.  Implement `Disp`: Iterate and print elements from index `f` to `r`.
7.  Execute Main: Instantiate the queue and perform the sequence of `EnQ` and `DeQ` operations.