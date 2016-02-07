

public class Solution {
	// DO NOT MODIFY THE LIST
	public void reverse(String val){
            
            StringBuilder s = new StringBuilder(val);
                for(int i =0;i<val.length()/2;i++){
                    char temp = val.charAt(i);
                   s.setCharAt(i, val.charAt(val.length()-1-i));
                   s.setCharAt(val.length()-1-i, temp);
                    
                }
         System.out.println(s); 
        }
	   public static void main(String[] args){
          Solution s = new Solution();
          s.reverse("");
         
	    
	}
	    
           }
       
	
