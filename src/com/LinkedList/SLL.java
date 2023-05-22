package com.LinkedList;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.ArrayList;
import java.util.List;

public class SLL {
    private Node head;
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public void insertFirst(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            node.next = null;
        } else {
            node.next = head;
            head = node;
        }
    }
    public void insertMid(int val){

    }
    public void insertLast(int val) {
        Node temp = head;
        Node node = new Node(val);
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
    }

    public void display(){
        Node temp = head;
        if(temp == null){
            System.out.println("No nodes to display");
        }
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println("END");
    }
public void deleteFirst() {
        Node temp = head;
        if(head == null){
            System.out.println("No nodes to delete");
        }
        else if(head.next == null){
            head = null;
        }
        else {
            head = head.next;
        }
}
public void deleteLast() {
        Node temp = head;
        Node prev= head;
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
}

    public void deleteLastVal(int val) {
        Node temp = head;
        Node prev= head;
        while(temp.next.val!=val){
            prev = temp;
            temp = temp.next;
        }
        prev.next.next = null;
    }

    public void deleteFirstValue(int val) {
        Node temp = head;
        if(head == null){
            System.out.println("No nodes to delete");
        }
        else if(head.val == val){
            head = head.next;
        }
    }
   public void insertMid(int val1,int val2){
        Node temp = head;
        Node prev = head;
        Node node = new Node(val2);
        while(temp.val!=val1){

            temp = temp.next;
            prev = temp;

        }
        System.out.println(prev.val);
       node.next=temp.next;
       prev.next = node;
    }
    public void deleteMid(){

    }
    public static void main(String[] args) {
        SLL s = new SLL();
        s.insertFirst(11);
        s.insertFirst(12);
        s.insertFirst(94);
        s.insertFirst(86);
        s.insertLast(25);
        s.insertFirst(49);
        s.insertLast(89);
        s.display();
        s.insertMid(86,78);
        //s.deleteFirstValue(18);
        //s.deleteLastVal(89);
        //s.deleteAny(94);
        s.insertMid(12,86);
        s.insertMid(25,86);
        s.insertFirst(86);
        s.display();
        System.out.println(s.find(86));

    }

    public List<Integer> find(int val){
        Node temp = head;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while(temp!=null){
            if(temp.val == val){
                list.add(count);
            }
            temp = temp.next;
            count++;
        }
        return list;
    }
    public void deleteAny(int val) {
        Node temp = head;
        Node temp1 = head;
        if (temp == null) {
            System.out.println("No node to be deleted");
        }
            if (temp.val == val) {
                deleteFirstValue(val);
            } if(temp.val==val && temp.next!=null){
//               / deleteMid(val);
//                temp
        }
        }
    }

