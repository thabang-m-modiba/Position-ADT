/**
 * @author Thabang Mamoloko
 */

/**
 * Hanling an Exception for when the user enters an invalid status
 */
public class IllegalStatusException extends Exception{
	private static final long serialVersionUID = 1L;
	/**
	 * Exception Handling
	 * @param message
	 */
	public IllegalStatusException(String message) {
		super(message);
	}

}
