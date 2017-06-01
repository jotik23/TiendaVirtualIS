package co.edu.unac.ing.store.controllers;

import co.edu.unac.ing.store.dto.Cart;
import co.edu.unac.ing.store.dto.Product;
import co.edu.unac.ing.store.logic.CartFacade;
import co.edu.unac.ing.store.logic.ProductFacade;
import co.edu.unac.ing.store.models.Connection;
import co.edu.unac.ing.store.utilities.Mapper;

import javax.servlet.RequestDispatcher;
import java.io.IOException;

/**
 * Created by RicardoRuiz on 20/04/2017.
 */
@javax.servlet.annotation.WebServlet(name = "CartShopping", urlPatterns="/carrito")
    public class CartShopping extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        Cart cart = Mapper.mappingRequestToCarrito(request);

        //LOGICA
        CartFacade cartFacade = new CartFacade();
        boolean valid = cartFacade.validate(cart);

        if(valid){
            Connection connection = new Connection();
            connection.insert(cart);
        }else{
            //other
        }


        RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/carrito.jsp");
        RequetsDispatcherObj.forward(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/carrito.jsp");
        RequetsDispatcherObj.forward(request, response);


    }

    
}




