import javax.swing.JOptionPane;

public class retirement {
    public static void gui() {
        double goal = Double.parseDouble(JOptionPane.showInputDialog("How much money do you need to retire ?"));
        double payment = Double.parseDouble(JOptionPane.showInputDialog("How much money will you contribute every year ?"));
        double interestRate = Double.parseDouble(JOptionPane.showInputDialog("Interest rate in % :"));
        calculation(goal,payment,interestRate);
    }
    public static void calculation(double goal,double payment,double interestRate){
        double balance = 0;
        int years = 0;
        while (balance<goal){
            balance+=payment;
            double interest=balance*interestRate/100;
            balance+=interest;
            years++;
        }
        JOptionPane.showMessageDialog(null,"You can retire in "+years+"years");
    }
}
