import java.util.*;
class A1Q9
{
   A1Q9(double b, double h)
    {
        double areatr=(0.5*(b*h));
        System.out.println("Area of Triangle = "+areatr);
    }
    A1Q9(int l, int w)
    {
        int arearec=l*w;
        System.out.println("Area of rectangle:"+arearec);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        A1Q9 a=new A1Q9(3.0,2.0);
        A1Q9 b=new A1Q9(5,6);
    }
}
