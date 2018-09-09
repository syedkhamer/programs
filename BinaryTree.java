import java.util.*;
import java.lang.*;



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


//it returns height of BST
class BinHieght
{
public static int height(Node root)
{
 
if(root==null)
 return 0;


int lefth=height(root.left);
int righth=height(root.right);


return Math.max(lefth,righth)+1;

}

// to insert data into BST
public static Node insert(Node head,int data){


if(head==null)
{

return new Node(data);
}


if(data <=head.data)
{
head.left=insert(head.left,data);

}

else
head.right=insert(head.right,data);

return head;

}

//inorder traversal
public static void inorder(Node root){



if(root.left!=null)
inorder(root.left);

System.out.print(root.data+" ");

if(root.right!=null)
inorder(root.right);


}
// this method is for level order traversal
public static void levelorder(Node root)
{
if(root==null)
return;

Queue<Node> q=new LinkedList<Node>();

q.add(root);

while(!q.isEmpty())
{
root=q.remove();

System.out.print(root.data+" ");

if(root.left!=null)
q.add(root.left);

if(root.right!=null)
q.add(root.right);


}



}

//this method returns size of a tree

public static int size(Node root)
{
if(root==null)
return 0;

int leftsize=size(root.left);
int rightsize=size(root.right);

return leftsize+rightsize+1;
}


public static void printlevel(Node root)
{
  Queue<Node> q=new LinkedList<Node>();
  q.add(root);
  q.add(null);

 while(!q.isEmpty())
{
  Node current=q.remove();

 if(current==null)
{ 
if(!q.isEmpty())
{
System.out.println();
  q.add(null);
}
}
else{
System.out.print(current.data+" ");

if(current.left!=null)
 q.add(current.left);

if(current.right!=null)
 q.add(current.right);
}
}

}

// this method pront the left  boundary of tree
public static void printleft(Node root)
{

if(root!=null)
{
if(root.left!=null)
{
System.out.print(root.data+" ");

printleft(root.left);
}
else if(root.right!=null)
{
System.out.print(root.data+" ");
printleft(root.right);


}
}}

// this method pront the right boundary of tree
public static void printright(Node root)
{
if(root!=null){
if(root.right!=null)
{
printright(root.right);

System.out.print(root.data+" ");
}
else if(root.left!=null)
{
printright(root.left);
System.out.print(root.data+" ");
}
}
}



//this method print the leaves

public static void printleaves(Node root)

{
if(root!=null){

printleaves(root.left);

if(root.left==null&&root.right==null)
{
System.out.print(root.data+" ");
}
printleaves(root.right);

}
}


//lowest comman ansestor


public static Node lcs(Node root,int n1, int n2)
{
 if(root==null)
   return null;

 if(root.data==n1||root.data==n2)
   return root;

Node left=lcs(root.left,n1,n2);
Node right=lcs(root.right,n1,n2);

if(left!=null&&right!=null)
 return root;

return  left!=null?left:right; 

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

//inorder(root);

//System.out.println();

levelorder(root);
System.out.println();

//System.out.println(size(root));

printlevel(root);
System.out.println();

if(root!=null)
{
printleft(root);

printleaves(root.left);
printleaves(root.right);


printright(root);
}


System.out.println();
System.out.println("lcs is "+lcs(root,1,16).data);
}






}
