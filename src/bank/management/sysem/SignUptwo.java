 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.sysem;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;//for GUI
import java.awt.*;//for image package
import java.awt.event.*;//for actionListener(for buttons)
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

/**
 *
 * @author Sathish
 */
public class SignUptwo extends JFrame implements ActionListener{
    JTextField pan,addhar;
    long random;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JDateChooser dateChooser;
    JComboBox religion,category,income,edu,occ;
    String formno;
    SignUptwo(String formno){
        this.formno=formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
        
        JLabel additionalDetails=new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);//setBounds works only if setLayout is null
        add(additionalDetails);
        
        JLabel name=new JLabel("Religion :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);//setBounds works only if setLayout is null
        add(name);
        
        //combo box for dropdown
        String []valReligion={"Hindu","Muslim","Sikh","Christian","Other"};
        religion=new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
       
        
        JLabel fname=new JLabel("Category :");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);//setBounds works only if setLayout is null
        add(fname);
        
        String []valCategory={"General","OBC","BC","St","Other"};
        category=new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        
        JLabel dob=new JLabel("Income :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);//setBounds works only if setLayout is null
        add(dob);
        
        String []valIncome={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,00"};
        income=new JComboBox(valIncome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        
        
        JLabel gender=new JLabel("Educational ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);//setBounds works only if setLayout is null
        add(gender);
        
        
        
        JLabel email=new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);//setBounds works only if setLayout is null
        add(email);
        
        String []valedu={"Non Graduation","Graduation","Post Graduation","Doctrate","Others"};
        edu=new JComboBox(valedu);
        edu.setBounds(300,315,400,30);
        edu.setBackground(Color.WHITE);
        add(edu);
        
        
        
        JLabel maritalStatus=new JLabel("Occupation :");
        maritalStatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalStatus.setBounds(100,390,200,30);//setBounds works only if setLayout is null
        add(maritalStatus);
        
        String []valocc={"Salaried","Self Employed","Buisness","Student","Retired","Others"};
        occ=new JComboBox(valocc);
        occ.setBounds(300,390,400,30);
        occ.setBackground(Color.WHITE);
        add(occ);
        
       
        
        JLabel address=new JLabel("PAN Number:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);//setBounds works only if setLayout is null
        add(address);
        
        pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel addharl=new JLabel("Aadhar Number:");
        addharl.setFont(new Font("Raleway",Font.BOLD,20));
        addharl.setBounds(100,490,200,30);//setBounds works only if setLayout is null
        add(addharl);
        
        addhar=new JTextField();
        addhar.setFont(new Font("Raleway",Font.BOLD,14));
        addhar.setBounds(300,490,400,30);
        add(addhar);
        
        JLabel state=new JLabel("Senior Citizen :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);//setBounds works only if setLayout is null
        add(state);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300,540,60,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        sno=new JRadioButton("No");
        sno.setBounds(450,540,120,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        ButtonGroup gendergroup =new ButtonGroup();//grouping so that either of one can be selected
        gendergroup.add(syes);
        gendergroup.add(sno);
        
        
        
        JLabel pincode=new JLabel("Existing Account :");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);//setBounds works only if setLayout is null
        add(pincode);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,60,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        eno=new JRadioButton("No");
        eno.setBounds(450,590,120,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        ButtonGroup egendergroup =new ButtonGroup();//grouping so that either of one can be selected
        egendergroup.add(eyes);
        egendergroup.add(eno);
        
        
        next=new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        //fnameTextField,emailTextField,addressTextField,citytextField,statetextField,pintextField;
       
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String sedu=(String)edu.getSelectedItem();
        String socc=(String)occ.getSelectedItem();
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }
        else if(sno.isSelected()){
            seniorcitizen="No";
        }
        String existingacc=null;
        if(eyes.isSelected()){
            existingacc="Yes";
        }
        else if(eno.isSelected()){
            existingacc="No";
        }
        
        
        String span=pan.getText();
        String saddhar=addhar.getText();
        
        
        try{
            if(sreligion.equals("")){
                //to show alert or error message
                JOptionPane.showMessageDialog(null, "Religion is required");
            }
            else if(scategory.equals("")){
                //to show alert or error message
                JOptionPane.showMessageDialog(null, "Category is required");
            }
            else if(sedu.equals("")){
                //to show alert or error message
                JOptionPane.showMessageDialog(null, "Education is required");
            }
            else if(socc.equals("")){
                //to show alert or error message
                JOptionPane.showMessageDialog(null, "Occupation is required");
            }
            else if(seniorcitizen.equals("")){
                //to show alert or error message
                JOptionPane.showMessageDialog(null, "SeniorCitizen? is required");
            }
            else if(existingacc.equals("")){
                //to show alert or error message
                JOptionPane.showMessageDialog(null, "Existing account details is required");
            }
            else if(span.equals("")){
                //to show alert or error message
                JOptionPane.showMessageDialog(null, "Marital Status is required");
            }
            else if(saddhar.equals("")){
                //to show alert or error message
                JOptionPane.showMessageDialog(null, "Adhar number is required");
            }
            
            else{
                Conn c=new Conn();
                String query="insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"','"+sincome+"','"+sedu+"','"+socc+"','"+span+"','"+saddhar+"','"+seniorcitizen+"','"+existingacc+"')";
                c.s.executeUpdate(query);
                //signup3 object
                new SignUpthree(formno).setVisible(true);
                setVisible(false);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String args[]){
        new SignUptwo("");
    }
}
