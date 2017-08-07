package com.alacriti.bookRental.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;

public class ExceptionUtil {


	public static String getStackTrace(Throwable aThrowable) {
		final Writer result = new StringWriter();
		final PrintWriter printWriter = new PrintWriter(result);
		
		aThrowable.printStackTrace(printWriter);
		return result.toString();
	}

}