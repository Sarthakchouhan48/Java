ServletTest.java

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/test")
public class ServletTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection con = null ;
        PrintWriter pr = resp.getWriter();
        String name = req.getParameter("ename");
        String branch = req.getParameter("branch");
        int id = Integer.parseInt(req.getParameter("id"));
        if(name == null || name == "" || id == 0 || branch =="" || branch == null ) resp.sendRedirect("index.jsp");
        try{
            System.out.println("try");
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/studs";
            String username = "root";
            String pass = "0000";
            con = DriverManager.getConnection(url, username , pass );
            System.out.println("co");
            con.setAutoCommit(true);
            PreparedStatement pt = con.prepareStatement("INSERT into employee (id , ename, branch) values(?,?,?)");
            System.out.println("pr");
            pt.setInt(1, id);
            pt.setString(2, name);
            pt.setString(3, branch);
            pt.executeUpdate();
            pr.print("Inserted Successfully!!!!");
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

index.jsp

<html>
<body>
<form action="test" method="POST">
   <input type="text" name="ename"/>
   <input type="text" name="branch"/>
   <input type="number" name="id"/>
   <button type="submit">submit</button>
</form>
</body>
</html>
