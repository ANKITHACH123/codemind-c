#include<stdio.h>
int main()
{
    int i,n,sum=0,s=0,c=0,r,temp;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            c++;
        }
    }
    while(n!=0)
    {
        r=n%10;
        n=n/10;
        sum=sum*10+r;
    }
    temp=sum;
    for(i=1;i<=temp;i++)
    {
        if(temp%i==0)
        {
            s++;
        }
    }
    
    if(s==2 && c==2)
    {
        printf("circular prime");
    }
    else if(c==2 && s!=2)
    {
        printf("prime but not a circular prime");
    }
    else
    {
        printf("not prime");
    }
}