#include<stdio.h>
int main()
{
    int n,m;
    scanf("%d%d",&n,&m);
    int a[n][m],i,j;
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    int s=0;
    for(i=0;i<m;i++)
    {
        s=0;
        for(j=0;j<n;j++)
        {
            s=s+a[j][i];
        }
        printf("%d ",s);
    }
    return 0;
}
