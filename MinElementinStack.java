package queue;

import java.util.Stack;


    public class StackMin extends Stack<Integer>{
        Stack<Integer> s2;
        public StackMin(){
            s2 = new Stack<Integer>();
        }
        
        public void push(int value){
            if(value<min()){
                s2.push(value);
            }
            super.push(value);
            System.out.println();
            System.out.println(s2);
        }
        
        public Integer pop(){
        int p = super.pop();
        if(p==s2.peek()){
            s2.pop();
        }
        System.out.println(s2);
        return p;
        }
        
        public int min(){
            if(s2.isEmpty()){
                return Integer.MAX_VALUE;
        }
            else{
                return s2.peek();
            }
            
            
    }
        
        
        
public static void main(String args[]){
    StackMin s1 = new StackMin();
    s1.push(5);
    s1.push(6);
    s1.push(3);
    s1.push(4);
    s1.push(5);
    s1.push(1);
    
    
    
}  
}  
