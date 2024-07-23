package database;

import java.sql.*; // para manipulação do JDBC

/**
 * Classe respons�vel pelo gerenciamento da conex�o com o banco de dados
 * @author Karen Borges
 */
public class DBConnection {
    
    //Atributos para manipulação do BD
    private static String user;
    private static String password;
    private static String driver;
    private static String url;
    private static Connection conexao;
    
    /**
     * Método do padrão Singleton.
     * Se a conex�o n�o existir, cria e retorna.
     * Caso contr�rio retorna o objeto de conex�o j� existente.
     * @param user Usu�rio de conex�o com o banco de dados
     * @param password Senha de conex�o com o banco de dados
     * @param driver Driver de conex�o com o banco de dados
     * @param url URL de conex�o com o banco de dados
     * @return Objeto de conex�o
     * @throws java.sql.SQLException Exce��o gerada em caso de problema de conex�o com o banco de dados
     * @throws java.lang.ClassNotFoundException Exce��o gerada em caso de problemas com o driver do banco de dados
     */
    public static Connection getInstance(String user, String password, String driver, String url) throws SQLException, ClassNotFoundException {
        if( conexao == null ) {
            setUser(user);
            setPassword(password);
            setDriver(driver);
            setUrl(url);
            new DBConnection();
        }
        return conexao;
    }
    
    /**
     * M�todo que retorna o objeto de conex�o que j� existe.
     * @return o objeto de conex�o
     */
    public static Connection getInstance(){
        return conexao;
    }
    
    private DBConnection() throws SQLException, ClassNotFoundException {
        conexao = openConnection();
    }
    
    private Connection openConnection() throws SQLException, ClassNotFoundException  {
        Class.forName(driver); //carrega o drive. Pode gerar ClassNotFoundException
        conexao = DriverManager.getConnection(url, user, password); // abre a conex�o para esta URL usando o driver carregado na linha anterior
        return conexao; //Conseguiu abrir a conexao
    }
    
    /**
     * M�todo que fecha a conex�o.
     * @throws java.sql.SQLException Exce��o gerada em caso de problema no momento de encerrar a conex�o
     */
    public static void closeConnection() throws SQLException{
        conexao.close();
        conexao = null;
    }

    private static void setUser(String aUser) {
        user = aUser;
    }

    private static void setPassword(String aPassword) {
        password = aPassword;
    }

    private static void setDriver(String aDriver) {
        driver = aDriver;
    }

    private static void setUrl(String aUrl) {
        url = aUrl;
    }
  
}