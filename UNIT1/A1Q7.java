import javax.swing.JOptionPane;
public class A1Q7 {
    A1Q7(int a)
    {
        if(a%2==0)
        {
            System.out.println(" number is even");
        }
        else
        {
            System.out.println(" number is odd");
        }
    }
    public static void main(String args[])
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog(" Enter A : "));
        A1Q7 S = new A1Q7(a);
    }
}
