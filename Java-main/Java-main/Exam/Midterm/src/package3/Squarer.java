package package3;
import javax.swing.*;

public class Squarer{
    JFrame frame1 = new JFrame("Square calculator");
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2;
    public Squarer() {

        l1 = new JLabel("Enter number:");
        l1.setBounds(50, 50, 100, 30);

        t1 = new JTextField();
        t1.setBounds(150, 50, 100, 30);

        b1 = new JButton("Calculate");
        b1.setBounds(50, 100, 100, 30);

        b2 = new JButton("clear");
        b2.setBounds(160,100,100,30);

        l2 = new JLabel("Result:");
        l2.setBounds(50, 150, 100, 30);

        t2 = new JTextField();
        t2.setBounds(150, 150, 100, 30);

        b1.addActionListener(e -> {
            double sq = Double.parseDouble(t1.getText());
            sq = sq * sq;
            String s1 = String.valueOf(sq);
            JOptionPane.showMessageDialog(frame1, "Square of number:" + s1);
            t2.setText(s1);
        });

        b2.addActionListener(e->{
            t1.setText("");
            t2.setText("");
        });

        frame1.add(l1);
        frame1.add(l2);
        frame1.add(t1);
        frame1.add(t2);
        frame1.add(b1);
        frame1.add(b2);
        frame1.setSize(1000,1000);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Squarer squa1= new Squarer();
    }
}
