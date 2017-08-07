package com.alacriti.bookRental.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.alacriti.bookRental.Delegate.UserDelegate;
import com.alacriti.bookRental.model.vo.Login;



/*@Path("/user")
public class UserResource {
		@GET
		@Path("/{param}")
    	@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Response getUser(@PathParam("param") Long userId) {
			UserDelegate delegate = new UserDelegate();
			List<Login> result =  delegate.getUserDetails(userId);
			//return Response.ok().entity(result).build();
			return Response.status(200).entity(result).build();
		}
		
		*/
@Path("/user")
public class UserResource {
		@GET
		@Path("/{param}")
    	@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Response getUser(@PathParam("param") Long userId) {
			UserDelegate delegate = new UserDelegate();
			List<Login> result =  delegate.getMessage(userId);
			//return Response.ok().entity(result).build();
			return Response.status(200).entity(result).build();
		}
		
		@POST
		@Path("/addUserRole")
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Response addUserRole(Login userAddVO) {
			System.out.print("hii+++++++++++++++++++++++++++");
		UserDelegate userDelegate= new UserDelegate();
		System.out.println(userDelegate.createUserRole(userAddVO));
		return Response.status(200).entity(userDelegate.createUserRole(userAddVO)).build();
		}
		
		
		@POST
		@Path("/addUser")
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Response addUser(Login userAddVO) {
		UserDelegate userDelegate= new UserDelegate();
		userDelegate.createUser(userAddVO);
		return Response.status(200).entity(userAddVO).build();
		}
}
			//System.out.println("Hi..........................");
			/*DataSource dataSource = null;
			Connection connection = null;
			PreparedStatement statement = null;
			ResultSet result = null;
			String dbName;
			ArrayList<Login> list = null;
			try {
				dataSource = (DataSource) new InitialContext()
						.lookup("java:jboss/datasources/TRAINEEE");
				connection = dataSource.getConnection();
				statement = connection
						.prepareStatement("select * from rachanas_bookRental_UserDetails");
				result = statement.executeQuery();
				list = new ArrayList<Login>();
				//System.out.println("aaaaaaaaaaaaaaaaaaaa!!!!");
				while (result.next()) {
					//System.out.println("sdsadsssa!!!!!!!!!!!!!!!!!!");
					Login login = new Login();
					login.setUser_id(result.getInt(1));
					login.setUser_name(result.getString(2));
					login.setPassword(result.getString(3));
					login.setUser_type(result.getString(4));
					login.setEmail_id(result.getString(5));
					login.setMobile_no(result.getString(6));
					list.add(login);

				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return Response.status(200).entity(list).build();

		}
	
	
	
	*/
	/* @POST
	@Path("/param")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUser(Login userAddVO)
	{
		UserDelegate delegate = new UserDelegate();
		 delegate.getUserDetails(userAddVO);
		return Response.status(200).entity(userAddVO).build();
	}
}
	
	/*
	public void addDataToUserDetail(  Login l[]){

		DataSource dataSource = null;
		Connection connection = null;
		PreparedStatement preparedStatement=null;
		try {

		dataSource = (DataSource) new InitialContext()
		.lookup("java:jboss/datasources/TRAINEEE");

		connection = dataSource.getConnection();

		preparedStatement=connection.prepareStatement("insert into rachanas_bookRental_UserDetails values(?,?,?,?,?,?);");

		for(int i=0;i<(l.length);i++){
		preparedStatement.setInt(1, l[i].user_id);
		preparedStatement.setString(2, l[i].user_name);
		preparedStatement.setString(3, l[i].password);
		preparedStatement.setString(4, l[i].user_type);
		preparedStatement.setString(5, l[i].email_id);
		preparedStatement.setString(6, l[i].mobile_no);
		preparedStatement.executeUpdate();
		}

		} catch (Exception e) {

		System.out.println("Error  :" + e.getMessage());


		} finally {

		if (connection != null) {
		try {
		connection.close();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
		}
	}
	}
}
	
*/