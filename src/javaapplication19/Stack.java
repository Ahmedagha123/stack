/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author agha
 */
public class Stack {

    private int Push;
    private int pop;
    private int arr[];
    private int size;
    private int i = 0;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    Stack() {

    }

    public void Push(int Push) {
        if (i < size) {
            arr[i] = Push;
            i++;

        } else {
            System.out.println("the number biggest than");
        };
    }

    public int pop() {
        i--;
        return arr[i];
    }

}
