/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 *
 * @author reema
*/

public class Node<E> {
	public E item;
	public Node<E> next;
	public Node<E> prev;

        public Node() {
		item = null;
		next = null;
		prev = null;
	}

	public void setItem(E e) {
		item = e;
	}

	public void setNext(Node<E> n) {
		next = n;
	}

	public void setPrev(Node<E> n) {
		prev = n;
	}

	public E getItem() {
		return item;
	}

	public Node<E> getNext() {
		return next;
	}

	public Node<E> getPrev() {
		return prev;
	}
}

