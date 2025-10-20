
import java.util.*;
public class Main {
    private int vertices;
    private List<List<Node>> adjList;
    static class Node implements Comparable<Node> {
        int vertex;
        int weight;
        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
        public int compareTo(Node other) {
            return Integer.compare(this.weight, other.weight);
        }
    }
    public Main(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {adjList.add(new ArrayList<>());}
    }
    public void addEdge(int source, int destination, int weight) {
        adjList.get(source).add(new Node(destination, weight));
        adjList.get(destination).add(new Node(source, weight));
    }
    public int[] dijkstra(int start) {
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();
            int currentVertex = currentNode.vertex;
            for (Node neighbor : adjList.get(currentVertex)) {
                int newDist = distances[currentVertex] + neighbor.weight;
                if (newDist < distances[neighbor.vertex]) {
                    distances[neighbor.vertex] = newDist;
                    pq.add(new Node(neighbor.vertex, newDist));
                }
            }
        }
        return distances;
    }
    public void printShortestPaths(int[] distances, int start) {
        System.out.println("Shortest distances from vertex " + start + ":");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("To vertex " + i + " : " + (distances[i] == Integer.MAX_VALUE ? "∞": distances[i]));
        }
    }
    public static void main(String[] args) {
        Main g = new Main(5);
        g.addEdge(0, 1, 10);g.addEdge(0, 4, 5);
        g.addEdge(1, 2, 1);g.addEdge(2, 3, 4);
        g.addEdge(3, 4, 2);g.addEdge(4, 1, 3);
        g.addEdge(4, 2, 9);
        int startVertex = 0;
        int[] distances = g.dijkstra(startVertex);
        g.printShortestPaths(distances, startVertex);
    }
}
