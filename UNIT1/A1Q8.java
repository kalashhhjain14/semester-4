import javax.swing.JOptionPane;

class A1Q8 {
    int findPrime(int a) {
        int counter = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                counter++;
                break;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
        A1Q8 p = new A1Q8();
        if (p.findPrime(a) == 0 && a > 1) {
            System.out.println(a + " is a Prime Number.");
        } else {
            System.out.println(a + " is Not a Prime Number.");
        }
    }
}
