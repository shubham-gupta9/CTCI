import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Solution {
	// DO NOT MODIFY THE LIST
	public int UniqueCharacters(String my){
            HashSet<Character> hs = new HashSet<Character>();
            int n = my.length();
            for( int i =0;i<n;i++){
                if(hs.contains(my.charAt(i))){
                    return 0;
                }
                else{
                    hs.add(my.charAt(i));
                }
            }
            return 1;
        }
	   public static void main(String[] args){
          Solution s = new Solution();
          int a = s.UniqueCharacters("asdfghjklpoiuhytrewqzxcvbnm");
          if(a==1){
              System.out.println("Unique");
          }
          else{
              System.out.println("Not Unique");
          }
	    
	}
	    
           }
       
	
