package com.granovskiy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {
    /*  method doGET is used to get the info from the (local) server;
        the arguments are: HttpServletRequest req, HttpServletResponse resp;
        the method throws exceptions: ServletException, IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  PrintWriter is used to create an html page with the words "Hello from Servlet!"
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1> Hello from Servlet!</h1>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
