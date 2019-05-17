package top.harryper.exception;

public class AntiChickenSoupException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public AntiChickenSoupException(String errMessage) {
		super(errMessage);
	}


	/**
	 * 
	 */
	public AntiChickenSoupException() {
		super();
	}


	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public AntiChickenSoupException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param message
	 * @param cause
	 */
	public AntiChickenSoupException(String message, Throwable cause) {
		super(message, cause);
	}


	/**
	 * @param cause
	 */
	public AntiChickenSoupException(Throwable cause) {
		super(cause);
	}
	
}
