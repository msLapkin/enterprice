package ru.geekbrains.javaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/card"})
public class CardServlet extends HttpServlet {
    //String title = "Корзина";
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);
        request.getRequestDispatcher("Card.jsp").forward(request,response);
        //new NavigationServlet(request,response,title);
    }
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //processRequest(request, response);
//        new NavigationServlet(request,response,title);
//    }
}
