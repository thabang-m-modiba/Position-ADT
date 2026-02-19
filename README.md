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
* Instead of:
  * <code>add(int index, E element)</code>
* We use:
  * <code>addBefore(Position<E> p, E element)</code>
  * <code>addAfter(Position<E> p, E element)</code>
  * <code>remove(Position<E> p)</code>

# Mini Project: Student Task Manager Using Position ADT
* Create a Task Manager where tasks are stored in a positional List.
* Each task has:
  * Task ID
  * Task Name
  * Priority(1 - 5)
  * Status(Pending/ Completed)
* The system must use a position ADT and not an index-based operation.
* Required classes:
  * <code>Position<E></code> interface
  * <code>Node<E></code> class
  * <code>PositionalList<E></code> class
    * <code>size()</code> - returns number of elements
    * <code>isEmpty()</code> - returns true if empty
    * <code>first()</code> - returns first position
    * <code>last()</code> - returns last postion
    * <code>before(p)</code> - position before p
    * <code>after(p)</code> - position after p
    * <code>addFirst(e)</code> - insert at the beginning
    * <code>addLast(e)</code> - insert at the end
    * <code>addBefore(p, e)</code> - insert before position p
    * <code>addAfter(p, e)</code> - insert after position p
    * <code>remove(p)</code> - remove position p
  * <code>Task</code> class
    * Variables: <code>int taskID, String taskName, int priority, String status</code>
    * include <code>toString()</code> method
  * <code>TaskManager</code> class
  * Main
