
import java.util.HashSet;



public class Solution {
	// DO NOT MODIFY THE LIST
        Node head;
	static class Node{
            int data;
            Node next;
            Node(int d){
                data = d;
                next = null;
            }
        }
        public void add(int d){
            Node my = new Node(d);
            Node temp = head;
            if(temp ==null){
                my.next = head;
                head = my;
            }
            else{
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next= my;
            }
        }
        
        public void Partition(int a){
         Node before = null;
         Node after = null;
         Node temp = head;
             while(temp!=null){
                 Node ag = temp.next;
                 if(temp.data<a){
                     temp.next = before;
                     before = temp;
                 }
                 else{
                     temp.next = after;
                     after = temp;
                 }
                 temp = ag;
             }
             
             if(before== null){
                head = after;
             }
             else{
                 head = before;
                 while(before.next!=null){
                     before = before.next;
                 }
                 before .next = after;
             }
             
             Node t = head;
             while(t!=null){
                 System.out.println(t.data);
                 t = t.next;
             }
          
        }
	   public static void main(String[] args){
          Solution s = new Solution();
          s.head = new Node(1);
          s.add(2);
          s.add(2);
          s.add(3);
          s.add(4);
          s.add(4);
          s.add(5);
          s.add(4);
          s.add(3);
          s.add(3);
          s.add(3);
          s.add(6);
          s.add(4);
          s.add(3);
          Node temp = s.head;
//          while(temp!=null){
//              System.out.println(temp.data);
//              temp = temp.next;
//          }
          s.Partition(4);
          
          
         
	    
	}
	    
           }
       
	
