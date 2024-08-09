import java.sql.*;

public class Q5 {
    public static void main(String[] args) {

        Connection con = null;

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studs", "root", "0000");
            String ss = "{call getEmployee(?)}";
            CallableStatement obj = con.prepareCall(ss);
            obj.setInt(1,1);
            ResultSet rs= obj.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("ename"));
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
