package com.alacriti.bookRental.resources;

	import javax.naming.InitialContext;
	import javax.naming.NamingException;
	import javax.sql.DataSource;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	public class DBConnection {
	    private static DataSource dbSource = null;
	    private boolean useWildflyConnection;

	    public void DBconnection(boolean useWildflyConnection){
	        this.useWildflyConnection = useWildflyConnection;
	        if(useWildflyConnection) initialize();
	    }

	    protected void initialize() {
	        try {
	            if (dbSource == null) {
	                System.out.println("DataSource  looking up URL " + "java:jboss/datasources/CommonMySqlDB");
	                InitialContext aInitialContext = new InitialContext();
	                dbSource = (DataSource) aInitialContext.lookup("java:jboss/datasources/CommonMySqlDB");

	                System.out.println("DataSource dbSource was null and was successfully setup by looking up URL "
	                        + "java:jboss/datasources/CommonMySqlDB");
	            }
	        } catch (NamingException e) {
	            System.out.println("NamingException in initialize " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Exception in initialize " + e.getMessage());
	        }
	    }

	    public Connection getConnection() {
	        if (this.useWildflyConnection){
	            try {
	                Connection dbCon = dbSource.getConnection();
	                dbCon.setAutoCommit(false);
	                return dbCon;
	            } catch (Exception e) {
	                System.out.println("Exception in getConnection " + e.getMessage());
	            }
	            return null;
	        }
	        else {
	            String dbUrl = "jdbc:mysql://192.168.35.160:3306/trainee17";
	            Connection myCon = null;
	            try {
	                myCon = DriverManager.getConnection(dbUrl,"trainee17","trainee@alac");
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            return myCon;
	        }
	    }
	}

