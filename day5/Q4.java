import java.sql.*;
public class Q4 {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/studs";
            String username = "root";
            String pass = "0000";
            con = DriverManager.getConnection(url, username , pass );
            PreparedStatement s=con.prepareStatement("insert into employee(id, ename, branch) values(?,?, ?)");
            s.setInt(1, 1);
            s.setString(2, "paul");
            s.setString(3, "France");
            s.execute();
            Statement st = con.createStatement();
            ResultSet r= st.executeQuery("select * from employee");
            while(r.next()){
                System.out.println(r.getInt("id") + " " + r.getString("ename") + " " + r.getString("branch"));
            }
            System.out.println(con);
        } catch(Exception e){
            System.out.println("error");
        } finally {
            try {
                con.close();
                System.out.println("connection closed");
            } catch (Exception e) {
                System.out.println("Connection Not Closed");
            }
        }
    }
}