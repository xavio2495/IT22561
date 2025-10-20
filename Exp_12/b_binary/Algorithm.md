
## Algorithm

1. Initialization: On a sorted array, define a search space using `left` and `right` pointers at the start and end.
2. Find Midpoint: Calculate the middle index of the current search space.
3. Compare: Check if the element at the middle index is the target. If it matches, the search succeeds, and the index is returned.
4. Reduce Search Space: If it's not a match, discard the half where the target cannot exist by updating either the `left` or `right` pointer.
5. Repeat: Continue this process on the newly reduced search space.
6. Termination: If the `left` pointer crosses the `right` pointer, the search space is empty, and the search fails.