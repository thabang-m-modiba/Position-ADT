# Position-ADT
# Learning about Nodes and Linked Lists
* The Position ADT represents the location within a data structure rather than just an index. This is the location where a single object is stored.
* Instead of referring to elements by numbers (index), a Position ADT represents a specific place that stores an element.
* The position ADTs are commonly used in:
  * Linked Lists
  * Trees
  * Graphs
## Why do we need Position ADT?
* In an array we use index to located elements, but in a linked list or tree, there is no direct index so instead of using integers, we use a Position Object.
* The position does not expose:
  * The node Structure
  * The links
  * The internal implementation
* It ensures abstraction and encapsulation.
## Position in a List ADT
* Instead of"
  * <code>add(int index, E element)</code>
* We use:
  * <code>addBefore(Position<E> p, E element)</code>
  * <code>addAfter(Position<E> p, E element)</code>
  * <code>remove(Position<E> p)</code>
