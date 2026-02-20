#include <stdio.h>
int *function(){
    static int x=10;
    return &x;

}

int main(){
    int *ptr=function();
    printf("%d",*ptr);
    int a=100;
    int * p=&a;

    //Deferencing - value from the address
    printf("Value :%d",*p);
    printf("Address :%x",p);
    printf("Address :%p",p);

    return 0;
}