#include<stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    int temp = n;
    int result = 0;
    //1325
    //1320
    while(n>0)
    {
        result = n%10 + 10*result;
        n /= 10;
    }
    printf("%d", temp+result);
    
    return 0;
}