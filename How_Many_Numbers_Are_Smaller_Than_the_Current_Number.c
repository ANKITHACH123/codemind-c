#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int arr[100],i,d=0,j;
    for (i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }
    for (i=0; i<n; i++)
    {
        d=0;
        for (j=0; j<n; j++)
        {
            if (j!=i)
            {
                if (arr[j]<arr[i])
                {
                    d+=1;
                }
            }
        }
        printf("%d ",d);
    }
    return 0;
}