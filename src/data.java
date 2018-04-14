
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.*;

public class data {

    public String path;
    public Connection con;
    public Statement statement;
    public ResultSet resultSet;
    
    public void makingConnection(String a){
        path="jdbc:ucanaccess://E:\\Vacations\\ProgrammingOfJava\\NetBeansProjects\\TabbedProject\\Data.accdb";
        try{
        con =DriverManager.getConnection(path);
        statement =con.createStatement();
         System.out.println("connected....");
        resultSet=statement.executeQuery("Select * from "+a);
        }
catch(Exception e){
    System.out.println("Exception");
    e.printStackTrace();
}
    }
    public void connection(){
        try{
         path="jdbc:ucanaccess://E:\\Vacations\\ProgrammingOfJava\\NetBeansProjects\\TabbedProject\\Data.accdb";
            System.out.println("conecting.....");

        }
        catch(Exception e){
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}

   
