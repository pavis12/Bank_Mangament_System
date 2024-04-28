/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
JDBC Connectivity steps:
1.Register the driver
2.Create connection
3.Create Statement
4.Execute Query
5.Close Conection
*/
package bank.management.sysem;
import java.sql.*;  

/**
 *
 * @author Sathish
 */
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        
        //to catch runtime errors due to usage of mysql
        try{
            //Class.forName(com.mysql.cj.jdbc.Driver);
            //Create connection
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","pavi2412");
            s=c.createStatement();
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
