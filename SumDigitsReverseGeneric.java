import java.util.HashSet;



public class Solution {
	// DO NOT MODIFY THE LIST
        Node h1;
        Node h2;
	static class Node{
            int data;
            Node next;
            Node(int d){
                data = d;
                next = null;
            }
        }
        public void add(Node a,int d){
            Node my = new Node(d);
            Node temp = a;
            if(temp ==null){
                my.next = a;
                a = my;
            }
            else{
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next= my;
            }
        }
        
        
        public void Sum(Node a,Node b){
            int num =0;
            int carry = 0;
            
            Node t1 = a;
            Node t2 = b;
            Node ty = null;
            Node te = null;
            while(t1!=null || t2!=null){
                if(t1!=null&&t2!=null){
                num = t1.data+t2.data +carry ;
                 t1 = t1.next;
                t2 = t2.next;
                }
                else if(t1!=null&&t2==null){
                num = t1.data+carry;
                 t1 = t1.next;
            }
                else if(t1==null&t2!=null){
                    num = t2.data+carry;
                     t2 = t2.next;
                }
                carry = num/10;
                Node my = new Node(num%10);
                if(ty ==null){
                    ty = my;
                    te = my;
                }
                else{
                    while(ty.next!=null){
                        ty = ty.next;
                    }
                    ty.next = my;
                }
               
                
            }
            while(te!=null){
                System.out.println(te.data);
                te = te.next;
            }
            
            
        }
	   public static void main(String[] args){
          Solution s = new Solution();
          s.h1 = new Node(1);
          s.add(s.h1,2);
          s.add(s.h1,9 );
         
          s.h2 = new Node(4);
          s.add(s.h2, 3);
          s.add(s.h2, 7);
          s.add(s.h2, 5);
          
          Node t1 = s.h1;
          Node t2 = s.h2;
          
         
          
          
          s.Sum(s.h1,s.h2);
          
          
          
          
          
         
	    
	}
	    
           }
       
	
