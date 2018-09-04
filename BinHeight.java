import java.util.*;
import java.lang.*;

// program to find height of binary search tree


class Node{

Node left,right;

int data;

public Node(int data)
{
this.data=data;
right=null;
left=null;
}


}



class BinHeight
{
public static int height(Node root)
{
 
if(root==null)
 return 0;


int lefth=height(root.left);
int righth=height(root.right);


return Math.max(lefth,righth)+1;

}


 
 public static Node insert(Node head,int data)
 {
  //if root is equal to null then add the node
if(head==null)
{
return new Node(data);
}
  //if data is less than root the traverse on left tree

if(data <=head.data)
{
head.left=insert(head.left,data);

}
//if data is greater than root the traverse on right tree
else
head.right=insert(head.right,data);

return head;

}




public static void main (String []args){

Node root=null;

root=insert(root,11);
root=insert(root,8);
root=insert(root,16);
root=insert(root,1);
root=insert(root,117);
root=insert(root,18);
root=insert(root,3);
root=insert(root,9);
root=insert(root,14);
root=insert(root,2);
root=insert(root,19);

System.out.println(height(root));




}






}
