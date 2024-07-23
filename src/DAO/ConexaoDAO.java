package DAO;

import database.DBConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import util.PropertiesManager;

public class ConexaoDAO {

    private HashMap dadosDB;
    protected Connection conexao;

    public ConexaoDAO() {
        try {
            dadosDB = new PropertiesManager("db.properties").readPropertiesFile();
            String user = (String) dadosDB.get("conexao.user");
            String password = (String) dadosDB.get("conexao.password");
            String driver = (String) dadosDB.get("conexao.driver");
            String url = (String) dadosDB.get("conexao.url");
            conexao = DBConnection.getInstance(user, password, driver, url);
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (SQLException sqe) {
            System.out.println(sqe);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

}
