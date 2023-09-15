package vn.edu.iuh.fit.controllers;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ControlServlet", urlPatterns = {"/ControlServlet"})
public class ControllerServlet extends HttpServlet {

    private String message;

    @Override
    public void init(ServletConfig config) {
        message = "Hello World!";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        response.setContentType("txt/html");

        //Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>"+message+"</h1>");
        out.println("</html></body>");;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
