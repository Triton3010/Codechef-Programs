#include<stdio.h>
#include<math.h>
 
 int main()
 {
 int n;
 scanf("%d",&n);
 while(n-->0)
 { 
  int a,b;
  sacnf("%d%d",&a,&b);
  int arr[a];
  for(int i=0;i<a;i++)
  scanf("%d",&a[i]);
  while(b-->0)
  {
   int sum=0;
   int l,r;
   scanf("%d%d",&l,&r);
   for(int j=l-1;j<r-1;j++)
   {
    for(int k=j+1;k<r;k++)
    {
     sum+=arr[j]*arr[k];
    }
   }
   printf(sum%((int)Math.pow(10,9)+7));
  }
  }
}}



  