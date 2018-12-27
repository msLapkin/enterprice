package ru.geekbrains.javaee.servlets;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Navigation extends HttpServlet {
    public Navigation (HttpServletRequest request, HttpServletResponse response, String displayName){
        processRequest(request,response,displayName);
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response,String displayName)
             {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>"+displayName+"</title>");
            out.println("</head>");
            out.println("<body>");
            out.print("<h1>"+displayName+"</h1>");
            out.print("<a href='main'>Главная</a>");
            out.print("<a href='catalog'>Каталог</a>");
            out.print("<a href='card'>Корзина</a>");
            out.print("<a href='order'>Заказ</a>");
            out.print("<a href='product'>Продукт</a>");
            out.println("</body>");
            out.println("</html>");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
