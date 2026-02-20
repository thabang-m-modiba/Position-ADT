/**
 * @author Thabang Mamoloko
 */

/**
 * 
 */
public class PositionalList<E> {
	private Node<E> head = null;
	private int size = 0;
	/**
	 * This method returns the size of the list
	 * @return size
	 */
	public int size() {
		return size;
	}
	/**
	 * This method returns true is the list is empty
	 * @return a boolean value
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	/**
	 * This method returns the first position in the list
	 * @return head
	 */
	public Position<E> first(){
		return head;
	}
	public Position<E>last(){
		return null;
	}public Position<E> before(Position<E> p){
		return null;
	}
	public Position<E> after(Position<E> p){
		return null;
	}
	/**
	 * Method to insert new node in the first position
	 * @param element - element to insert
	 * @return newNode
	 */
	public Position<E> addFirst(E element){
		Node<E> newNode = new Node<>(element, head);
		head = newNode;
		size++;
		return newNode;
	}
	/*
	public Position<E> addLast(E element){
		Node<E> newNode = new Node<>(element, head.getNext());
		head.getNext() = element;
		size++;
		return newNode;
	}
	*/
	/**
	 * This method adds a new element after an already existing element
	 * @param p - an already existing element
	 * @param element - element to be added
	 * @return - newNode
	 */
	public Position<E> addAfter(Position<E> p, E element){
		Node<E> node = (Node<E>) p;
		Node<E> newNode = new Node<>(element, node.getNext());
		node.setNext(newNode);
		size++;
		return newNode;
	}
	/**
	 * This method adds a new element in a position before an already existing position
	 * @param p - an already existing position
	 * @param element - an element to be added
	 * @return - new node
	 */
	public Position<E> addBefore(Position<E> p, E element){
		Node<E> node = (Node<E>) p;
		Node<E> newNode = new Node<>(element, node);
		
		// If inserting before head
		if(node == head) {
			head = newNode;
		}else {
			Node<E> current = head;
			//Find the node before p
			while(current != null && current.getNext() != node) {
				current = current.getNext();
			}
		}
		size++;
		return newNode;
	}
	/**
	 * This method removes a position from the list
	 * @param p - the position to be removed
	 * @return the element
	 */
	public E remove(Position<E> p) {
		Node<E> node = (Node<E>) p;
		if(node == head) {
			head = head.getNext();
		}else {
			Node<E> current = head;
			
			while(current.getNext() != node) {
				current = current.getNext();
			}
			current.setNext(node.getNext());
		}
		size--;
		return node.getElement();
	 }
	public void printList() {
		Node<E> current = head;
		
		while(current != null) {
			System.out.print(current.getElement() + " -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

}
