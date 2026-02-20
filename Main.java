import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter the day");
    String day=sc.nextLine();

    int a =10;
    Integer x=10;
    float z=2.5f;
    float y=3.5F;
    double d=3.14;
   

    String var = (d>y)? "d is greater than y" : "y is greater than d";
    System.out.println((z>x)? "z is greater than x" : " x is greater than z");
    System.out.println(var);

    if(a>x){
        System.out.println("a is greater than x");}
    else if(a==x){
        System.out.println("a is equal to x");}
    else{
        System.out.println("a is less than x");}

    }
    
    switch(day){
        case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday");
        case "Saturday", "Sunday" -> System.out.println("Weekend");
        default -> {
           if (day.isEmpty()) {System.out.println("no day entered");}
           else {System.out.println("Invalid day");

        }
    }
    System.out.println(a++ + ++a);  
    System.out.println(x);
    System.out.println(z);
    System.out.println(y);
    System.out.println(d);

}
}