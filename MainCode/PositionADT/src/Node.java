/**
 * @author Thabang Mamoloko
 */

/**
 * Class implements IPosition method
 */
public class Node<E> implements Position<E>{
	
	private E element;
	private Node<E> next;
	private Node<E> prev;

	/**
	 * @param element - data
	 * @param next - reference to the next node
	 */
	public Node(E element,Node<E> prev, Node<E> next) {
		this.element = element;
		this.next = next;
	}
	
	/**
	 * @return the prev
	 */
	public Node<E> getPrev() {
		return prev;
	}

	/**
	 * @param prev the prev to set
	 */
	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}

	/**
	 * @return the next
	 */
	public Node<E> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}
	/**
	 * @param element
	 */
	public void setElement(E element) {
		this.element = element;
	}

	@Override
	public E getElement() {
		// TODO Auto-generated method stub
		return element;
	}

}
