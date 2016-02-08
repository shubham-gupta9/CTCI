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
            int num1 =0;
            int num2 =0;
            
            Node t1 = a;
            Node t2 = b;
            int i =0;
            while(t1!=null){
                num1 += t1.data * Math.pow(10,i);
                i++;
                t1 = t1.next;
            }
            i=0;
            while(t2!=null){
                num2 += t2.data * Math.pow(10,i);
                i++;
                t2 = t2.next;
            }
            
            int sum = num1+num2;
            Node ty = null;
            Node te = null;
            while(sum>0){
                int rem = sum%10;
                
                Node my = new Node(rem);
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
                sum = sum/10;
                
            }
            while(te!=null){
                System.out.println(te.data);
                te = te.next;
            }
            
            
        }
	   public static void main(String[] args){
          Solution s = new Solution();
          s.h1 = new Node(7);
          s.add(s.h1,1);
          s.add(s.h1,6);
         
          s.h2 = new Node(5);
          s.add(s.h2, 9);
          s.add(s.h2, 2);
          
          Node t1 = s.h1;
          Node t2 = s.h2;
          
         
          
          
          s.Sum(s.h1,s.h2);
          
          
          
          
          
         
	    
	}
	    
           }
       
	
