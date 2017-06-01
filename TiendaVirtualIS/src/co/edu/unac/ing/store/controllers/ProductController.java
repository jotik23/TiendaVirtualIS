package co.edu.unac.ing.store.controllers;

import co.edu.unac.ing.store.dto.Product;
import co.edu.unac.ing.store.logic.ProductFacade;
import co.edu.unac.ing.store.models.Connection;
import co.edu.unac.ing.store.utilities.Mapper;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.RequestDispatcher;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by antonio on 20/04/2017.
 */
@javax.servlet.annotation.WebServlet(name = "ProductController", urlPatterns="/RegistroProductos")
    public class ProductController extends javax.servlet.http.HttpServlet {


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        Product product = null;
        try {
            product = Mapper.mappingRequestToProduct(request);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }

        //LOGICA
        ProductFacade productFacade = new ProductFacade();
        boolean valid = productFacade.validate(product);

        if(valid){
            Connection connection = new Connection();
            connection.insert(product);
        }else{
            //other
        }



        RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/RegistrodeProductos.jsp");
        RequetsDispatcherObj.forward(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/RegistrodeProductos.jsp");
        RequetsDispatcherObj.forward(request, response);


    }

    
}




