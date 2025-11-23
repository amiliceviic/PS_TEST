package baza;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Konekcija {
    
    private static Konekcija instance;
    private Connection connection = null;
    
    private Konekcija() {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver je uspseno ucitan");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Konekcija.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "";
            
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Konekcija sa bazom je uspesno uspostavljenaq");
            
            connection.setAutoCommit(false);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Konekcija.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                if (connection != null && !connection.isClosed()) {
//                    connection.close();
//                    System.out.println("Konekcija sa bazom je uspesno raskinuta!");
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(Konekcija.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }
    
    public static Konekcija getInstance() {
        if (instance == null) {
            instance = new Konekcija();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
