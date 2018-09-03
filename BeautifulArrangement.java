import java.util.*;
import java.lang.*;
// beautiful arrangement problem of leetcode

class BeautifulArrangement{

static int count=0;

public static int permutation(int [] str,int l,int r){ 


if (l==r){
count++;
System.out.println(Arrays.toString(str));} 

for(int i=l;i<r;i++){
System.out.println(l);
swap(str,l,i);


permutation(str,l+1,r);

swap(str,l,i);



}


return count;

}

public static void swap(int[] str,int i,int j){



int  temp=str[i];
str[i]=str[j];
str[j]=temp;



}



public static void main(String[] args){

int [] arr={1,2,3};


int c=permutation(arr,0,arr.length);

System.out.print(c);

}}
