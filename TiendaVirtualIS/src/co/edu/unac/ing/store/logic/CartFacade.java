package co.edu.unac.ing.store.logic;

import co.edu.unac.ing.store.dto.Cart;

/**
 * Created by RicardoRuiz on 01/06/2017.
 */
public class CartFacade {

    public boolean validate(Cart cart){

        boolean validation = false;

        if ((!cart.getCategory().equals(null) && !cart.getCode().equals(null)  && !cart.getColor().equals(null)
                && !cart.getImage().equals(null) && !cart.getName().equals(null) && !String.valueOf(cart.getPrice()).equals(null) )){
            if ((!String.valueOf(cart.getQuantity()).equals("") && !String.valueOf(cart.getSize()).equals("")
                    &&  !cart.getTime().equals("") && !cart.getType().equals("")  )){

                validation = true;

            }else{validation = false;}
        }else{validation = false;}

        return validation;
    }

}
