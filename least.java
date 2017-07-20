import java.util.*;
class leastn
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,temp;
n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[j]=a[i];
a[j]=temp;
}
}
}
for(int i=0;i<n-1;i++)
{
System.out.print(a[i]+",");
}
System.out.print(a[0],a[1]);
}
}
