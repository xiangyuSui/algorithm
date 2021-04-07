package week.common;

import java.util.Stack;

/**
 * @Description
 * @ClassName MyQueue
 * @Author Xander Sui
 * @Date 2021/3/24
 */
public class MyQueue {
    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        pushStack = new Stack<Integer>();
        popStack = new Stack<Integer>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        pushStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        shift();
        if (!popStack.isEmpty()) {
            return popStack.pop();
        }
        throw new RuntimeException("队列里没有元素");
    }

    /**
     * Get the front element.
     */
    public int peek() {
        //从popstack取出元素
        shift();
        if (!popStack.isEmpty()) {
            return popStack.peek();
        }
        throw new RuntimeException("队列里没有元素");
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }

    //一次性将pushstack中所有元素放入popstack
    //只能在popstack为空的时候才操作
    private void shift() {
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
    }

}
