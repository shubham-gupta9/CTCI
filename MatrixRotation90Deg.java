import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Solution {
	// DO NOT MODIFY THE LIST
	public void Rotate(int[][] ar,int n){
            
            int k =0;
            for(int i =0;i<n/2;i++){
                
                for(int j=i;j<n-2*i-1+i;j++){
                    int temp = ar[k][j];
                   
                    ar[k][j] = ar[n-1-j][k];
                    
                    ar[n-1-j][k] = ar[n-2*i-1+i][n-1-j];
                 
                    ar[n-2*i-1+i][n-1-j] = ar[j][n-2*i-1+i];
                    
                    ar[j][n-2*i-1+i] = temp;
                     
                   
                } k++;
                
                
            }
           
           
            
        }
	   public static void main(String[] args){
          Solution s = new Solution();
          int[][] ar = {{1,2},{3,4}};
          s.Rotate(ar, 2);
//          s.Rotate(ar, 5);
//          s.Rotate(ar, 5);
//          s.Rotate(ar, 5);
            System.out.println(ar.length);
           for(int l=0;l<2;l++){
              for(int j =0;j<2;j++){
                  System.out.print(ar[l][j]+" ");
              }System.out.println();
          }
         
	    
	}
	    
           }
       
	
