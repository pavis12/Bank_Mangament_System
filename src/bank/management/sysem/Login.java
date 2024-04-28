/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.sysem;
import javax.swing.*;//for GUI
import java.awt.*;//for image package
import java.awt.event.*;//for actionListener(for buttons)
import java.sql.*;//for resultset-to strore all the datas under query

/**
 *
 * @author Sathish
 */
public class Login extends JFrame implements ActionListener{
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        //for image icon
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        //make the icon size small
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        //converting the image back to image icon since JLabel do not accept Image
        ImageIcon i3=new ImageIcon(i2);
        //to set the image over the frame
        
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,101,100);//to set icon n top left-startframe,spacesbove frame,height,width
        add(label);
        
        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardno=new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,400,40);
        add(cardno);
        
        cardTextField=new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,30));
        pin.setBounds(120,220,250,30);
        add(pin);
        
        pinTextField=new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        //Buttons 
        login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        //to change the frame color
        getContentPane().setBackground(Color.WHITE);
        setSize(800,450);//defines the length and breadth of the same
        setVisible(true);
        setLocation(350,200);//to show thw frme at the specific position instead of top left
    }
    //this method says what to do once button is clicked
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource()==login){
            Conn conn=new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber=pinTextField.getText();
            String query="select * from login where cardnumber = '"+cardnumber+"'and pin='"+pinnumber+"'";
            try{
                ResultSet rs=conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Car Numer or Pin");
                }
            }
            catch(Exception e){
            System.out.println(e);
        }
            
        }
        else if(ae.getSource()==signup){
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
    }
    public static void main(String args[]){
        new Login();
    }
    
}
