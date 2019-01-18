package ru.geekbrains.javaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/order"})
public class OrderServlet extends HttpServlet {
//    String title = "Заказ";
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);
        request.getRequestDispatcher("Order.jsp").forward(request,response);
        //new NavigationServlet(request,response,title);
    }
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //processRequest(request, response);
//        new NavigationServlet(request,response,title);
//    }
}
