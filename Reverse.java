public class Reverse{
    public static void main(String args[]){
        int n=123;
        int rev=revert(n);
        System.out.println("Reverse of the number is: "+rev);
    }
    public static int revert(int n){
        int rev=0;
    while(n!=0)    {
        int rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
    return rev;
    }
}
