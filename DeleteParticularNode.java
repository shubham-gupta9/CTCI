
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
        
        public void DeleteParticular(Node a){
          if(a==null || a.next==null){
              return;
          }
          else{
              a.data = a.next.data;
              a.next = a.next.next;
          }
          
            
        }
	   public static void main(String[] args){
          Solution s = new Solution();
          s.head = new Node(1);
          Node second = new Node(2);
          s.head.next = second;
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
          s.DeleteParticular(second);
          
          Node temp = s.head;
          while(temp!=null){
              System.out.println(temp.data);
              temp = temp.next;
          }
          
          
          
         
	    
	}
	    
           }
       
	
