#include<stdio.h>
#include<string.h>
int main()
{
    char str[100];
    int i,n,c=1;
    scanf("%[^
]s",str);
    for(i=0;str[i]!=NULL;i++)
    {
        if(str[i]==' ')
        {
            c+=1;
        }
    }
    printf("%d ",c);
}