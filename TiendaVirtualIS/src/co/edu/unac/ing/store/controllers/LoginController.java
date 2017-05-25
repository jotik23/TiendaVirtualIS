package co.edu.unac.ing.store.controllers;

import co.edu.unac.ing.store.dto.User;
import co.edu.unac.ing.store.logic.UserFacade;
import co.edu.unac.ing.store.models.Connection;
import co.edu.unac.ing.store.utilities.Mapper;
import com.sun.net.httpserver.HttpsServer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.ResponseCache;

/**
 * Created by Frank Bustamante on 18/05/2017.
 */
@WebServlet(name = "LoginController", urlPatterns="/login")
public class LoginController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = Mapper.mappngRequestToLoginUser(request);
        UserFacade us = new UserFacade();

        if (us.validateLogin(user)){
            //response.sendRedirect("/index.jsp");
            request.setAttribute("userName",user.getName().toString());
            //response.sendRedirect("/index.jsp");
            //response.addHeader("userName",user.getName());
          RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/index.jsp");
             RequetsDispatcherObj.forward(request, response);
        }
        else{
            response.sendRedirect("/algo.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Login.jsp");
        RequetsDispatcherObj.forward(request, response);
    }


}
