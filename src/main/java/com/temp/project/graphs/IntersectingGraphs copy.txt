package com.temp.project.graphs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class IntersectingGraphs {
    static MyGraph graph = new MyGraph();
    static Set<String> cycle = new HashSet<>();

    public static void main(String[] args) {
        // read the file and create the adj list
        try {
//the file to be opened for reading
            FileInputStream fis = new FileInputStream("./file2.txt");
            Scanner sc = new Scanner(fis);    //file to be scanned
            boolean checkCycle = true;
//returns true if there is another line to read
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if(line.contains("->")){
                    String [] node = line.split("->");
                    graph.add(node[0], node[1]);
                }
                else{
                    if(checkCycle){
                        System.out.println(graph);
                        cycle = getCyclicNodes(graph);
                        checkCycle = false;
                        System.out.println("Cycle exists between "+cycle);
                    }
                    String[] nodes = line.split(",");
                    //System.out.println(Arrays.toString(nodes));
                    Set<String> visited = new HashSet<>();
                    boolean res = false;
                    for(String node : nodes){
                        if(cycle.contains(node)){
                            continue;
                        }else{
                            res = dfs(graph, node, visited);
                            if(res){
                                break;
                            }
                        }
                    }
                    System.out.println(line +" : "+res);
                }
            }
            sc.close();     //closes the scanner
        } catch (IOException e) {
            e.printStackTrace();
        }
        // read the input lines and store it in a list
        // run topological sort on graph to identify the cycle
        // run the input lines to get the result
    }

    private static boolean dfs(MyGraph graph, String node, Set<String> visited) {
        boolean res = false;
        Queue<String> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            String element = q.poll();
            if(visited.contains(element)){
                res = true;
                break;
            }else{
                visited.add(element);
                q.addAll(graph.getAdj().getOrDefault(element, new HashSet<>()));
            }
        }

        return res;
    }

    private static Set<String> getCyclicNodes(MyGraph graph) {
        HashMap<String, Set<String>> adj = graph.getAdj();
        HashMap<String, Integer> degree = graph.getDegree();
        Set<String> cyclicNodes = new HashSet<>();
        Set<String> visited = new HashSet<>();
        while(true){
            Queue<String> q = new LinkedList<>();
            for(Map.Entry<String, Integer> entry : degree.entrySet()){
                if(!visited.contains(entry.getKey()) && entry.getValue()==0){
                    visited.add(entry.getKey());
                    q.offer(entry.getKey());
                }
            }

            if(q.size()==0){
                break;
            }

            while(!q.isEmpty()){
                String element = q.poll();
                for(Map.Entry<String, Set<String>> entry : adj.entrySet()){
                    if(entry.getValue().contains(element)){
                        degree.put(entry.getKey(), degree.get(entry.getKey())-1);
                    }
                }
            }
        }

        for(Map.Entry<String, Integer> entry : degree.entrySet()){
            if(entry.getValue()>0){
                cyclicNodes.add(entry.getKey());
            }
        }

        return cyclicNodes;
    }
}

