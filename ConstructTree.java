import java.util.*;
import java.lang.*;




//program to construct binary tree from in and post
//and to print preorder
//output of program would be 1 3 7 6 2 5 4 8 






class Node
{ int data;
  Node right,left;
  public Node(int data)
{
this.data=data;
left=null;
right=null;

}
}

//index class we can simply pass the int index as well
class pIndex{

int index;
}






class ConstructTree
{


//method to construct Binary tree

public static Node Build(int []in,int[] post,int srt,int end,pIndex p)
{
if(srt>end)
return null;

if(p.index>=0){
Node root=new Node(post[p.index--]);

int i=search(in,root.data,srt,end);

if(srt==end)
return root;

root.left=Build(in,post,srt,i-1,p);

root.right=Build(in,post,i+1,end,p);

return root;}
else
return null;

}



//method to creat index object and to pass it to Build
public static Node Buildtree(int []in,int []post,int pSize)
{
pIndex p=new pIndex();
p.index=pSize-1;

return Build( in, post,0,pSize-1,p);
}


//method to search index of root in inorder array
public static int search(int []in,int val,int srt,int end)
{
int i;
for(i=srt;i<=end;i++)
{
if(in[i]==val)
break;
}

return i;

}

//method to print preorder
public static void printPreOrder(Node root){

if(root==null)
return;

System.out.print(root.data+" ");
//if(root.left!=null)
printPreOrder(root.left);
//if(root.right!=null)
printPreOrder(root.right);

}


public static void main (String []args)
{


int in[]={4, 8, 2, 5, 1, 6, 3, 7};
int post[]={8, 4, 5, 2, 6, 7, 3, 1};

int psize=post.length;

Node root=Buildtree(in,post,psize);

printPreOrder(root);

}




}
