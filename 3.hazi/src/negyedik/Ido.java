package negyedik;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ido extends JFrame implements ActionListener{
    
    JLabel lb1;
    JLabel lb2;
    JLabel lb3;
    JLabel lb4;
    JLabel lb5;
    JLabel lb6;
    JLabel lb7;
    JLabel lb8;
    JLabel lb9;
    JLabel lb10;
    JLabel lb11;
    JLabel lb12;
    
    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField tf4;
    JTextField tf5;
    JTextField tf6;
    JTextField tf7;
    JTextField tf8;
    JTextField tf9;
    JTextField tf10;
    JTextField tf11;
    JTextField tf12;
    
    JButton bt;
    
    JPanel pl1;
    JPanel pl2;
    JPanel pl3;
    JPanel pl4;
    
    public Ido(String title){        
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lb1 = new JLabel("nap");
        lb2 = new JLabel("ora");
        lb3 = new JLabel("perc");
        lb4 = new JLabel("masodperc");
        lb5 = new JLabel("nap");
        lb6 = new JLabel("ora");
        lb7 = new JLabel("perc");
        lb8 = new JLabel("masodperc");
        lb9 = new JLabel("nap");
        lb10 = new JLabel("ora");
        lb11 = new JLabel("perc");
        lb12 = new JLabel("masodperc");     
        
        tf1 = new JTextField(4);
        tf2 = new JTextField(4);
        tf3 = new JTextField(4);
        tf4 = new JTextField(4);
        tf5 = new JTextField(4);
        tf6 = new JTextField(4);
        tf7 = new JTextField(4);
        tf8 = new JTextField(4);
        tf9 = new JTextField(4);
        tf10 = new JTextField(4);
        tf11 = new JTextField(4);
        tf12 = new JTextField(4);
        
        bt = new JButton("Szamol");        
        bt.addActionListener(this);
        
        pl1 = new JPanel();
        pl2 = new JPanel();
        pl3 = new JPanel();
        pl4 = new JPanel();
        
        GridLayout gr1 = new GridLayout(2, 8);
        GridLayout gr2 = new GridLayout(1, 1);
        GridLayout gr3 = new GridLayout(1, 8);
        GridLayout gr4 = new GridLayout(3, 1);
        pl1.setLayout(gr1);
        pl2.setLayout(gr2);
        pl3.setLayout(gr3);
        this.setLayout(gr4);     
        
        pl1.add(tf1);
        pl1.add(lb1);
        pl1.add(tf2);
        pl1.add(lb2);
        pl1.add(tf3);
        pl1.add(lb3);
        pl1.add(tf4);
        pl1.add(lb4);        
        pl1.add(tf5);
        pl1.add(lb5);
        pl1.add(tf6);
        pl1.add(lb6);
        pl1.add(tf7);
        pl1.add(lb7);
        pl1.add(tf8);
        pl1.add(lb8);
        
        pl2.add(bt);
        
        pl3.add(tf9);
        pl3.add(lb9);
        pl3.add(tf10);
        pl3.add(lb10);
        pl3.add(tf11);
        pl3.add(lb11);
        pl3.add(tf12);
        pl3.add(lb12);
        
        this.add(pl1);
        this.add(pl2);
        this.add(pl3);

        pack();   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();  
        String s2 = tf2.getText();
        String s3 = tf3.getText();
        String s4 = tf4.getText();
        String s5 = tf5.getText();
        String s6 = tf6.getText();
        String s7 = tf7.getText();
        String s8 = tf8.getText();
        
        int szam1 = Integer.parseInt(s1);
        int szam2 = Integer.parseInt(s2);
        int szam3 = Integer.parseInt(s3);  
        int szam4 = Integer.parseInt(s4);  
        int szam5 = Integer.parseInt(s5);  
        int szam6 = Integer.parseInt(s6);  
        int szam7 = Integer.parseInt(s7);  
        int szam8 = Integer.parseInt(s8);
        
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        
        if(e.getSource()==bt){
            int tmpmp=0;
            int tmpp=0;
            int tmpo=0;
            result4 = szam4+szam8;
            if(result4>=60){
                result4 -= 60;
                tmpmp++;
            }
            result3 = szam3+szam7+tmpmp;
            if(result3>=60){
                result3 -= 60;
                tmpp++;
            }
            result2 = szam2+szam6+tmpp;
            if(result2>=24){
                result2 -=24;
                tmpo++;
            }
            result1 = szam1+szam5+tmpo;
   
        }  
        
        String rs1=String.valueOf(result1);
        String rs2=String.valueOf(result2);
        String rs3=String.valueOf(result3);
        String rs4=String.valueOf(result4);
        tf9.setText(rs1);
        tf10.setText(rs2);
        tf11.setText(rs3);
        tf12.setText(rs4);
    }  
    
    public static void main(String[] args) {
        Ido i= new Ido("IdoAtalakito");
    }
    
}
