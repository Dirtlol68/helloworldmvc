package org.model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DAOHelloWorld {
	private static String INSTANCE;
	private static String LOGIN = "root";
	private static String PASSWORD = "16101997ab";
	private static String URL = "jdbc:mysql://localhost/java7?autoReconnect=true&useSSL=false";
	private static java.sql.Connection connection;
	private java.sql.Statement statement;
	
	private DAOHelloWorld(){
		this.connection = null;
		this.statement = null;
		
	}
	
	public static DAOHelloWorld getInstance(){
		if (connection == null){
			System.out.println("INSTANCIATION DE LA CONNEXION SQL !");
			return new DAOHelloWorld();
		}
		System.out.println("CONNEXION SQL EXISTANTE !");
		return null;
	}
	
	public static String getQuerySelectFirstHelloWorld(){
		return "SELECT * FROM  `Hello`;";
		
	}
	
	protected void close(){
		if(connection!=null) {
            try{
                connection.close();
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
	}
	
	protected ResultSet executeQuery(String query){
		try{
			return statement.executeQuery(query);
		} catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	
	protected boolean open(){
		try{
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(DAOHelloWorld.URL, DAOHelloWorld.LOGIN, DAOHelloWorld.PASSWORD);
            this.statement = this.connection.createStatement();
        }
        catch(final ClassNotFoundException e){
            System.out.println("Driver introuvable : ");
            e.printStackTrace();
            return false;
        }
        catch (final SQLException e){
            System.out.println("Erreur SQL :");
            e.printStackTrace();
            return false;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return true;
		
	}
	
}
