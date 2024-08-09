import java.sql.*;
public class Q3  {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/studs";
            String username = "root";
            String pass = "0000";
            con = DriverManager.getConnection(url, username , pass );
            Statement s=con.createStatement();
            String q = " create table IF NOT EXISTS employee(id INT NOT NULL PRIMARY KEY, ename VARCHAR(255), branch VARCHAR(255))";
            String q1 = "insert into employee(id, ename, branch) values(3 , 'john', 'New York'), (4 , 'tom', 'Paris')";
            s.execute(q);
            s.executeUpdate(q1);
            System.out.println("-----After deletion-------");
            ResultSet r = s.executeQuery("select * from employee");
            while(r.next()){
                System.out.println(r.getInt("id") + " " + r.getString("ename") + " " + r.getString("branch"));
            }
            String q2 = "delete from employee where id=3";
            s.execute(q2);
            System.out.println("-----After deletion-------");
            r = s.executeQuery("select * from employee");
            while(r.next()){
                System.out.println(r.getInt("id") + " " + r.getString("ename") + " " + r.getString("branch"));
            }
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
