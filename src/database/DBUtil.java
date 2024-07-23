package database;

import java.sql.*;
import java.util.*;


public class DBUtil {
    public static Object getValueFromColumn( ResultSet resultset, int column ) throws SQLException {
        ResultSetMetaData rsmd = resultset.getMetaData();
        switch( rsmd.getColumnType( column ) ) {
            case Types.SMALLINT: {
                return resultset.getInt( column );
            }
            case Types.INTEGER: {
                return resultset.getInt( column );
            }
            case Types.BIGINT: {
                return resultset.getInt( column );
            }
            case Types.VARCHAR: {
                return resultset.getString( column );
            }
            case Types.DATE: {
                return resultset.getDate( column );
            }
            case Types.NUMERIC: {
                return resultset.getDouble( column );
            }
            case Types.BOOLEAN: {
                return resultset.getBoolean( column );
            }
            default: {
                return resultset.getString( column );
            }
        }
    }
    
    /*public static int getNextValueFromSequence( String sequence, String pool ) throws SQLException {
        Connection connection = DBConnectionManager.getInstance().getConnection( pool );
        String sql = "SELECT NEXTVAL ('" + sequence + "')";
        ResultSet resultset = connection.createStatement().executeQuery( sql );
        resultset.next();
        int value = resultset.getInt( 1 );
        DBConnectionManager.getInstance().freeConnection( pool, connection );
        return value;
    }*/
    
    public static Set getColumnsName(String tabela) throws SQLException{
        Connection connection = DBConnection.getInstance();
        Set columnHeads = new HashSet();
        Statement stmt = connection.createStatement();
        String query = "SELECT * FROM " + tabela;
        ResultSet rs = stmt.executeQuery(query);
        // get column heads
        ResultSetMetaData rsmd = rs.getMetaData();
        for ( int i = 1; i <= rsmd.getColumnCount(); ++i )
            columnHeads.add( rsmd.getColumnName( i ) );
        rs.close();
        return columnHeads;
    }
    
    public static List getRowsData(String tabela) throws SQLException {
        Connection connection = DBConnection.getInstance();
        List rowData = new ArrayList();
        ArrayList columnData=null;
        Statement stmt = connection.createStatement();
        String query = "SELECT * FROM " + tabela;
        ResultSet rs = stmt.executeQuery(query);
        ResultSetMetaData rsmd = rs.getMetaData();
        while(rs.next()){
            columnData = new ArrayList();
            for ( int i = 1; i <= rsmd.getColumnCount(); ++i ){
                switch( rsmd.getColumnType( i ) )  {
                    case Types.VARCHAR: columnData.add(rs.getString( i ) );
                    break;
                    case Types.SMALLINT: columnData.add(rs.getInt( i ));
                    break;
                    case Types.INTEGER: columnData.add(rs.getInt( i ));
                    break;
                    case Types.BIGINT: columnData.add(rs.getInt( i ));
                    break;
                    case Types.DOUBLE:  columnData.add(rs.getDouble( i ));
                    break;
                    case Types.BOOLEAN: columnData.add(rs.getBoolean( i ));
                    break;
                    default:            columnData.add(rs.getString( i ) );
                }
            }
            rowData.add(columnData);
        }
        rs.close();
        return rowData;
    }
    
    /*public static List getRowsDataByParam(String param, String key, String tabela) throws SQLException {
        Connection connection = DBConnection.getInstance();
        List rowData = new Arraylist();
        List columnData = null;
        Statement stmt = connection.createStatement();
        String query = "SELECT * FROM " + tabela + " WHERE " + param + " LIKE '%" + key + "%'" ;
        ResultSet rs = stmt.executeQuery(query);
        ResultSetMetaData rsmd = rs.getMetaData();
        while(rs.next()){
            columnData = new ArrayList();
            for ( int i = 1; i <= rsmd.getColumnCount(); ++i ){
                switch( rsmd.getColumnType( i ) )  {
                    case Types.VARCHAR: columnData.addElement( rs.getString( i ) );
                    break;
                    case Types.SMALLINT: columnData.addElement( new Integer(rs.getInt( i )));
                    break;
                    case Types.INTEGER: columnData.addElement( new Integer( rs.getInt( i ) ) );
                    break;
                    case Types.BIGINT: columnData.addElement( new Integer(rs.getInt( i )));
                    break;
                    case Types.DOUBLE:  columnData.addElement( new Double( rs.getDouble( i ) ) );
                    break;
                    case Types.BOOLEAN: columnData.addElement( new Boolean( rs.getBoolean( i ) ) );
                    break;
                    default:            columnData.addElement( rs.getString( i ) );
                }
            }
            rowData.add(columnData);
        }
        rs.close();
        return rowData;
    }*/
}