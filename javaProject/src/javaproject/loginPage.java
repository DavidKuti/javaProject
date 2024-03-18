/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author david
 */
public class loginPage extends JFrame{
    JFrame frame = new JFrame();
    loginPage() throws SQLException{
        JLabel icon_,title, pan1,pan2,pan3,pan4;
        JPanel title_panel, form_panel, pane1,pane2,pane3,pane4;
        JButton submitBtn,register;
        setLayout(new BorderLayout());
        title_panel =  new JPanel();
        form_panel =  new JPanel();
        form_panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        title_panel.setLayout(new FlowLayout());
        icon_ = new JLabel();
        title = new JLabel("Login Page");
        title.setFont(new Font("Serif",Font.BOLD,39));
        icon_.setIcon(new ImageIcon("C:\\Users\\david\\Documents\\GitHub\\javaProject\\javaProject\\src\\javaproject\\loginPic.png"));
//        icon_.setSize(10, 5);
        title_panel.add(icon_);
//        title_panel.add(title);
        validate();
        add(title_panel,BorderLayout.NORTH);
        pane1 = new JPanel();
        pane2 = new JPanel();
        pane3 = new JPanel();
        pane4 = new JPanel();
        pane1.setLayout(new BoxLayout(pane1, BoxLayout.Y_AXIS));
        pane2.setLayout(new BoxLayout(pane2, BoxLayout.Y_AXIS));
        pane3.setLayout(new BoxLayout(pane3, BoxLayout.Y_AXIS));
        pane4.setLayout(new BoxLayout(pane4, BoxLayout.Y_AXIS));
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaProject.class.getName()).log(Level.SEVERE, null, ex);
        }
            String url = "jdbc:sqlserver://localhost:1433;databaseName=AirlineResDB";
            String user = "sa";
            String pass = "123456";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection Succeeded!");
            
            GridBagConstraints gbc2 = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 5;
            gbc.insets = new Insets(0,0,10,0);
//            gbc.anchor = gbc.WEST;
            form_panel.add(title, gbc);
            
            pan1 = new JLabel("First Name");
            pan1.setFont(new Font("Serif", Font.BOLD, 20));
            pane1.setFont(new Font("Serif", Font.BOLD, 20));
            pane1.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane1.add(pan1,gbc2);
            TextField txt1 = new TextField(35);
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane1.add(txt1,gbc2);
            
            gbc.gridx = 0;
            gbc.gridy = 10;
            form_panel.add(pane1,gbc);
            
            pan2 = new JLabel("Last Name");
            pan2.setFont(new Font("Serif", Font.BOLD, 20));  
            pane2.setFont(new Font("Serif", Font.BOLD, 20));
            pane2.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane2.add(pan2,gbc2);
            TextField txt2 = new TextField(35);
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane2.add(txt2,gbc2);
            
            gbc.gridx = 0;
            gbc.gridy = 15;
            form_panel.add(pane2,gbc);
            
            pan3 = new JLabel("Contact Number(+234)");
            pan3.setFont(new Font("Serif", Font.BOLD, 20));
            pane3.setFont(new Font("Serif", Font.BOLD, 20));
            pane3.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane3.add(pan3,gbc2);
            TextField txt3 = new TextField(35);
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane3.add(txt3,gbc2);
            
            gbc.gridx = 0;
            gbc.gridy = 30;
            form_panel.add(pane3,gbc);
            
            pan4 = new JLabel("Password");
            pan4.setFont(new Font("Serif", Font.BOLD, 20));
            pane4.setFont(new Font("Serif", Font.BOLD, 20));
            pane4.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane4.add(pan4,gbc2);
            JTextField txt4 = new JTextField(10);
            txt4.setFont(new Font("Serif", Font.BOLD, 20));
            
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane4.add(txt4,gbc2);
            
            gbc.gridx = 0;
            gbc.gridy = 50;
            form_panel.add(pane4,gbc);
            
            submitBtn = new JButton("Login");
            gbc.anchor = gbc.EAST;
            gbc.gridy = 55;
            submitBtn.setFont(new Font("Serif", Font.BOLD, 20));

            form_panel.add(submitBtn, gbc);
            
            register = new JButton("Head to Register");
            gbc.anchor = gbc.WEST;
            gbc.gridy = 55;
            register.setFont(new Font("Serif", Font.BOLD, 20));
            form_panel.add(register, gbc);
            JScrollPane scrollPane = new JScrollPane(form_panel);
            register.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dispose();
                    JavaProject jp = new JavaProject();
                } catch (SQLException ex) {
                    Logger.getLogger(JavaProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            });
            submitBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(txt1.getText().isBlank()||txt2.getText().isBlank()||txt3.getText().isBlank()||txt4.getText().isBlank()){
                        throw new exception();
                    }
                    if(txt1.getText().length() > 30||txt2.getText().length() > 30||txt3.getText().length() > 11||txt4.getText().length() > 20){
                        throw new exception();
                    }
                    String query =  "select FirstName, Lastname, contactNo, password "
                            + "from Customer where ContactNo = '" + txt3.getText() + "'";
                    Statement st = con.createStatement();
                    ResultSet rf = st.executeQuery(query);
                    ResultSetMetaData rsm = rf.getMetaData();
                    int count = rsm.getColumnCount();
                    // Print column names
//                    for (int i = 1; i <= count; i++) {
//                        System.out.print(rsm.getColumnName(i) + "\t");
//                    }
//                    System.out.println();

                    // Print data for each row
                    while (rf.next()) {
                        if(rf.getString(1).equals(txt1.getText())){
                            if(rf.getString(2).equals(txt2.getText())){
                                if(rf.getString(4).equals(txt4.getText())){
                                    JOptionPane.showMessageDialog(rootPane, "Login Successful!");
                                    dispose();
                                    main mn = new main();
                                }else{
                                    System.out.println("4");
                                    throw new exception();
                                }
                            }else{
                                System.out.println("2");
                                throw new exception();
                            }
                        }else{
                            System.out.println("1");
                            throw new exception();
                        }
                    }
                    
                }catch(SQLException se){
                    JOptionPane.showMessageDialog(rootPane, "Invalid Details");
                }catch(exception eer){
                    
                }
            }
            });
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setMinimumSize(new Dimension(1900,700));
            this.getContentPane().add(scrollPane, BorderLayout.CENTER);
//            setSize(800,800);
            setVisible(true);
    }
    
    class exception extends RuntimeException{
        exception(){
            JOptionPane.showMessageDialog(frame,("Invalid Details!"));
        }
    }
    
    public static void main(String[] args) throws SQLException {
        loginPage lp = new loginPage();
    }
}
