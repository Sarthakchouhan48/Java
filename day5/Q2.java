import java.sql.*;
public class Q2 {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/studs";
            String username = "root";
            String pass = "0000";
            con = DriverManager.getConnection(url, username , pass );
            Statement s=con.createStatement();
            ResultSet r=s.executeQuery("select * from stud");
            while(r.next()){
                System.out.println(r.getInt("id") + " " + r.getString("name") + " " + r.getString("course") + " " + r.getString("C.id"));
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

