package co.edu.unac.ing.store.utilities;

import co.edu.unac.ing.store.dto.Cart;
import co.edu.unac.ing.store.dto.Product;
import co.edu.unac.ing.store.dto.ProductDTO;
import co.edu.unac.ing.store.dto.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by antonio on 4/05/2017.
 */
public class Mapper {

    public  static User mappíngRequestToLoginUser(javax.servlet.http.HttpServletRequest request){
        User user = new User();

        try{
            user.setEMail(request.getParameter("user"));
            user.setPassword(request.getParameter("pass"));
        }catch(Exception ex){
            System.out.println(ex.getCause());
        }

        return user;
    }

    public static User mappingRequestToUser(javax.servlet.http.HttpServletRequest request) {

        User user = new User();
        try{
            user.setName(request.getParameter("nombre"));
            user.setLastName(request.getParameter("apellido"));
            user.setId(request.getParameter("cedula"));
            user.setPhone(request.getParameter("telefono"));
            user.setAddress((request.getParameter("ciudad") +" "+ request.getParameter("direccion")));
            user.setEMail(request.getParameter("email"));
            user.setPassword(request.getParameter("contra"));
        }
        catch(Exception e){
            System.out.print(e.getCause());
        }

        return user;
    }

    public static Product mappingRequestToProduct(javax.servlet.http.HttpServletRequest request) throws FileUploadException, IOException {

        Product product = new Product();
        Map<String, String> parameters = new HashMap<>();

        List<FileItem> items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
        for (FileItem item : items) {
            if (item.isFormField()) {
                String fieldname = item.getFieldName();
                String fieldvalue = item.getString();
                parameters.put(fieldname, fieldvalue);
            } else {
                String fieldname = item.getFieldName();
                String filename = FilenameUtils.getName(item.getName());
                InputStream filecontent = item.getInputStream();
                // ... (do your job here)

                parameters.put(fieldname,filename);

            }
        }

        product.setCode(parameters.get("codigo"));
        product.setName(parameters.get("nombre"));
        product.setCategory(parameters.get("categoria"));
        product.setType(parameters.get("tipo"));
        product.setPrice(Double.parseDouble(parameters.get("precio")));
        product.setSize(Integer.parseInt(parameters.get("talla")));
        product.setQuantity(Integer.parseInt(parameters.get("cantidad")));
        product.setColor(parameters.get("color"));
        product.setTime(parameters.get("tiempoDisponible"));
        product.setImage(parameters.get("imagen"));



        return product;
    }


    public static Cart mappingRequestToCarrito(javax.servlet.http.HttpServletRequest request){

        Cart carrito = new Cart();

        carrito.setCode(request.getParameter("codigo"));
        carrito.setName(request.getParameter("nombre"));
        //carrito.setCategory(request.getParameter("categoria"));
        carrito.setType(request.getParameter("tipo"));
        carrito.setPrice(Float.parseFloat(request.getParameter("precio")));
        carrito.setSize(Integer.parseInt(request.getParameter("talla")));
        carrito.setQuantity(Integer.parseInt(request.getParameter("cantidad")));
        carrito.setColor(request.getParameter("color"));
        //carrito.setTime(request.getParameter("tiempoDisponible"));
        carrito.setImage(request.getParameter("imagen"));

        return carrito;
    }

    public static ProductDTO mappingRequestToProductDTO(javax.servlet.http.HttpServletRequest request){

        ProductDTO product = new ProductDTO();

        product.setCode(request.getParameter("codigo"));
        product.setName(request.getParameter("nombre"));
        product.setCategory(request.getParameter("categoria"));
        product.setType(request.getParameter("tipo"));
        product.setPrice(Double.parseDouble(request.getParameter("precio")));
        product.setSize(Integer.parseInt(request.getParameter("talla")));
        product.setColor(request.getParameter("color"));
        product.setTime(request.getParameter("tiempoDisponible"));
        product.setImage(request.getParameter("imagen"));

        return product;

    }

}
