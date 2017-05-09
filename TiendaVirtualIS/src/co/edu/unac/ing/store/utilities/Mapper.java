package co.edu.unac.ing.store.utilities;

import co.edu.unac.ing.store.dto.Product;

/**
 * Created by antonio on 4/05/2017.
 */
public class Mapper {

    public static Product mappingRequestToProduct(javax.servlet.http.HttpServletRequest request){

        Product product = new Product();

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
