#include <stdio.h>
 
char str[55];
 
void read() {
    scanf("%s", str);
}
 
void work() {
    int cnt = 1, i;
    for (i = 1; str[i]; ++i) {
        if (str[i] != str[i-1]) {
            ++cnt;
        }
    }
    double res = (double)(i) / cnt;
    printf("%.2lf\n", res);
}
 
int main() {
    read();
    work();
    return 0;
}
