package com.stackandqueue;

import java.util.Stack;

/**
 * 实现一个具有getMin()功能的栈
 */
public class MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }
    public void push(int newNum) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(newNum);
        } else if (newNum <= getMin()) {
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }
    public void pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("your stackData is empty!");
        }
        int vale = stackData.pop();
        if (vale == getMin()) {
            this.stackMin.pop();
        }
    }
    public int getMin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("your stackMin is empty!");
        }
        return this.stackMin.peek();
    }
}
