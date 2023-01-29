package com.temp.project.dynamic.programming.treegraph.first;

import com.temp.project.dynamic.programming.treegraph.first.Graph;

import java.util.HashMap;
import java.util.List;

public class DFSMain {


    public static void main(String[] args) {
        DFSMain dfsMain = new DFSMain();

        Graph g = dfsMain.createGraph();

        System.out.println(g.getAdjVertices("Rob"));
    }

    Graph createGraph() {
        Graph graph = new Graph();
        graph.setAdjVertices(new HashMap<>());
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        return graph;
    }
}
