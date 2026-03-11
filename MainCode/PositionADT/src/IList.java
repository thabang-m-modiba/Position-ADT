/**
 * @author Thabang Mamoloko
 */

/**
 * Interface contains methods for the functionality of the Doubly Linked List
 */
public interface IList<E> {
	/**
	 * Add element in the first position of the list
	 * @param element
	 * @return new position
	 */
	Position<E> addFirst(E element);
	
	
	
	/**
	 * Add element in the last position of the list
	 * @param element
	 * @return new position
	 */
	Position<E> addLast(E element);
	
	
	
	/**
	 * Add element after the specified position
	 * @param element
	 * @param p
	 * @return new position
	 */
	Position<E> addAfter(E element, Position<E> p);
	
	
	
	/**
	 * Add element before the specified position
	 * @param element
	 * @param p
	 * @return new position
	 */
	Position<E> addBefore(E element, Position<E> p);
	
	
	
	/**
	 * Remove the specified position
	 * @param p
	 * @return removed element
	 */
	E remove(Position<E> p);
	
	
	//Auxiliary methods
	/**
	 * Get the size of the list
	 * @return size
	 */
	int size();
	
	
	
	/**
	 * Check if the list is empty
	 * @return true == empty || false == not empty
	 */
	boolean isEmpty();
	
	
	
	/**
	 * Print the list
	 */
	void printList();

}
