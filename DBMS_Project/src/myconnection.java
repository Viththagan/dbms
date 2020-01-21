
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class myconnection {
	
	 public static Connection getDBConnection (){
	         Connection conn = null;
	         try{
	        	 Class.forName("com.mysql.jdbc.Driver");
	            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms","root","0000");
	           
	            return conn;
	        }catch(Exception ex){
	            JOptionPane.showMessageDialog(null,"Not Connected");
	            return conn;
	        }
	     }
	
}
