/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklistinterview;

/**
 *
 * @author zhenhao luo
 */
public class LinklistInterview {
    ListNode head;
    int size;
    
    public LinklistInterview() {
        head = null;
        size = 0;
    }
    
    
    public class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public int get(int index) {
        if(index < 0 || index >= size ) {  //O(1)
            throw new IndexOutOfBoundsException("Not a valid index :(");
        }
        return getNode(index).val;
    }
    
     public ListNode getNode(int index){  //O(n)
        ListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    
    
    
    
    
    public void add(int index, int item) {
        // Scenario 1: index is out of bound
        if(index < 0 || index > size ) {  //O(1)
            throw new IndexOutOfBoundsException("Not a valid index :(");
        }

        ListNode temp = new ListNode(item);
        // Scenario 2: adding a new head
        if(index == 0) {  //    O(1)
             temp.next = head;
             head = temp;
        }
        // Scenario 3: everything else
        else {
            ListNode before =  getNode(index -1);  //O(n)
            temp.next  = before.next;
            before.next = temp;
        }


        size++;
    }
    
    public String toString(ListNode head) {
        String output="[ ";
        ListNode current = head;
        while(current != null) {
            output  += current.val + " ";
            current = current.next;
        }


        return output+"]";
    }
    
     public ListNode reverse2(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
        ListNode nextTemp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextTemp;
    }
        return prev;
     }
     
     public int getLength(ListNode head){
         ListNode cur = head;
         int len = 0;
         while(cur !=null){
             len++;
             cur = cur.next;
         }
         return len;
     }
     
     public boolean isPanlin(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            if(arr[i]!=arr[j]){
                return false;
            }else{
                i++;
                j--;
            }
        }
        
        return true;
     }
     
     
     public boolean isPalindrome(ListNode head) {
         ListNode cur = head;
         int[] arr = new int[getLength(head)];
         int index = 0;
         while(cur !=null){
             int value = cur.val;
             arr[index] = value;
             cur = cur.next;
             index++;
         }
         
        return isPanlin(arr);
        
    }
     
     
     
      public boolean hasCycle(ListNode head) {
          ListNode fast = head; ListNode slow = head;
          while( fast != null && slow != null){
              if (fast.next != null){
                  fast = fast.next.next;
              }else{
                  return false;
              }
              slow = slow.next;
              if(slow == fast){
                  return true;
              }
       
              
      }
          
          return false;
    }
    
    public static void main(String[] args) {
        LinklistInterview a =  new LinklistInterview();
        a.add(0,1);
        a.add(1,2);
        a.add(2,6);
        a.add(3,2);
        a.add(4,1);
        
        boolean b =a.isPalindrome(a.head);
        
        
        System.out.println(b);
        
    }
    
}
