#include<stdio.h>
int main()
{
    int n,p=0,c=0;
    scanf("%d",&n);
    int i,a[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        if(a[i]%2==0)
        p++;
        else
        c++;
    }
    printf("%d %d",p,c);
    return 0;
}