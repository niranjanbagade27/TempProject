package com.temp.project.chche;

import java.util.HashMap;

public class LRUCache<T> {
    private int capacity;
    private HashMap<String, Node> cache;

    private int size;
    private DLinkedList queue;

    LRUCache(int capacity){
        this.capacity = capacity;
        cache = new HashMap<>();
        queue = new DLinkedList();
        size = 0;
    }

    public void put(String key, int value){
        Node node = cache.get(key);
        if(node != null) {
            node.value = value;
            queue.moveNodeToFront(node);
            return;
        }
        if(size == capacity){
            System.out.println("removing from rear");
            String rearKey = queue.getRearKey();
            queue.removeFromRear();
            cache.remove(rearKey);
            size--;
        }
        Node newNode = new Node(key, value);
        queue.addToFront(newNode);
        cache.put(key, newNode);
        size++;
        System.out.println("inserted " + cache);
    }

    public int get(String key){
        if(cache.containsKey(key)){
            System.out.println("Moving to front");
            queue.moveNodeToFront(cache.get(key));
            System.out.println(queue);
            return cache.get(key).value;
        }else{
            return -1;
        }
    }

    static class Node{
        String key;
        int value;

        Node next;
        Node prev;

        Node(String k, int v){
            this.key = k;
            this.value = v;
            next = null;
            prev = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    static class DLinkedList{
        Node front;
        Node rear;

        DLinkedList(){
            front = rear = null;
        }

        public void moveNodeToFront(Node node){
            if(node == front){
                return;
            }
            if(node == rear){
                rear = rear.prev;
                rear.next = null;
            }else{
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }

            node.prev = null;
            front.prev = node;
            node.next = front;
            front = node;

        }

        public void removeFromRear(){
            if(rear == null){
                return;
            }
            if(front==rear){
                front =  rear = null;
            }else{
                rear = rear.prev;
                rear.next = null;
            }
        }

        public String getRearKey() {
            return rear.key;
        }

        public void addToFront(Node newNode) {
            if(rear ==  null){
                front = rear = newNode;
                return;
            }
            newNode.next = front;
            newNode.prev = null;
            front.prev = newNode;
            front = newNode;
        }

        public String toString(){
            return front + " " +rear;
        }
    }

    public static void main(String[] args) {
        LRUCache<Node> cache = new LRUCache<>(3);
        cache.put("a",1);
        cache.put("b",2);
        cache.put("c",3);
        cache.put("d",4);
        cache.put("b",5);
    }
}
