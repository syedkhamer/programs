import java.util.*;
import java.lang.*;


class quicksort{


public static void sort(int []arr,int low,int high)
{

if(low<high){
int pivot=partition(arr,low,high);


sort(arr,low,pivot-1);
sort(arr,pivot+1,high);
}}

public static int partition(int[]arr, int low,int high){

int pivot=low;
//swap(arr,pivot,high);
System.out.println("low is"+arr[low]+"high is"+arr[high]);
for(int i=low;i<high;i++)
{

if(arr[i]<=arr[high]){



swap(arr,i,low);
//System.out.print(Arrays.toString(arr));
low++;

}

}
//System.out.print(Arrays.toString(arr));
swap(arr,low,high);
//System.out.println(low);
//System.out.print(Arrays.toString(arr));
return low;

}



public static void swap(int arr[],int i,int j){

int temp=arr[i];

arr[i]=arr[j];

arr[j]=temp;



}





public static void main(String []args){


int []arr=new int[]{13,12,14,11,6};
sort(arr,0,arr.length-1);

System.out.print(Arrays.toString(arr));



}






}
