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

	public void appendNode(INode newNode) {
		if (head == null) {
			this.head = newNode;
		}
		if (tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode pop() {
		INode temp = this.head;
		this.head = head.getNext();
		return temp;
	}

	public INode popLast() {
		INode temp = head;
		while (!temp.getNext().equals(tail)) {
			temp = temp.getNext();
		}
		this.tail = temp;
		temp = temp.getNext();
		return temp;
	}

	public void searchNode(INode search) {
		INode temp = head;
		while (temp != null && temp.getNext() != null) {
			if (temp.getKey() == search.getKey()) {
				System.out.println("Found the node");
				return;
			}
			temp = temp.getNext();
		}
		System.out.println("Not Found");
	}

	public void insertNode(INode myNode, INode newNode) {
		INode tempNode = head;
		while (!tempNode.getNext().equals(myNode)) {
			tempNode = tempNode.getNext();
		}
		tempNode = tempNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public void printNodes() {
		System.out.print("My Nodes ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			System.out.print(tempNode.getKey());
			if (!tempNode.equals(tail)) {
				System.out.print("->");
			}
			tempNode = tempNode.getNext();
		}
		System.out.print(tempNode.getKey());
		System.out.println();
	}
}
