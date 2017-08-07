package com.alacriti.bookRental.datasource;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.alacriti.bookRental.util.ExceptionUtil;


public final class MySqlDataSource {

	private static MySqlDataSource ms_this = null;
	private static DataSource dbSource = null;

	private MySqlDataSource() {
		init();
	}

	protected void init() {
		initialize();
	}

	public static MySqlDataSource getInstance() {
		synchronized (MySqlDataSource.class) {
			if (ms_this == null) {
				synchronized (MySqlDataSource.class) {
					ms_this = new MySqlDataSource();
				}
			}
		}

		return ms_this;
	}

	protected void initialize() {
		try {
			if (dbSource == null) {
				InitialContext aInitialContext = new InitialContext();
				dbSource = (DataSource) aInitialContext.lookup("java:jboss/datasources/TRAINEEE");

			}
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {	e.printStackTrace();
		}
	}

	public Connection getConnection() {
		try {
			Connection dbCon = dbSource.getConnection();
			dbCon.setAutoCommit(false);
			
			return dbCon;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
/*
	private static final Logger connLog = Logger.getLogger("CONNECTION_LEAK");
	private static final Map<String, String> openConnIdMap = new HashMap<String, String>();
	private static final boolean isConneLeakChkEnabled = true;// connLog.isInfoEnabled();
	private static final Object connLeakVarlock = new Object();

	static class Handler implements InvocationHandler {

		Connection conn;
		String id;

		public Handler(Connection conn) {
			this.conn = conn;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			try {
				if (method.getName().equalsIgnoreCase("close")) {
					synchronized (connLeakVarlock) {
						totalClosedConnCnt--;
						connOpenedNow--;
						openConnIdMap.remove(this.getId());
						String localStackTrace = ExceptionUtil
								.getStackTrace(new Exception("No Problem in this exception.")).replaceAll("\\n", "");
						if (localStackTrace.length() > 500) {
							localStackTrace = localStackTrace.substring(0, 499);
						}
						connLog.info("::Connection returned:" + totalOpenConnCnt + "::" + (-totalClosedConnCnt) + ">"
								+ connOpenedNow + ":\n" + localStackTrace);

					}
				}
				return method.invoke(conn, args);
			} catch (InvocationTargetException e) {

				e.printStackTrace();

				throw e.getTargetException();
			}
		}
	}

	private static int totalOpenConnCnt = 0;
	private static int totalClosedConnCnt = 0;
	private static int connOpenedNow = 0;

	public static void printConnectionLeakTrace() {

		if (openConnIdMap.size() > 0) {
			for (Map.Entry<String, String> entry : openConnIdMap.entrySet()) {
			}
		}

	}
	*/
}
