import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Solution {
	// DO NOT MODIFY THE LIST
	public void compress(String val1){
            
           String h ="";
           int count = 0;
            for(int i =0;i<val1.length()-1;i++){
                if(val1.charAt(i)==val1.charAt(i+1)){
                    count++;
                }
                else{
                    
                    h += val1.charAt(i)+Integer.toString(count+1);
                    count=0;
                }
                
            }
            h += val1.charAt(val1.length()-1)+Integer.toString(count+1);
            
            if(h.length()<val1.length()){
                System.out.println(h);
            }
            else{
                System.out.println(val1);
            }
            
        }
	   public static void main(String[] args){
          Solution s = new Solution();
          s.compress("aaaabbbbccccdddaaaahhhh");
         
	    
	}
	    
           }
       
	
