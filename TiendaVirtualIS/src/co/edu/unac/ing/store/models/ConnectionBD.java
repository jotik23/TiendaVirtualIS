package co.edu.unac.ing.store.models;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

/**
 * Created by lds on 21/03/2017.
 */
public class ConnectionBD {

    private static Connection connection;

    public void connect(String user, String pass, String dbName) {
        Driver driver;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName, user, pass);
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void closeConnection() {
        try {
            connection.close();
            System.out.println("Se ha finalizado la conexión con el servidor");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createDB(String name) {
        try {
            String Query = "CREATE DATABASE " + name;
            Statement st = connection.createStatement();
            st.executeUpdate(Query);
            connect("root", "", name);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createTable(String name) {
        try {
            String Query = "CREATE TABLE " + name + ""
                    + "(código INT (10),nombre VARCHAR(50),Categoria VARCHAR(15),"
                    + " tipo VARCHAR(20),precio float, talla tinyint(3), Cantidad disponible smallint )";
            Statement st = connection.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertData(String table_name, String codigo, String nombre, String categoria, String tipo, String precio,String talla, String cantidad, String color, String tiempoDisponible,String imagen) {
        try {
            String Query = "INSERT INTO " + table_name + " VALUES("
                    + codigo + ", "
                    + "\"" + nombre + "\", "
                    + "\"" + categoria + "\", "
                    + "\"" + tipo + "\", "
                    + "\"" + precio + "\", "
                    + "\"" + talla + "\", "
                    + "\"" + cantidad + "\", "
                    + "\"" + color + "\", "
                    + "\"" + tiempoDisponible + "\", "
                    + "\"" + imagen + "\" )";
            Statement st = connection.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void getValues(String table_name) {
        try {
            String Query = "SELECT * FROM " + table_name;
            Statement st = connection.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getString("ID") + " "
                        + "Nombre: " + resultSet.getString("Nombre") + " " + resultSet.getString("Apellido") + " "
                        + "Edad: " + resultSet.getString("Edad") + " "
                        + "Sexo: " + resultSet.getString("Sexo"));
            }

        } catch (SQLException ex) {

        }
    }

    public void deleteRecord(String table_name, String ID) {
        try {
            String Query = "DELETE FROM " + table_name + " WHERE ID = \"" + ID + "\"";
            Statement st = connection.createStatement();
            st.executeUpdate(Query);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}



















