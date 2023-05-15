package com.DoublyLinkedList;

public class DLL {

    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        //Print From Beginning Og Linked List
        Node temp = head;
        Node last = null;
        while(temp!=null) {
            System.out.print(temp.value+"->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        //Print From End Of Linked List

        while(last!=null) {
            System.out.print(last.value+"->");
            last = last.prev;
        }
        System.out.println("START");
    }

    public static void main(String []args){

        DLL dll = new DLL();
        dll.insertFirst(12);
        dll.insertFirst(15);
        dll.insertFirst(18);
        dll.display();

    }
    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
