#include<stdio.h>
int main()
{
    int n,i,j,c=0,a[100];
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        c=0;
        for(j=0;j<n;j++)
        {
            if(i!=j)
            {
                if(a[i]==a[j])
                c++;
            }
        }
        if(c>0)
        {
        printf("%d",a[i]);
        a[i]=0;
        }
    }
}