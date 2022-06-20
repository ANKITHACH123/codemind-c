#include<stdio.h>
int main()
{
    int n,i;
    scanf("%d",&n);
    int a[n],b[n],c=0;
    for (i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int k=0;
    for (i=0;i<n;i++)
    {
        if(a[i]!=0)
        {
            b[k]=a[i];
            k++;
        }
        else
        {
         c++;   
        }
    }
    while(c!=0)
    {
        b[k++]=0;
        c--;
    }
    for(i=0;i<k;i++)
    {
        printf("%d ",b[i]);
    }
    return 0;
}