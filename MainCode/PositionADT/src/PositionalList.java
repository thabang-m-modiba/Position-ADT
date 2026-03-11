/**
 * @author Thabang Mamoloko
 */

/**
 * 
 */
public class PositionalList<E> implements IList<E>{
	private Node<E> header = null;
	private Node<E> trailer = null;
	private int size = 0;
	
	@Override
	public Position<E> addFirst(E element) {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<>(element, null, header);
		if(isEmpty()) {
			trailer = newNode;
		}else {
			header.setPrev(newNode);
		}
		header = newNode;
		return newNode;
	}
	@Override
	public Position<E> addLast(E element) {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<>(element, trailer, null);
		if(isEmpty()) {
			header = newNode;
		}else {
			trailer.setNext(newNode);
		}
		trailer = newNode;
		return newNode;
	}
	@Override
	public Position<E> addAfter(E element, Position<E> p) {
		// TODO Auto-generated method stub
		if(p == null) {
			throw new IllegalArgumentException("Position cannot be null");
		}
		Node<E> node = (Node<E>) p;
		Node<E> newNode = new Node<>(element, node, node.getNext());
		
		if(node.getNext() != null) {
			node.getNext().setPrev(newNode);
		}else {
			trailer = header;
		}
		node.setNext(newNode);
		size++;
		return newNode;
	}
	@Override
	public Position<E> addBefore(E element, Position<E> p) {
		// TODO Auto-generated method stub
		if(p == null) {
			throw new IllegalArgumentException("Position cannot be null");
		}
		Node<E> node = (Node<E>) p;
		Node<E> newNode = new Node<>(element, node.getPrev(), node);
		if(node.getPrev() != null) {
			node.getPrev().setNext(newNode);
		}else {
			header = newNode;
		}
		node.setPrev(newNode);
		size++;
		return newNode;
	}
	@Override
	public E remove(Position<E> p) {
		// TODO Auto-generated method stub
		Node<E> node = (Node<E>) p;
		Node<E> prevNode = node.getPrev();
		Node<E> nextNode = node.getNext();
		
		if(prevNode != null) {
			prevNode.setNext(nextNode);
		}else {
			header = prevNode;
		}
		
		if(nextNode != null) {
			nextNode.setPrev(prevNode);
		}else {
			trailer = nextNode;
		}
		size--;
		return node.getElement();
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}
	@Override
	public void printList() {
		// TODO Auto-generated method stub
		Node<E> current = header;
		while(current != null) {
			System.out.print(current.getElement() + " <-> ");
			current = current.getNext();
		}
		System.out.println("null");
		
	}
	

}
