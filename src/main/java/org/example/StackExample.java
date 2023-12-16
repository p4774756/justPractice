package org.example;

import java.util.Collections;
import java.util.Stack;

public class StackExample {
    Stack<Integer> st = new Stack<>();

    public void push(int x){
        st.push(x);
    }
    public void pop() {
        st.pop();
    }
    public void top() {
        st.peek();
    }
    public int getMax() {
        return Collections.max(st);
    }

    public void getAll() {
        st.forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        StackExample se = new StackExample();
        se.push(3);
        se.push(7);
        se.push(100);
        se.push(9);

        se.getAll();
        System.out.println("Max: " + se.getMax());

        se.pop();
        se.getAll();
    }
}
