import java.util.*;
import java.lang.*;

// program to find frequency of elements in a array

class FrequencyElementsInArray{


public static void main(String[] args){



int arr[]={3,2,4,6,3,2,4,66,70,3,66,80};



Map<Integer,Integer> hm=new HashMap<>();

ArrayList<Integer> al=new ArrayList<>();


for(int i=0;i<arr.length;i++)
{
if(hm.get(arr[i])==null)
{
hm.put(arr[i],1);
}
else{

hm.put(arr[i],hm.get(arr[i])+1);
}

}

//lets store the elements in arraylist
//add only those elements which is not 
//stored in list to avoid repetation 

for(int i=0;i<arr.length;i++)
{if(!al.contains(arr[i]))
   al.add(arr[i]);}

//it will print key->value like 80->1

for(int i=0;i<al.size();i++)

System.out.println(al.get(i)+"->"+hm.get(al.get(i)));











}}
