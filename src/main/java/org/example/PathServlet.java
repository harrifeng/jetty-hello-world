package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet/*")
public class PathServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Pattern</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(req.getRequestURI() + "<br>");
        out.println(req.getContextPath() + "<br>");
        out.println(req.getServletPath() + "<br>");
        out.println(req.getPathInfo() + "<br>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
