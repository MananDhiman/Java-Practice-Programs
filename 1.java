import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Sum of numbers "+firstNumber+", "+secondNumber+" is = "+(firstNumber+secondNumber));
        System.out.println("Difference of numbers "+firstNumber+", "+secondNumber+" is = "+(firstNumber-secondNumber));
        System.out.println("Product of numbers "+firstNumber+", "+secondNumber+" is = "+(firstNumber*secondNumber));
        System.out.println("Division of numbers "+firstNumber+", "+secondNumber+" is = "+(firstNumber/secondNumber));
        
        scanner.close();
    }
}
