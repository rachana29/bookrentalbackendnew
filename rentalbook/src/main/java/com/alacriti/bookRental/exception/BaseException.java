package com.alacriti.bookRental.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.alacriti.bookRental.constants.Constants;
import com.alacriti.bookRental.constants.ErrorConstants;
import com.alacriti.bookRental.util.LogUtil;
import com.alacriti.bookRental.util.StringUtil;

public class BaseException extends Exception {
	protected Throwable m_innerException;
	protected String m_message = Constants.EMPTY_STRING;
	protected String m_errorCode = ErrorConstants.ERR_GENERIC;

	// TODO: USAGE: To Override in the child exceptions

	protected BaseException() {
	}

	public BaseException(String msg, Throwable th, String errorCode) {
		super(StringUtil.noNullTrim(msg), th);
		setErrorCode(errorCode);
	}

	/*
	 * public ServerError getError() { return ErrorUtil.getError(this); }
	 */

	public String getErrorCode() {
		return m_errorCode;
	}

	@Override
	public String getMessage() {
		return m_message;
	}

	public Throwable getThrowable() {
		return getCause();
	}

	protected void setErrorCode(String errorCode) {
		m_errorCode = StringUtil.noNullTrim(errorCode);
	}

	public String returnStackTrace() {
		final Writer result = new StringWriter();
		final PrintWriter printWriter = new PrintWriter(result);
		this.printStackTrace(printWriter);
		return result.toString();
	}
}
