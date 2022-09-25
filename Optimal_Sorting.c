#include<stdio.h>
int main()
{
    int n,arr[100],i,k,t,c=0;
    scanf("%d",&t);
    while(t--)
    {
        scanf("%d",&n);
        for(i=0;i<n;i++)
        {
            scanf("%d",&arr[i]);
        }
        for(int k=1;k<n;k++)
        {
            if(arr[k-1]>arr[k])
            {
                c++;
            }
        }
        if(c==0)
        {
            printf("%d",c);
        }
        else
        {
            int min=9999,max=0;
            for(int l=0;l<n;l++)
            {
                if(min>arr[l])
                {
                    min=arr[l];
                }
                if(max<arr[l])
                {
                    max=arr[l];                    }
            }
            printf("%d
",max-min);   
        
        }
    }
}