#include<stdio.h>
int main()
{
    int i,n,arr[100],c=0;
    int sum=0,avg;
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
        if(avg==arr[i])
        {
            c+=1;
        }
    }
    if(c>=1)
    {
        printf("True");
    }
    else
    {
        printf("False");
    }
}