package com.company;

public class LinkedList {
    Node head;
    LinkedList list;

    public LinkedList(){
        LinkedList myList = new LinkedList();
        list = myList;
    }

    public void addFirst(int value){
        Node node = new Node(value);
        node.next = null;
        list.head = node;
    }

    public void addLast(int value){
        Node node = new Node(value);
        Node last = list.head;
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
    }

    public void removeFirst(){
        Node node = list.head;
        Node previous = null;
        list.head = node.next;
    }

    public void removeLast(){
        Node node = list.head;
        while (node.next != null){
            node = node.next;
        }
        node = null;
    }

    public int indexOf(int value){
        Node node = list.head;
        boolean valueFound = true;
        int position = -1;
        while (node.data != value){

            if (node == null){
                valueFound = false;
                break;
            }
            node = node.next;
        }
        if (valueFound == true){
            position = node.data;
        }
        return position;
    }

    public void print(){
        Node node = list.head;

        while(node != null){
            System.out.println(node);
            node = node.next;
        }
    }
}
