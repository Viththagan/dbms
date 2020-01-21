
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
public class Bus_Booking extends Booking {
private String Bus_NO;

public String get_BNO() {
	return Bus_NO;
}

public void set_BNO(String Bus_NO) {
	this.Bus_NO=Bus_NO;
}


@Override
public void insert() {
	
    myconnection my=new myconnection();
    PreparedStatement ps;
    ResultSet rs;
	//SQL Query
	try {
		
        Connection conn=my.getDBConnection();
       
        
        String sql="INSERT INTO dbms.bus_allocation (Allocation_ID,Date,Bus_NO) values('"+Allocation_ID+"','"+Date+"','"+Bus_NO+"')";
        ps=conn.prepareStatement(sql);
        ps.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Successfully Added");
        conn.close();
  
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,ex);
    }
	
}


@Override
public void search() {
	
	myconnection my=new myconnection();
    PreparedStatement ps;
    ResultSet rs;
        
    try{
    	Connection conn=my.getDBConnection();
    	String sql="SELECT * FROM dbms.bus_allocation WHERE Allocation_ID='"+Allocation_ID+"' AND Allocation_Date='"+Date+"'";
        ps=conn.prepareStatement(sql);
        rs=ps.executeQuery(sql);
                
        
         while(rs.next()){
             Bus_NO=rs.getString("Bus_No");
         }
       
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex);
    }  
	
}


}

