#include<stdio.h>
int main()
{
    int i,n,arr[100],c=0,k;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d ",&arr[i]);
    }
    scanf("%d",&k);
    for(i=0;i<n;i++)
    {
        if(k==arr[i])
        {
            c+=1;
        }
    }
    if(c>=1)
    {
        printf("%d ",c);
    }
    else
    {
        printf("0");
    }
}