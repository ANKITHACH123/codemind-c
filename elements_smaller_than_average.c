#include<stdio.h>
int main()
{
    int i,n,arr[100],sum=0,c=0;
    float avg;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d ",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        sum=sum+arr[i];
    }
    avg=(sum/n);
    for(i=0;i<n;i++)
    {
        if(arr[i]<=avg)
        {
            c+=1;
        }
    }
    printf("%d ",c);
    
}