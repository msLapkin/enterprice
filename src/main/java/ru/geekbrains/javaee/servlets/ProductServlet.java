package ru.geekbrains.javaee.servlets;

import ru.geekbrains.javaee.store.MyProduct;
import ru.geekbrains.javaee.store.MyStore;

import javax.ejb.Init;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@WebServlet(urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);
        request.getRequestDispatcher("Product.jsp").forward(request,response);
//        new NavigationServlet(request,response,title);

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //processRequest(request, response);
//        new NavigationServlet(request,response,title);
//    }
    }
}
