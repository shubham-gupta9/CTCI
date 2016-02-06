import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Solution {
	// DO NOT MODIFY THE LIST
	public void Replace20(String val1){
            String[] my = val1.split(" ");
            val1 = "";
            for(int i =0;i<my.length;i++){
                val1 += my[i]+"%20";
            }
            System.out.println(val1);
            
        }
	   public static void main(String[] args){
          Solution s = new Solution();
          s.Replace20("My name is Shubham Gupta");
         
	    
	}
	    
           }
       
	
