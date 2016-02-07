
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
        
        public void RemoveDuplicates(){
            HashSet<Integer> hs = new HashSet<Integer>();
            
            Node temp = head;
            Node prev = null;
            while(temp!= null){
                if(hs.contains(temp.data)){
                    prev.next = temp.next;
                }
                else{
                    hs.add(temp.data);
                    prev = temp;
                }
                temp = temp.next;
            }
           temp = head;
           while(temp!=null){
               System.out.println(temp.data);
               temp  = temp.next;
           }
            
        }
	   public static void main(String[] args){
          Solution s = new Solution();
          s.head = new Node(1);
          s.add(2);
          s.add(2);
          s.add(2);
          s.add(4);
          s.add(4);
          s.add(5);
          s.add(4);
          s.add(3);
          s.add(3);
          s.add(3);
          s.add(5);
          s.add(4);
          s.add(3);
          s.RemoveDuplicates();
          
          
          
          
          
         
	    
	}
	    
           }
       
	
