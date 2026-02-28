/**
 * @author Thabang Mamoloko
 */

/**
 * This class handles Exception for when a user enters priority number that's out of range
 */
public class PriorityOutOfRange extends Exception{
	/**
	 * ?
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Exception Handling
	 * @param message
	 */
	public PriorityOutOfRange(String message) {
		super(message);
	}

}
