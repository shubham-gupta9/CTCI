
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
        
        public void kthtolast(int k){
            Node t1 = head;
            Node t2 = head;
            
            while(t2!=null && k>0){
            t2 = t2.next;
            if(t2==null){
                System.out.println("No element kth to last");
            }
            k--;
        }
            while(t2!=null){
                t2 = t2.next;
                t1 = t1.next;
            }
            System.out.println(t1.data);
            
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
          s.kthtolast(3);
          
          
          
          
          
         
	    
	}
	    
           }
       
	
