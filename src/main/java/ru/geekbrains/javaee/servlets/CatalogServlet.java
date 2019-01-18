package ru.geekbrains.javaee.servlets;

import ru.geekbrains.javaee.store.MyProduct;
import ru.geekbrains.javaee.store.MyStore;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@WebServlet(urlPatterns = {"/catalog"})
public class CatalogServlet extends HttpServlet {
    //String title = "Каталог";
    @Inject
    public MyStore myStore;

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);
//        final Collection<MyProduct> projects = myStore.getProjects();
//        request.setAttribute("projects", projects);
        request.getRequestDispatcher("Catalog.jsp").forward(request,response);
    }
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //processRequest(request, response);
//        new NavigationServlet(request,response,title);
//    }
}
