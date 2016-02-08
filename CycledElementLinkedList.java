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
   
        
        
        public void my(Node a){
            Node t1 = a;
            Node t2 = a;
            
            if(t1==null){
                return;
            }
            else{
                while(t1!=null && t2!=null && t2.next!=null){
                    System.out.println("t1 "+t1.data);
                    System.out.println("t2 "+t2.data);
                     t1 = t1.next;
                    t2 = t2.next.next;
                    System.out.println();
                   
                    if(t1==t2){
                        System.out.println(t1.data);
                        break;
                    }
                   
                }
                if(t2==null ||t2.next==null){
                    return;
                }
                
                t1=a;
                while(t1!=t2){
                    System.out.println("t3 "+t1.data);
                    System.out.println("t4 "+t2.data);
                    t1= t1.next;
                    t2= t2.next;
                }
                System.out.println(t1.data);
            }
        }
        
	   public static void main(String[] args){
          Solution s = new Solution();
          s.h1 = new Node(1);
          Node s2 = new Node(2);
          Node s3 = new Node(3);
          Node s4 = new Node(4);
          Node s5 = new Node(5);
          Node s6 = new Node(6);
          Node s7 = new Node(7);
          s.h1.next = s2;
          s2.next = s3;
          s3.next = s4;
          s4.next = s5;
          s5.next = s6;
          s6.next = s7;
          s7.next = s3;
          
          s.my(s.h1);
          
//          Node temp = s.h1;
//          while(temp!=null){
//              System.out.println(temp.data);
//              temp = temp.next;
//          }
          
          
          
         
          
          
          //s.Sum(s.h1,s.h2);
          
          
          
          
          
         
	    
	}
	    
           }
       
	
