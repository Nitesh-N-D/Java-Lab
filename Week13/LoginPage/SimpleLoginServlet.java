#Login Servlet in Java

Simple servlet program to demonstrate user authentication using HTTP POST method.
It validates username and password, and displays success or failure message in the browser.
    

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/login")
public class SimpleLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

      
        if ("admin".equals(username) && "1234".equals(password)) {
            out.println("<h2>Login Successful</h2>");
            out.println("<p>Welcome, " + username + " </p>");
        } else {
            out.println("<h2>Login Failed</h2>");
            out.println("<p>Invalid username or password.</p>");
            out.println("<a href='login.html'>Try Again</a>");
        }

        out.close();
    }
}
