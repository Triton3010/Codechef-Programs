import java.sql.*;

public class jdbc {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println("Roll no: "+rs.getInt("Roll")+" Name : "+rs.getString("Name"));
			}
		}
catch(Exception ex)
		{
	ex.printStackTrace();
		}
	}

}
