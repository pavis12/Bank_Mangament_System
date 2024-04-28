/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.sysem;
import javax.swing.*;//for GUI
import java.awt.*;//for image package
import java.awt.event.*;
/**
 *
 * @author Sathish
 */
public class Transactions extends JFrame implements ActionListener{
    JButton deposit,withdrwal,fastcash,ministmt,pinchange,balanceenq,exit;
    String pinnumber;
    Transactions(String pinnumber){
        setLayout(null);
        this.pinnumber=pinnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Please select your transaction");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        
        image.add(text);//adding the text over the image so that it is visible
        
        deposit =new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrwal =new JButton("Withdrawal");
        withdrwal.setBounds(355,415,150,30);
        withdrwal.addActionListener(this);
        image.add(withdrwal);
        
        fastcash =new JButton("Fast Cash");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministmt =new JButton("Mini Statement");
        ministmt.setBounds(355,450,150,30);
        ministmt.addActionListener(this);
        image.add(ministmt);
        
        pinchange =new JButton("PIN change");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenq =new JButton("Balance Enquiry");
        balanceenq.setBounds(355,485,150,30);
        balanceenq.addActionListener(this);
        image.add(balanceenq);
        
        exit =new JButton("Exit");
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900,900);
        setLocation(300,0);
        //setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){ 
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource()==withdrwal){ 
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()==fastcash){ 
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if(ae.getSource()==ministmt){ 
            new MiniStatement(pinnumber).setVisible(true);
        }else if(ae.getSource()==pinchange){ 
            setVisible(false);
            new Pin(pinnumber).setVisible(true);
        }else if(ae.getSource()==balanceenq){ 
            this.setVisible(false);
            new BalanceEquiry(pinnumber).setVisible(true);
        }else if(ae.getSource()==exit){ 
            System.exit(0);
        }
    }
    public static void main(String args[]){
        new Transactions("");
    }
        
}
