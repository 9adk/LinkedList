package com.linkedList;

public class MyNode<K> {
	private K key;
	private MyNode next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	public MyNode getNext() {
		return next;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}
}
