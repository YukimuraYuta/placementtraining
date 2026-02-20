package Loops;
public class Loops{
    static void printNumbers(int n){
        int count=0;
        while(n>0){
            if((n&1)==10){
                count++;
            }
            n=n>>1;
            
        }
        return count;
    }
}