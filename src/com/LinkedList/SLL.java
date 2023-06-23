package com.LinkedList;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.ArrayList;
import java.util.List;

public class SLL {
    private Node head;
    private Node tail;
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
  //Display the contents of linked list
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

    //To delete the first node of linked list
     public void deleteFirst() {
        Node temp = head;
        //Head == null means linked list is not present
        if(head == null){
            System.out.println("No nodes to delete");
        }
        //Only first node to be deleted is present
        else if(head.next == null){
            head = null;
        }
        //Entire Linked List is Present
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
   //Delete the Last Node Of Linked List If It Has Particular Value
    public void deleteLastVal(int val) {
        Node temp = head;
        Node prev= head;
        while(temp!=null) {
            if (temp.next.val != val) {
                System.out.println("Node to be deleted is not present");
                break;
            } else {
                prev = temp;
                temp = temp.next;
                prev.next.next = null;
        }
        }

    }

    //To delete the first node which has particular value in it.
    public void deleteFirstValue(int val) {
        Node temp = head;
        if(head == null){
            System.out.println("No nodes to delete");
        }
        else if(head.val == val){
            head = head.next;
        } else {
            System.out.println("The node which you are trying to delete is not present in the linked list");
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
    //Calculate the Size Of Linked List
    public int calcListSize(){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    //Insert At Particular Index Of Linked List
    public void insertAtIndex(int index,int value){
       int size = calcListSize();
       if(index== 0) {
           insertFirst(value);
       } if (index == size-1){
           insertLast(value);
       } if(index!=0 && (index!=size-1)) {
           Node node = new Node(value);
           Node temp = head;
           Node prev = head;
           for(int i = 0; i < index;i++){
               prev = temp;
               temp = temp.next;
           }
           prev.next = node;
           node.next = temp;
       }
    }
    public void deleteMid(){

    }
    public static void main(String[] args) {
        SLL s = new SLL();
        //s.insertFirst(9);
//        s.insertFirst(1);
//        s.insertLast(1);
//        s.insertFirst(2);
//        s.insertLast(2);
//       // s.insertLast(9);
//        s.insertLast(9);
        s.insertFirst(9);
        s.insertFirst(9);
        s.insertFirst(9);
        s.insertFirst(9);
        //s.insertMid(5);
        //s.insertFirst(12);
        //s.insertFirst(94);
//        s.insertFirst(86);
//        s.insertLast(25);
//        s.insertFirst(49);
//        s.insertLast(86);
        s.display();
      //  s.isPalindrome();
//        s.insertMid(86,78);
//        //s.deleteFirstValue(18);
//        //s.deleteLastVal(89);
//        //s.deleteAny(94);
//        s.insertMid(12,86);
//        s.insertMid(25,86);
       // s.insertFirst(86);
//
//        s.display();
//        s.deleteLast();
//        System.out.println(s.findIndex(86));
//        s.display();
//        s.deleteLastVal(98);
//        System.out.println("The size of the linked list is "+s.calcListSize());
//        s.display();
//        s.insertAtIndex(0,25);
//        s.display();
//        s.insertAtIndex(8,74);
        s.display();
  //      s.reverseList();
//        s.display();
//      s.deleteAny(7);
       s.display();
       s.removeDuplicates();
       s.display();
//        s.deleteAny(25);
//        s.display();
//        s.deleteAny(86);
//        s.display();
    }

    //Find The Index Of A Particular Node In Linked List
    public List<Integer> findIndex(int val){
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
    //Recursion Reverse
    private void reverse(Node node) {
        if(node == tail) {
            tail = head;
            return;
        }
        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //In Place Reversal Of A Linked List
    public void reverse () {
        int size = calcListSize();
        if(size < 2){
            return;
        }
        Node prev = null;
        Node pres = head;
        Node nextNode = pres.next;
        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres = nextNode;
            if(nextNode.next!=null){
                nextNode = nextNode.next;
            }
        }
        head = prev;
    }

    //Remove Duplicates From Linked List
    public Node removeDuplicates() {
        List<Integer> al = new ArrayList<>();
        Node temp = head;
        Node prev = temp;
        int count = 0;
        while(temp!=null) {
            if(al.contains(temp.val)) {
                prev.next = temp.next;

            }
           else {
               al.add(temp.val);
             prev = temp;

            }
            temp = temp.next;
        }
      prev.next = null;
        System.out.println(al);
        return head;
    }


    //Delete the Middle Node
    public void deleteAny(int val) {
        if (head.val == val) {
            deleteFirst();
        }
        Node temp = head;
        Node prev = temp;
        while (temp.next != null) {
            if (temp.next.val == val && temp.next.next != null) {
                temp.next = temp.next.next;
                temp = temp.next;
            }
            if (temp.val == val) {
                deleteLast();
            }
        }
        if(head.val == val) {
            deleteFirst();
        }
    }
    public boolean isPalindrome() {
        Node temp = head;
        List<Integer> al = new ArrayList<>();
        String str = "";
        String str1 = "";
        boolean b = false;
        while(this.head !=null){
            al.add(this.head.val);
            this.head = this.head.next;
        }
        for(int i = 0;i < al.size();i++){
            str = Integer.toString(al.get(i));
        }
        for(int j = al.size()-1;j >=0;j--){
            str1 = Integer.toString(al.get(j));
        }
        if(str.equals(str1)) b = true;
        return b;
    }
    }
