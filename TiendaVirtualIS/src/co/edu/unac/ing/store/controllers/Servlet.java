package co.edu.unac.ing.store.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lds on 28/03/2017.
 */
@WebServlet(name = "Servlet" , urlPatterns="/usuarios")
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/usuario.jsp");
        RequetsDispatcherObj.forward(request, response);
    }

}