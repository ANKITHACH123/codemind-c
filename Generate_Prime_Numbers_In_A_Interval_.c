#include <stdio.h>
int main()
{
  int n1, n2, i, j,c;
  scanf("%d",&n1);
  scanf("%d",&n2);
  for(i=n1+1; i<n2; ++i)
  {
      c=0;
      for(j=2; j<=i/2; ++j)
      {
        if(i%j==0)
        {
          c=1;
          break;
        }
      }
      if(c==0)
        printf("%d
",i);
  }
  return 0;
}