package com.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }


    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    public void insertFirst(int val) {
        //Using Parametarized  Constructor

        Node node = new Node(val);
        node.next = head;
        head = node;
        //node.next = null;

        /*** --head  ----> 1    --->   2     ----->    3   ----> 4
         /  \ /
         /   \/
         / Node.next =head
         |--> head = node  ****/

        // System.out.println(node);
        //If we don't maintain the tails


        if (tail == null) {
            tail = head;
        }
        size++;
        // System.out.println(size);
    }

    public void insertAtLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAt(int index, int val) throws Exception {
        if (index == 0) {
            insertFirst(val);

        } else if (index == size) {
            insertAtLast(val);
        } else if (index > size) {
            throw new Exception("Index greater than size");
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next = node;

            size++;
        }
    }

    public void insertAtValue(int val1, int val2) {
        Node temp = head;
        while (temp.next.value == val1) {
            temp = temp.next;
        }
        Node node = new Node(val2, temp.next);
        temp.next = node;
        size++;
    }

    public void createNNodes(int n) {

        for (int i = 0; i < n; i++) {
            Node node = new Node(i, null);
            if (head == null) {
                head = node;
                size++;
            }
            if (tail != null) {
                tail.next = node;
                size++;
            }
            tail = node;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLastVersionTwo() {
        if (size <= 1) {
            return deleteFirst();
        }
        System.out.println(size);
        Node secondLast = get(size - 2);
        System.out.println(secondLast.value);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public void deleteLast() {
        Node temp = head;
        while (temp.next.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);
        tail = temp;
        tail.next = null;
        size--;
    }

    public void deleteValue(int val) {
        Node temp = head;
        if (temp.value == val) {
            deleteFirst();
        } else if (temp.value == tail.value) {
            deleteLast();
        } else {
            while (temp.next.value != val) {
                System.out.println(temp.value);
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    public int deleteIndex(int index) {
        int val = 0;
        if (index == 0) {
            deleteFirst();
        } else if (index == size - 1) {
            deleteLast();
        } else {
            Node prev = get(index - 1);
            val = prev.next.value;
            prev.next = prev.next.next;
        }
        size--;
        return val;
    }

    public Node find(int val) {
        Node node = head;
        while(node!=null) {
            if(node.value == val) {
                return node;
            }

            node = node.next;
        }
        System.out.println("Value Not Found");
       return node;
    }
    /**************Questions Leet Code   ************/
    //Remove Duplicates From Sorted List
    public void duplicates() {
        Node node = head;
        while(node.next!=null) {
            if(node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    //Merge Two sorted List
    public static LL merge(LL first,LL second) {
        LL ans = new LL();
        Node f = first.head;
        Node s = second.head;
        while(f != null && s != null) {
            if(f.value < s.value) {
                ans.insertAtLast(f.value);
                f = f.next;
            } else {
                ans.insertAtLast(s.value);
                s = s.next;
            }
        } while(f!=null) {
            ans.insertAtLast(f.value);
            f = f.next;
        } while(s!=null) {
            ans.insertAtLast(s.value);
            s = s.next;
        }
        return ans;
    }
    private class Node {
        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) throws Exception {
        /*LL node = new LL();
        node.insertFirst(20);
        System.out.println(node.size);
        node.insertFirst(34);
        System.out.println(node.size);
        node.insertFirst(54);
        System.out.println(node.size);
        node.display();
        node.deleteLastVersionTwo();
        System.out.println(node.size);
        node.display();
        node.insertAt(0, 64);
        System.out.println(node.size);
        node.display();
        node.insertAtLast(74);
        System.out.println(node.size);
        node.display();
        node.insertAtValue(54, 44);
        System.out.println(node.size);
        node.display();
        node.deleteLastVersionTwo();
        node.display();
        System.out.println(node.deleteIndex(1));
        node.display();
        node.insertRec(88,2);
        node.display();

        LL node1 = new LL();
        node1.createNNodes(18);
        node1.display();
        node1.deleteLastVersionTwo();
        node1.display();
        node1.deleteValue(16);
        node1.display();
        System.out.println(node1.deleteIndex(2));
        node1.display();
        System.out.println(node1.find(18));
        node1.insertRec(88,2);
        node1.display();

        LL list = new LL();
        list.insertAtLast(1);
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(3);
        list.insertAtLast(3);
        list.display();
        list.duplicates();
        list.display();*/
        LL first = new LL();
        first.insertAtLast(1);
        first.insertAtLast(3);
        first.insertAtLast(5);
        LL second = new LL();
        second.insertAtLast(1);
        second.insertAtLast(2);
        second.insertAtLast(9);
        second.insertAtLast(14);

        LL ans = LL.merge(first,second);
        ans.display();

    }

}
