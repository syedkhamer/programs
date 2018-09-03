import java.util.*;
import java.lang.*;

// program to print string in lexilogical order
class stringpermute{

static int count=0;

public static void permutation(String str,int l,int r){ 


if (l==r)

System.out.println(str);




for(int i=l;i<r;i++){
System.out.println(l);
str=swap(str,l,i);


permutation(str,l+1,r);

str=swap(str,l,i);



}




}

public static String swap(String str,int i,int j){



char str1[]=str.toCharArray();
char temp=str1[i];
str1[i]=str1[j];
str1[j]=temp;

return String.valueOf(str1);

}



public static void main(String[] args){

String str="ABC";
permutation(str,0,str.length());

}}
