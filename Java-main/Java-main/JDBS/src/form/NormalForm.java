package form;
import javax.swing.*;
import java.sql.*;
import java.util.Scanner;


public class NormalForm {
    JFrame frame1 = new JFrame("Student panel");
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JRadioButton r1,r2;
    JComboBox c1;
    JButton b1,b2,b3,b4,b5;
    ButtonGroup bg=new ButtonGroup();
    public NormalForm() {

        l1 = new JLabel("id:");
        l1.setBounds(50, 50, 100, 30);

        t1 = new JTextField();
        t1.setBounds(150, 50, 100, 30);

        l2 = new JLabel("name:");
        l2.setBounds(50, 150, 100, 30);
        t2 = new JTextField();
        t2.setBounds(150, 150, 100, 30);

        l3 = new JLabel("Gender");
        l3.setBounds(50,250,100,30);

        r1 = new JRadioButton("Male");
        r1.setBounds(100,250,100,30);

        r2 = new JRadioButton("Female");
        r2.setBounds(200,250,100,30);

        bg.add(r1);
        bg.add(r2);

        l4 = new JLabel("Faulty:");
        l4.setBounds(50, 350, 100, 30);

        String[] s1 = new String[]{"BCA", "BSCIT", "BBM","BBA"};
        c1 = new JComboBox(s1);
        c1.setBounds(100,350,100,30);

//        t3 = new JTextField();
//        t3.setBounds(150, 250, 100, 30);

        b1 = new JButton("Insert");
        b1.setBounds(50, 400, 100, 30);

        b2 = new JButton("Reset");
        b2.setBounds(200, 400, 100, 30);
        b3 = new JButton("Delete");
        b3.setBounds(50, 450, 100, 30);
        b4 = new JButton("update");
        b4.setBounds(200, 450, 100, 30);
        b5 = new JButton("Display");
        b5.setBounds(120, 500, 100, 30);


        b1.addActionListener(e -> {
            int i1 = Integer.parseInt(t1.getText());
            String s2 = t2.getText();
            String s3;
            String s4 = (String)this.c1.getSelectedItem();
            if (r1.isSelected()) {
                s3=r1.getText();
            }else{
                s3=r2.getText();
            }
            System.out.println(+i1+s2+s3+s4);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            Connection conn = null;
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
            Statement stmt = null;
            int rs = 0;

            try {
                stmt = conn.createStatement();
                rs = stmt.executeUpdate("INSERT INTO `bca_detail` (`id`, `name`, `gender`,`faculty`)"+"VALUES ('" + i1 + "','" +s2+ "','" +s3+"','" +s4+"')");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            JOptionPane.showMessageDialog(frame1, "Insert succesful");
        });
        b2.addActionListener(e -> {
            this.t1.setText("");
            this.t2.setText("");
            JOptionPane.showMessageDialog(frame1, "reset succesful");
        });
        b3.addActionListener(e -> {
            int i1 = Integer.parseInt(t1.getText());
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            Connection conn = null;
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
            Statement stmt = null;
            int rs = 0;

            try {
                stmt = conn.createStatement();
                rs = stmt.executeUpdate("DELETE FROM bca_detail WHERE id='"+i1+"';");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            JOptionPane.showMessageDialog(frame1, "delete succesful");
        });
        b4.addActionListener(e -> {
            int i1 = Integer.parseInt(t1.getText());
            String s2 = t2.getText();
            String s3;
            String s4 = (String)this.c1.getSelectedItem();
            if (r1.isSelected()) {
                s3=r1.getText();
            }else{
                s3=r2.getText();
            }
            System.out.println(+i1+s2+s3+s4);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            Connection conn = null;
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
            Statement stmt = null;
            int rs = 0;

            try {
                stmt = conn.createStatement();
                rs = stmt.executeUpdate("UPDATE bca_detail SET name= '"+s2+"',gender = '"+s3+"',faculty = '"+s4+"' WHERE id = "+i1+";");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            JOptionPane.showMessageDialog(frame1, "update succesful");
        });
        b5.addActionListener(e -> {
            int i1 = Integer.parseInt(t1.getText());
            String s2 = t2.getText();
            String s3;
            String s4 = (String)this.c1.getSelectedItem();
            if (r1.isSelected()) {
                s3=r1.getText();
            }else{
                s3=r2.getText();
            }
            JOptionPane.showMessageDialog(frame1,"id="+i1+" name="+s2+" gender="+s3+" faculty ="+s4);
            System.out.println(+i1+s2+s3+s4);
        });

        frame1.add(l1);
        frame1.add(l2);
        frame1.add(l3);
        frame1.add(l4);
        frame1.add(t1);
        frame1.add(t2);
        frame1.add(r1);
        frame1.add(r2);
        frame1.add(c1);
        frame1.add(b1);
        frame1.add(b2);
        frame1.add(b3);
        frame1.add(b4);
        frame1.add(b5);
        frame1.setSize(1000,1000);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        NormalForm squa1= new NormalForm();

    }
}
