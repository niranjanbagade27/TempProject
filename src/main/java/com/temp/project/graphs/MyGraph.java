package com.temp.project.graphs;

import java.util.*;

public class MyGraph {
    private HashMap<String, Set<String>> adj;
    private HashMap<String, Integer> degree;

    public MyGraph(){
        adj = new HashMap<String, Set<String>>();
        degree = new HashMap<String, Integer>();
    }

    public void add(String key, String value){
        if(adj.containsKey((key))){
            adj.get(key).add(value);
        }else{
            adj.put(key,new HashSet<String>());
            adj.get(key).add(value);
        }
        degree.put(key, degree.getOrDefault(key,0)+1);
        if(!degree.containsKey(value)){
            degree.put(value,0);
        }

    }

    public HashMap<String, Set<String>> getAdj() {
        return adj;
    }

    public void setAdj(HashMap<String, Set<String>> adj) {
        this.adj = adj;
    }

    public HashMap<String, Integer> getDegree() {
        return degree;
    }

    public void setDegree(HashMap<String, Integer> degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "MyGraph{" +
                "adj=" + adj +
                ", degree=" + degree +
                '}';
    }
}
