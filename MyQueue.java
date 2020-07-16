/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Stack;

/**
 *
 * @author zhenhao luo: Using stack to implement queue
 */


public class MyQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void offer(int x){
        stack2.push(x);
    }
    
    public void poll(){
        if(stack1.isEmpty()){
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
        
        stack1.pop();
    }
    
    
    public int peek(){
        if(stack1.isEmpty()){
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
        
       return stack1.peek();
        
    }
    
    
    public static void main(String[] args) {
        MyQueue a =  new MyQueue();
        a.offer(1);
        a.offer(2);
        a.offer(3);
        a.offer(4);
        a.offer(5);
       
        
        
        
        System.out.println(a.peek());
        
    }
    
    
    
    
}
