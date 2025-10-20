## Algorithm

1.  Define a `Node` with a key and left/right children. For every node, all left descendants must be smaller and all right descendants must be larger.
2.  To insert a key, recursively traverse from the root. Move left for smaller keys and right for larger keys until a null position is found, then add the new `Node` there.
3.  To search a key, traverse from the root. Move left if the target is smaller and right if it's larger. The search succeeds if the key is found and fails if a null pointer is reached.
4.  Locate the node to delete and handle three distinct cases:
    * Leaf Node: Simply remove the node.
    * One Child: Replace the node with its single child.
    * Two Children: Replace the node's key with its in-order successor's key, then recursively delete that successor.
5.  Implement three primary recursive traversal patterns:
    * In-order: `left -> root -> right` (yields sorted keys)
    * Pre-order: `root -> left -> right`
    * Post-order: `left -> right -> root`
6.  In the `main` function, instantiate the tree, populate it with `insert` operations, and then call the `search`, `delete`, and traversal methods to demonstrate functionality.