package com.temp.project.assignment;

import java.util.*;

public class PriorityCache{

    HashMap<Integer, LinkedHashSet<Node>> priorityWiseNodes;
    HashMap<String, Node> keyPriority;
    int size = 0;
    int capacity = 0;

    class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            if(o1.getExpiration() < o2.getExpiration()){
                return -1;
            }else if(o1.getExpiration() == o2.getExpiration()){
                return 0;
            }else{
                return 1;
            }
        }
    }


    class Node{
        String key;
        int value;
        int priority;
        int expiration;

        public Node(String key, int value, int priority, int expiration) {
            this.key = key;
            this.value = value;
            this.priority = priority;
            this.expiration = expiration;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public int getExpiration() {
            return expiration;
        }

        public void setExpiration(int expiration) {
            this.expiration = expiration;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Node{");
            sb.append("key='").append(key).append('\'');
            sb.append(", value=").append(value);
            sb.append(", priority=").append(priority);
            sb.append(", expiration=").append(expiration);
            sb.append('}');
            return sb.toString();
        }
    }

    public int get(String key){
        if(keyPriority.containsKey(key)){
            Node node = keyPriority.get(key);
            //LinkedHashSet<Node> set = priorityWiseNodes.get(node.getPriority());
            //Node ans = set.contains(node);
            return node.getValue();
        }else{
            return -1;
        }
    }

    public void put(String key, int value, int priority, int expiration){
        Node node = new Node(key, value, priority, expiration);
        if(size >= capacity){

        }else{
            if(!priorityWiseNodes.containsKey((priority))){
                priorityWiseNodes.put(priority, new LinkedHashSet<>());
            }
            priorityWiseNodes.get(priority).add(node);
        }
    }

    public PriorityCache(int capacity) {
        this.priorityWiseNodes = new HashMap<>();;
        this.keyPriority = new HashMap<>();
        this.size = 0;
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        PriorityCache cache = new PriorityCache(3);
        cache.put("one",1,1,1000);
        cache.put("two",2,1, 105);
        cache.put("three",3,5, 110);
        System.out.println(cache.priorityWiseNodes);
    }
}
