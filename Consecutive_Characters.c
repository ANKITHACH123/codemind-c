#include<stdio.h>
int main()
{
    char str[100000];
    int c=0;
    int d=0;
    scanf("%[^
]s",str);
    for(int i=0;str[i]!=NULL;i++)
    {
        if(str[i]==str[i+1])
        {
            c++;
        }
        else
        {
            if(d<c)
            {
                d=c;
            }
            c=0;
        }
    }
    if(d<c)
    {
        d=c;
    }
    printf("%d ",d+1);
}