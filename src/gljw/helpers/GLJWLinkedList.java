/*
 * Copyright (c) 2024 Miracle-Masterpiсe <mrmiraclemasterpiece@gmail.com or https://t.me/MiracleMasterpiece>. All rights reserved.
 * Use is subject to license terms.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
package gljw.helpers;

import java.util.Iterator;

public class GLJWLinkedList<T> implements Iterable<T>{

	private Node<T> first;
	private Node<T> last;
	
	public void add(T t) {
		Node<T> node = new Node<T>(t);
		
		if (first == null) {
			last = first = node;
			return;
		}else {
			last.next = node;
			node.prev = last;
			last = node;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for (Node<T> n = first; n != null; n = n.next) {
			sb.append(n.value);
			if (n.next != null) sb.append(" ");
		}
		sb.append("]");
		return sb.toString();
	}
	
	public Node<T> first(){
		return first;
	}
	
	public void remove(T t) {
		for (Node<T> n = first; n != null; n = n.next) {
			if (n.value == t) {
				remove(n);
				break;
			}
		}
	}
	
	public void remove(Node<T> n) {
		if (n.prev == null) {
			first = first.next;
			if (first != null) {
				first.prev = null;
			}
			if (last == n)  last = null;
		}else {
			if (n == last) {
				last = last.prev;
			}
			Node<T> prev = n.prev;
			Node<T> next = n.next;
			prev.next = next;
			
			if (next != null) {
				next.prev = prev;	
			}
		}
	}
	
	public static class Node<E>{
		private Node<E> next;
		private Node<E> prev;
		private E value;
		
		private Node(E value) {
			this.value = value;
		}
		
		public Node<E> getNext(){
			return next;
		}
		
		public E getValue() {
			return value;
		}
	}
	
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			private Node<T> node = first;
			private Node<T> prev = null;
			
			@Override
			public boolean hasNext() {
				return node != null;
			}

			@Override
			public T next() {
				T value = node.value;
				prev = node;
				node = node.next;
				return value;
			}
			
			@Override
			public void remove() {
				GLJWLinkedList.this.remove(prev);
			}
		};
	}

	public void clear() {
		first = null;
		last = null;
	}
}
