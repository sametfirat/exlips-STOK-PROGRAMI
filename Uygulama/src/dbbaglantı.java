import java.sql.*;
public class dbbaglantı {
  Connection a= null;
  
  public dbbaglantı () {};
  public Connection dbbaglan() {
	  try {
	  this.a = DriverManager.getConnection("jdbc:mariadb://lacalhost:3306/kulanıcı","user=root","password=5969");
	  return a ;
	  }
	  catch(SQLException e){
		  e.printStackTrace();
		  
	  }
	  return a;
  }
  
}
