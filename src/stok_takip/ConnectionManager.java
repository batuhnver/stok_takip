package stok_takip;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionManager {
    
   
    private static String url = "jdbc:sqlserver://localhost:1433;databaseName=StokTakip;";
    private static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String username = "admin";
    private static String password = "administrator";
    private static Connection connection;
 // private static String urlstring;
    
    
    public static Connection getConnection(){
        try{
            Class.forName(driverName);
            try{
                connection = DriverManager.getConnection(url,username,password);
                
            } catch(SQLException ex) {
                System.out.println("Bağlantı Kurulamadı..");
                ex.printStackTrace();
            }
        } catch(ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı.");
        }
        return connection;
        
        
    }
    public static void main(String[] args) {
        getConnection();
    }
    
}
