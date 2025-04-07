import java.util.*;
class A1Q11
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number");    
        int a = s.nextInt();
        System.out.println("Enter Second Number");    
        int b = s.nextInt();
        int smallest = (a<b) ? a:b;
        System.out.println("The smallest number is: " + smallest);
    }
}
