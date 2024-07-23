/*
 * Setupatabase.java
 *
 * Created on 17 de Maio de 2007, 10:23
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package database;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import util.PropertiesManager;

/**
 * Classe responsável pela gerência do banco de dados
 *
 * @author Karen Borges
 */
public class SetupDatabase {

    /**
     * Método que define a localização física do banco de dados
     *
     * @param dir Diretório onde ficará o banco de dados
     */
    public static void setDBSystemDir(String dir) {
        // Decide on the db system directory: <userhome>/.addressbook/
        String userDir = System.getProperty("user.dir", ".");
        String systemDir = userDir + "/" + dir;
        // create the db system directory
        File fileSystemDir = new File(systemDir);
        if (!fileSystemDir.exists()) {
            fileSystemDir.mkdir();
        }
        // Set the db system directory.
        System.setProperty("derby.system.home", systemDir);
    }

    /**
     * Método que verifica se o banco de dados existe
     *
     * @param dbName Nome da base de dados
     * @return Resultado da verificação
     */
    public static boolean dbExists(String dbName) {
        boolean bExists = false;
        String dbLocation = getDatabaseLocation(dbName);
        File dbFileDir = new File(dbLocation);
        if (dbFileDir.exists()) {
            bExists = true;
        }
        return bExists;
    }

    /**
     * Método que busca a localização do banco de dados
     *
     * @param dbName Nome da base de dados
     * @return Localização da base de dados
     */
    private static String getDatabaseLocation(String dbName) {
        String dbLocation = System.getProperty("derby.system.home") + "/" + dbName;
        System.out.println("Local do Bd" + dbLocation);
        return dbLocation;
    }

    /**
     * Método responével pela criação dos arquivos da base de dados
     *
     * @param sqlTabelas Coleção de objetos contendo o sql de criação das
     * tabelas
     * @param conexao Objeto de conexão com o banco de dados
     * @throws java.sql.SQLException Exceção gerada em caso de problema de
     * execução do sql de criação das tabelas.
     * @throws java.io.IOException
     */
    public static void createDatabase(ArrayList sqlTabelas, Connection conexao) throws SQLException, IOException {
        Statement stmt = conexao.createStatement();
        Iterator it = sqlTabelas.iterator();
        while (it.hasNext()) {
            String sql = (String) it.next();
            System.out.println("SQL de criação da tabela: " + sql);
            stmt.execute(sql);
        }
        //Populando a tabela
        PropertiesManager pm = new PropertiesManager("sql.properties");
        HashMap codigos = pm.readPropertiesFile();
        String sqlInsertFarmacia = (String) codigos.get("Insert.Farmacia");
        String sqlInsertPrefImbe = (String) codigos.get("Insert.PrefeituraImbe");
        String sqlInsertPrefOs = (String) codigos.get("Insert.PrefeituraOsorio");
        String sqlInsertPrefTdai = (String) codigos.get("Insert.PrefeituraTramandai");

        stmt.execute(sqlInsertFarmacia);
        stmt.execute(sqlInsertPrefImbe);
        stmt.execute(sqlInsertPrefOs);
        stmt.execute(sqlInsertPrefTdai);
        //Medicamentos Testes
        System.out.println("Não inseriu os medicamentos");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Paracetamol', 100, 'A123', 'Não Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Ibuprofeno', 50, 'B456', 'Não Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Dipirona', 200, 'C789', 'Não Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Omeprazol', 30, 'D012', 'Não Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Metformina', 60, 'E345', 'Não Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Atorvastatina', 28, 'F678', 'Não Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Amoxicilina', 120, 'G901', 'Não Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Losartana', 50, 'H234', 'Não Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Captopril', 100, 'I567', 'Não Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Cloridrato de Sertralina', 30, 'J890', 'Não Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Dexametasona', 25, 'K123', 'Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Amiodarona', 20, 'L456', 'Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Bromoprida', 40, 'M789', 'Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Ciprofloxacino', 80, 'N012', 'Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Enalapril', 60, 'O345', 'Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Furosemida', 70, 'P678', 'Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Glibenclamida', 40, 'Q901', 'Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Hidroclorotiazida', 55, 'R234', 'Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Isotretinoína', 15, 'S567', 'Termolábil')");
        stmt.execute("INSERT INTO APP.MEDICAMENTO(nome, quantidadeCaixa, lote, tipo) VALUES ('Levofloxacino', 35, 'T890', 'Termolábil')");
        

    }

}
