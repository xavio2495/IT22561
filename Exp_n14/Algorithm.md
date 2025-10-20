## Algorithm
1. **Base Case**: If subarray size ≤ 1, return (already sorted).
2. **Divide**: Compute mid-point; recursively sort left half (left to mid) and right half (mid+1 to right).
3. **Merge**:
   - Create temporary arrays L and R; copy left and right subarrays into them.
   - Use two pointers (i for L, j for R) and index k for original array.
   - While both subarrays have elements: Compare L[i] and R[j]; copy smaller to arr[k] and advance the corresponding pointer.
   - Copy any remaining elements from L or R to arr[k].
4. **In-Place Integration**: All merges overwrite the original array, ensuring sorted result without extra permanent space beyond temps.

## Program Output
```
   MERGE SORT
Original Array:    
5 14 6 -9 1 10 2 4 -11 

Sorted Array:
-11 -9 1 2 4 5 6 10 14 
```