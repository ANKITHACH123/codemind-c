#include<stdio.h>
int main()
{
    char s[1000];
    scanf("%s",s);
    int i,c=0;
    for (i=0; s[i]!=NULL; i++)
    {
        c++;
    }
    if (s[0]==40 && s[c-1]==41)
    {
        printf("True");
    }
    else
    {
        printf("False");
    }
    return 0;
}    
