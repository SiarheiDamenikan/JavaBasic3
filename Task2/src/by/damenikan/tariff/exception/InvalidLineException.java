package by.damenikan.tariff.exception;

public class InvalidLineException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public InvalidLineException (){		
	}
	
	public InvalidLineException(String message) {
		super(message);
	}
	
	public InvalidLineException(Throwable exception) {
		super(exception);
	}
	
	public InvalidLineException(String message, Throwable exception) {
		super(message, exception);
	}
}
