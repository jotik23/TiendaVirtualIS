package co.edu.unac.ing.store.logic;

import co.edu.unac.ing.store.dto.User;
import co.edu.unac.ing.store.models.UserConsult;

import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;

/**
 * Created by Frank Bustamante on 16/05/2017.
 */
public class UserFacade {

    public boolean validateLogin(User user){
        ArrayList<User> users = UserConsult.consultUser();
        boolean validation = false;

        if (!user.getEMail().equals(null) && !user.getEMail().equals("") &&
                !user.getPassword().equals(null) && !user.getPassword().equals("")){

            for (int i=0; i<users.size();i++){
                if (user.getPassword().equals(users.get(i).getPassword()) && user.getEMail().equals(users.get(i).getEMail())){

                    return  true;
                }
            }
        }

        return validation;
    }

    public String validateLoginName(User user){
        ArrayList<User> users = UserConsult.consultUser();
        String nameUser ="";

        if (!user.getEMail().equals(null) && !user.getEMail().equals("") &&
                !user.getPassword().equals(null) && !user.getPassword().equals("")){

            for (int i=0; i<users.size();i++){
                if (user.getPassword().equals(users.get(i).getPassword()) && user.getEMail().equals(users.get(i).getEMail())){

                    nameUser = users.get(i).getName();
                }
            }
        }
        return nameUser;
    }

    public boolean validate(User user){

        boolean validation = false;

        if ((!user.getAddress().equals(null) && !user.getEMail().equals(null)  && !user.getId().equals(null)
                && !user.getName().equals(null) && !user.getPassword().equals(null) && !user.getPhone().equals(null) )){
            if ((!user.getAddress().equals("") && !user.getEMail().equals("") &&  !user.getId().equals("")
                    && !user.getName().equals("") && !user.getPassword().equals("") && !user.getPhone().equals("") )){

                validation = true;

            }else{validation = false;}
        }else{validation = false;}

        return validation;
    }
}