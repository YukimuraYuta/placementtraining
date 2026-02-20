class Number{
    int value;
}

public class Swap{
    static void swap(Number a, Number b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
    public static void main(String[] args) {
        Number num1 = new Number();
        Number num2 = new Number();
        num1.value = 10;
        num2.value = 20;

        System.out.println("Before swap: num1 = " + num1.value + ", num2 = " + num2.value);
        swap(num1, num2);
        System.out.println("After swap: num1 = " + num1.value + ", num2 = " + num2.value);
    }
}