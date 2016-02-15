public class TreeHeight {
	Node root;
        static class Node{
            int data;
            Node left;
            Node right;
            
            Node(int d){
                data = d;
                left = null;
                right = null;
            }
        }
        
        public int checkheight(Node a){
           
            
            if(a == null){
                return 0;
            }
            
          //System.out.println(a.left.data);
          int lheight = checkheight(a.left);
         
          if(lheight == -1){
              return -1;
          }
          
          //System.out.println(a.right.data);
          int rheight = checkheight(a.right);
          
          if(rheight == -1){
              return -1;
          }
          
          int hdiff = lheight - rheight;
          if(Math.abs(hdiff)>1){
              return -1;
          }
          else{
              return Math.max(lheight, rheight)+1;
          }
        }
         
        public boolean isbalanced(Node a){
            if(checkheight(a)==-1){
                return false;
            }
            else{
                return true;
            }
        }
       
        
       
        
	   public static void main(String[] args){
          TreeHeight th = new TreeHeight();
          th.root = new Node(1);
          Node two = new Node(2);
          Node three = new Node(3);
          Node four = new Node(4);
          Node five = new Node(5);
          Node six = new Node(6);
          Node seven = new Node(7);
          
          th.root.left = two;
          //th.root.right = three;
          two.left = four;
          two.right = five;
          //three.left = six;
          //three.right = seven;
          
          boolean d = th.isbalanced(th.root);
          System.out.println(d);
          
         
	    
	}
	    
           }
       
	
