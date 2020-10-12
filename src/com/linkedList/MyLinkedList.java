package com.linkedList;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addNode(INode newNode) {
		if (tail == null) {
			this.tail = newNode;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);

		}
	}
}
