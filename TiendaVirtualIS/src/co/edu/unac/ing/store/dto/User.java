package co.edu.unac.ing.store.dto;

/**
 * Created by lds on 16/03/2017.
 */
public class User {
    private String name;
    private String address;
    private String password;
    private String eMail;
    private String id;
    private String telfono;

    public String getEMail(){
        return eMail;
    }

    public void setEMail(String eMail){
        this.eMail =  eMail;
    }

    public String getName(){ return name; }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String  getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getPhone(){
        return telfono;
    }

    public void setPhone(String phone){
        this.telfono = phone;
    }
}
