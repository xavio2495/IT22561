## Algorithm

1. Represent the graph with a 2D **adjacency matrix**. Create a `dist` array, setting the source vertex's distance to `0` and all others to infinity.

2. Create a min-priority queue to store vertices. This queue is ordered by the current shortest distance found for each vertex in the `dist` array. Add the source vertex to start.

3. While the priority queue is not empty, extract the vertex `u` that is currently closest to the source.

4. For the extracted vertex `u`, check every other vertex `v`. If a direct edge `(u, v)` exists and the path to `v` through `u` is shorter than the currently known best distance to `v`, an improvement has been found.

5. If a shorter path is found, update `dist[v]` to this new shorter distance and add vertex `v` to the priority queue for future processing.

6. The `main` method defines the graph matrix and calls the algorithm to find and print the shortest paths from a starting source vertex.