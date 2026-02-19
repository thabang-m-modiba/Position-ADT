/**
 * @author Thabang Mamoloko
 */

/**
 * This class node contains data and reference to the next node
 */
public class Node<E> implements Position<E>{
	
	private E element;
	private Node<E> next;

	/**
	 * @param element - data
	 * @param next - reference to the next node
	 */
	public Node(E element, Node<E> next) {
		this.element = element;
		this.next = next;
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

	@Override
	public E getElement() {
		// TODO Auto-generated method stub
		return element;
	}

}
