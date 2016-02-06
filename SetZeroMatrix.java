

public class Solution {
	// DO NOT MODIFY THE LIST
	public void SetRow0Column0(int[][] ar){
                int[] ar1 = new int[ar.length];
                int[] ar2 = new int[ar[0].length];
                
                for(int i =0;i<ar.length;i++){
                    for(int j =0;j<ar[0].length;j++){
                        if(ar[i][j] ==0){
                            ar1[i]=1;
                            ar2[j]=1;
                        }
                    }
                }
                
                for(int i=0;i<ar.length;i++){
                    for(int j =0;j<ar[0].length;j++){
                        if(ar1[i]==1||ar2[j]==1){
                            ar[i][j]=0;
                        }
                    }
                }
        }
	   public static void main(String[] args){
          Solution s = new Solution();
          int[][] ar = {{11,12,13,14,15},{16,17,0,19,20},{21,22,23,24,25},{26,27,28,29,30},{0,32,33,34,35}};
          s.SetRow0Column0(ar);
           for(int l=0;l<5;l++){
              for(int j =0;j<5;j++){
                  System.out.print(ar[l][j]+" ");
              }System.out.println();
          }
         
	    
	}
	    
           }
       
	
