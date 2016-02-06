import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Solution {
	// DO NOT MODIFY THE LIST
	public int Permuatation(String val1, String val2){
            int[] ar1 = new int[256];
            if(val1.length() != val2.length()){
                return 0;
            }
            else{
                for( int i =0;i<val1.length();i++){
                    ar1[(int)val1.charAt(i)] += 1;
                }
               
                
                for(int i =0;i<val2.length();i++){
                    ar1[(int)val2.charAt(i)] -= 1;
                }
            }
            
            int count = 0;
            for(int i =0;i<256;i++){
                
                if(ar1[i]>0){
                    count++;
                }
            }
            
            if(count==0){
                return 1;
            }
            else{
                return 0;
            }
            
        }
	   public static void main(String[] args){
          Solution s = new Solution();
          int a = s.Permuatation("qwertyuiopasdfghjklzxcvbnm", "mnbvcxzlkjhgfdsapoiuytrewq");
          if(a==1){
              System.out.println("Yes");
          }
          else{
              System.out.println("No");
          }
	    
	}
	    
           }
       
	
