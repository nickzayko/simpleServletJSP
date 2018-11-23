package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/solution")
public class Solution extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        double a = Double.parseDouble(req.getParameter("a"));
        double b = Double.parseDouble(req.getParameter("b"));
        double c = Double.parseDouble(req.getParameter("c"));

        double d = (b*b)-(4*a*c);

        if (d < 0){
            req.setAttribute("result", "There is no solution!");
            req.getServletContext().getRequestDispatcher("/resultPage.jsp").forward(req, resp);
        }
        if (d == 0){
            double x = (-b)/(2*a);
            req.setAttribute("result", "x = " + x);
            req.getServletContext().getRequestDispatcher("/resultPage.jsp").forward(req, resp);
        }
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d))/(2*a);
            double x2 = (-b + Math.sqrt(d))/(2*a);
            req.setAttribute("result", " x1 = " + x1 + "********    x2 = " + x2);
            req.getServletContext().getRequestDispatcher("/resultPage.jsp").forward(req, resp);
        }
    }
}
