import java.util.*;
import java.lang.*;


class permute{

static int count=0;

public static int permutation(int [] str,int l,int r){ 


if (l==r){
count++;
System.out.println(Arrays.toString(str));} 

for(int i=l;i<r;i++){
System.out.println(l);
swap(str,l,i);

//if(str[l]%(l+1)==0  || (l+1)%str[l]==0){
//int k=str[i]%j;
//int m=j%str[i];
//int n=l+1;
//System.out.println(k+" "+m+" "+n);
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
