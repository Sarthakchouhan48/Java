ServletTest.java

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class ServletTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pr = resp.getWriter();
        String name = req.getParameter("text");
        if(name == null || name == "" ) resp.sendRedirect("index.jsp");
        pr.print(name);
    }
}

index.jsp

<html>
<body>
<form action="test" method="POST">
   <input type="text" name="text"/>
   <button type="submit">submit</button>
</form>
</body>
</html>

