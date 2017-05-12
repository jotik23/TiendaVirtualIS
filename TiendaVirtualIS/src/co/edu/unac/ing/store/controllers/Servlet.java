package co.edu.unac.ing.store.controllers;


import co.edu.unac.ing.store.models.Connection;

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
@javax.servlet.annotation.WebServlet(name = "Servlet", urlPatterns="/usuarios")
public class Servlet extends HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String nombre_completo =  request.getParameter("nombre_completo");
        String cedula =  request.getParameter("cedula");
        String telefono =  request.getParameter("telefono");
        String email =  request.getParameter("email");
        String direccion =  request.getParameter(("direccion"));
        String contra =  request.getParameter("contra");

        Connection connectionBD = new Connection();
        //connectionBD.connect("root", "", "store");

        connectionBD.insertUsuario("user", nombre_completo,cedula,telefono,email, direccion,contra);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Connection connectionBD = new Connection();
        //connectionBD.connect("root", "", "store");

        RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/usuario.jsp");
        RequetsDispatcherObj.forward(request, response);
    }

}
