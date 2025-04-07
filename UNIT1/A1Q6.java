import javax.swing.JOptionPane;
class A1Q6
{
    public static void main(String[] args) 
    {
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter Year = "));
        if(year%4==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
    }
}
