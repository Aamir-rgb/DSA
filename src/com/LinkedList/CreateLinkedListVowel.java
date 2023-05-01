package com.LinkedList;

class NodeVowel {
    char val;
    NodeVowel next;

    public NodeVowel(char val, NodeVowel node) {
        this.val = val;
        this.next = next;
    }
}

public class CreateLinkedListVowel {
    static NodeVowel head;

    public static void main(String[] args) {
        NodeVowel node1 = new NodeVowel('a', null);
        NodeVowel node2 = new NodeVowel('e', null);
        NodeVowel node3 = new NodeVowel('i', null);
        NodeVowel node4 = new NodeVowel('o', null);
        NodeVowel node5 = new NodeVowel('u', null);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        NodeVowel temp = node1;
        while (temp != null) {
            System.out.print(temp.val + "<><>");
            temp = temp.next;
        }
        System.out.println("End");

    }


}

