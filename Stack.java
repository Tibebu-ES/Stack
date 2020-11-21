/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 * Stack implementation in Java
 * @author tibebu
 */

class Stack {

    private char arr[];
    private int top;
    private int capacity;

    // Creating a stack
    Stack(int size) {
        arr = new char[size];
        capacity = size;
        top = -1;
    }

    // Add elements into stack
    public void push(char x) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Remove element from stack
    public char pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');

        stack.pop();
        System.out.println("\nAfter popping out");

        stack.printStack();

    }
}
