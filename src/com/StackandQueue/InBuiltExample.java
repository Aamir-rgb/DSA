package com.StackandQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExample {
    public static void main(String[] args) {
        /* Stack */
        //Define a Stack Of Integer Type
       Stack<Integer> st = new Stack<>();

       //Push adds the element to the stack
       st.push(34);
       st.push(45);
       st.push(54);
       st.push(18);
       st.push(9);
       System.out.println(st);

       //Pop removes the element from the stack
       //Removes 9
        st.pop();
        System.out.println(st);
        //Removes 18
        st.pop();
        System.out.println(st);
        //Removes 54
        st.pop();
        System.out.println(st);
        //Removes 45
        st.pop();
        System.out.println(st);
        //Removes 34
        st.pop();
       System.out.println(st);

       //Pattern Programmes
       Stack<String> st1 = new Stack<>();
       st1.push("*");
       st1.push("**");
       st1.push("***");
       st1.push("****");
       st1.push("*****");


        System.out.println(st1);

       System.out.println(st1.pop());
       System.out.println(st1.pop());
       System.out.println(st1.pop());
       System.out.println(st1.pop());
       System.out.println(st1.pop());

        /* Queues */
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(13);
        queue.add(133);
        queue.add(1333);
        System.out.println(queue);

        //Peek gets you the first element of the queue
        System.out.println(queue.peek());
        System.out.println(queue);

        //Remove removes the first element of the queue
        System.out.println(queue.remove());
        System.out.println(queue);

    }
}
