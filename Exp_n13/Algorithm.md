## Algorithm
1. **Base Case**: If subarray size ≤ 1, return (already sorted).
2. **Choose Pivot**: Select last element as pivot.
3. **Partition**:
   - Initialize `i` as boundary for ≤ pivot elements.
   - Iterate from start to end-1: If element ≤ pivot, swap with next position after `i` and increment `i`.
   - Swap pivot with position after `i`.
   - Return pivot's final index.
4. **Recurse**: Sort left subarray (before pivot) and right subarray (after pivot).

## Program Output
```
   QUICK SORT
Original array:    
5 14 6 1 -17 2 -1 4 
Sorted array:       
-17 -1 1 2 4 5 6 14
```