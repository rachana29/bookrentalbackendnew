package com.alacriti.bookRental.constants;


public class ErrorConstants {

	public static final Error NO_RECORD_FOUND_WITH_GIVEN_REQUEST_PARAMETERS = new Error();

	public static final Error PROCESS_ERROR = new Error();

	public static final Error CLIENT_ID_ERROR = new Error();

	
	public static final Error CONFIRMATION_ID_ERROR = new Error("error_field");
	public static final Error FROM_DATE_ERROR = new Error("error_field");
	public static final Error TO_DATE_ERROR = new Error("error_field");
	public static final Error PAYMENT_STATUS_ERROR = new Error();

	public static final Error USER_AGENT_ERROR = new Error();
	public static final Error IP_ADDRESS_ERROR = new Error();

	public static final String ERR_GENERIC_DAO = "11005";
	public static final String ERR_GENERIC = "11020";
}
