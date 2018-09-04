import java.util.*;
import java.lang.*;
import java.io.*;

// program to find higesht average which is less than K
// this program was asked in Nissan's coding test

class HighestAverage{

public static void main (String[] args) throws IOException{

BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
Scanner sc=new Scanner(System.in);


int N=sc.nextInt();

String [] st=b.readLine().split(" ");

//take the number queries

int Q=sc.nextInt();


int []arr=new int[N];
try{
for(int i=0;i<N;i++)
{
 arr[i]=Integer.parseInt(st[i].trim());

}
}
catch(Exception e)
{
e.printStackTrace();

}

//sort the array to handle testcases with 
//unsorted arrays

Arrays.sort(arr);

int per[]=new int[N+1];

//store the sum of k indices  in per[],
//so that we could use it 

for(int i=1;i<=N;i++)
{ 
per[i]=per[i-1]+arr[i-1];
}



int k;

while(Q-->0)
{
k=sc.nextInt();
int j=0;
for(int i=1;i<=N;i++)
{

if(per[i]<k*i)
{ j=i;
  continue;
}
else

  break;
}

System.out.println(j);
}

}
}
