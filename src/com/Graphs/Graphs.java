package com.Graphs;

import java.util.*;

public class Graphs {

    public static void main(String[] args) {
        // Graph graph = createGraphV2();
        // printGraph(graph.graph, graph.vertices);
        GraphAdjLists g = createGraphAdjList();
        // printGraphV2(g.graph, g.vertices);
        g.dfs(0);
    }

    static Graph createGraph()
    {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 5);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(5, 0);
        graph.addEdge(2, 1);
        graph.addEdge(3, 0);
        return graph;
    }

    static void printGraphV2(HashMap<Integer, LinkedList<Integer>> graph, int n)
    {
        for (int key : graph.keySet())
        {
            LinkedList<Integer> list = graph.get(key);
            for (int data : list)
            {
                System.out.print(data + ",");
            }

            System.out.println();
        }
    }

    static Graph createGraphV2()
    {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        // graph.addEdge(0, 3);
        graph.addEdge(0, 5);
        // graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        // graph.addEdge(5, 0);
        // graph.addEdge(2, 1);
        graph.addEdge(3, 0);
        return graph;
    }

    static GraphAdjLists createGraphAdjList()
    {
        GraphAdjLists graph = new GraphAdjLists(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 5);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(5, 0);
        graph.addEdge(2, 1);
        graph.addEdge(3, 0);
        return graph;
    }

    static GraphAdjLists createGraphAdjListDir()
    {
        GraphAdjLists graph = new GraphAdjLists(6);
        graph.addEdge(0, 5);
        graph.addEdge(1, 0);
        graph.addEdge(2, 1);
        graph.addEdge(3, 0);
        return graph;
    }

    static void printGraph (int[][] mat, int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(mat[i][j]);
                System.out.print(",");
            }

            System.out.println();
        }
    }
}

class Graph
{
    int[][] graph;
    int vertices;

    public Graph(int n)
    {
        this.vertices = n;
        graph = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            graph[i] = new int[n];
        }
    }

    // This adds an edge from u to v
    void addEdge(int u, int v)
    {
        graph[u][v] = 1;
    }
}

class GraphAdjLists
{
    HashMap<Integer, LinkedList<Integer>> graph;
    int vertices;

    public GraphAdjLists(int n)
    {
        this.vertices = n;
        graph = new HashMap();

        for (int i = 0; i < n; i++)
        {
            graph.put(i, new LinkedList());
        }
    }

    // This adds an edge from u to v
    void addEdge(int u, int v)
    {
        LinkedList<Integer> list = graph.get(u);
        list.add(v);
    }


    void dfs(int start)
    {
        boolean[] visited = new boolean[vertices];
        dfsUtil(start, visited);
    }

    void dfsUtil(int start, boolean[] visited)
    {
        visited[start] = true;
        System.out.println(start);

        LinkedList<Integer> children = graph.get(start);

        for (int child : children)
        {
            if (!visited[child])
            {
                dfsUtil(child, visited);
            }
        }
    }
}