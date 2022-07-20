#include<stdio.h>
#include<math.h>
int main()
{
    int i,n,arr[100],dif,sum=0,c=0;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d ",&arr[i]);
    }
    for(i=0;i<(n/2);i++)
    {
        sum=sum+arr[i];
    }
    for(i=(n/2);i<n;i++)
    {
        c=c+arr[i];
    }
    dif=abs(sum-c);
    printf("%d ",dif);
    
}