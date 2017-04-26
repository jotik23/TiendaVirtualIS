package co.edu.unac.ing.store.controllers;

import co.edu.unac.ing.store.models.ConnectionBD;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Map;

/**
 * Created by antonio on 20/04/2017.
 */
@javax.servlet.annotation.WebServlet(name = "RegServlet", urlPatterns="/RegistroProductos")
 public class RegSerlvet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String codigo =  request.getParameter("codigo");
        String nombre =  request.getParameter("nombre");
        String categoria =  request.getParameter("categoria");
        String tipo =  request.getParameter("tipo");
        String precio =  request.getParameter("precio");
        String talla =  request.getParameter("talla");
        String cantidad =  request.getParameter("cantidad");
        String color =  request.getParameter("color");
        String tiempoDisponible =  request.getParameter("tiempoDisponible");
        String imagen =  request.getParameter("imagen");





        ConnectionBD connectionBD = new ConnectionBD();
        connectionBD.connect("root", "", "store");

        connectionBD.insertData("productos", codigo,nombre,categoria,tipo, precio,talla,cantidad, color, tiempoDisponible,imagen);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        //Recuperar valores
        //Hacer la lógica
        //Conectarnos a la BD
        ConnectionBD connectionBD = new ConnectionBD();
        connectionBD.connect("root", "", "store");
        //Preparar datos
        //Enviarlos al JSP

        RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/RegistrodeProductos.jsp");
        RequetsDispatcherObj.forward(request, response);
    }
}
