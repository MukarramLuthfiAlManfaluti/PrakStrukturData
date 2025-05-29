package Codelab;

import java.util.*;

public class LogistikGraph {
    private int vertexCount;
    private LinkedList<Integer>[] adjList;
    private String[] gudang = {"A", "B", "C", "D", "E"};

    public LogistikGraph(int v) {
        vertexCount = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
    }

    public void printAdjacencyMatrix() {
        int[][] matrix = new int[vertexCount][vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            for (int j : adjList[i]) {
                matrix[i][j] = 1;
            }
        }

        System.out.println("Adjacency Matrix:");
        System.out.print("   ");
        for (String g : gudang) System.out.print(g + " ");
        System.out.println();
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(gudang[i] + ": ");
            for (int j = 0; j < vertexCount; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void BFS(int start) {
        boolean[] visited = new boolean[vertexCount];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal dari Gudang " + gudang[start] + ": ");
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(gudang[node] + " ");

            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public void DFS(int start) {
        boolean[] visited = new boolean[vertexCount];
        System.out.print("DFS Traversal dari Gudang " + gudang[start] + ": ");
        dfsUtil(start, visited);
        System.out.println();
    }

    private void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(gudang[node] + " ");
        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        LogistikGraph graph = new LogistikGraph(5);

        // Tambahkan edge sesuai instruksi
        graph.addEdge(0, 1); // A → B
        graph.addEdge(0, 2); // A → C
        graph.addEdge(1, 3); // B → D
        graph.addEdge(2, 3); // C → D
        graph.addEdge(2, 4); // C → E
        graph.addEdge(3, 4); // D → E
        graph.addEdge(4, 0); // E → A

        // Output
        graph.printAdjacencyMatrix();
        graph.BFS(0); // dari Gudang A
        graph.DFS(0); // dari Gudang A
    }
}

