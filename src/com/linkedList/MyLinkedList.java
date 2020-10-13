package com.linkedList;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * Usecase2
	 * 
	 * @param newNode
	 */
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

	/**
	 * Usecase3
	 * 
	 * @param newNode
	 */
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

	/**
	 * Usecase4
	 * 
	 * @param myNode
	 * @param newNode
	 */
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	/**
	 * Usecase5 modified for edge case
	 * 
	 * @return
	 */
	public INode pop() {
		if (size() == 1) {
			INode currentNode = this.head;
			this.head = null;
			return currentNode;
		}
		INode temp = this.head;
		this.head = head.getNext();
		return temp;
	}

	/**
	 * Usecase6
	 * 
	 * @return
	 */
	public INode popLast() {
		INode temp = head;
		while (!temp.getNext().equals(tail)) {
			temp = temp.getNext();
		}
		this.tail = temp;
		this.tail.setNext(null);
		return temp;
	}

	/**
	 * Usecase7
	 * 
	 * @param search
	 */
	public void searchNode(INode search) {
		INode temp = head;
		while (temp != null && temp.getNext() != null) {
			if (temp.getKey() == search.getKey()) {
				System.out.println("Found the node " + search.getKey());
				return;
			}
			temp = temp.getNext();
		}
		System.out.println("Not Found");
	}

	/**
	 * Usecase8
	 * 
	 * @param myNode
	 * @param newNode
	 */
	public void insertNode(INode myNode, INode newNode) {
		INode tempNode = head;
		while (!tempNode.getNext().equals(myNode)) {
			tempNode = tempNode.getNext();
		}
		tempNode = tempNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	/**
	 * Usecase9
	 * 
	 * @param node
	 */
	public void deleteNode(INode node) {
		INode temp = head;
		INode prev = null;
		while (!temp.getKey().equals(node.getKey())) {
			prev = temp;
			temp = temp.getNext();
		}
		prev.setNext(temp.getNext());
	}

	/**
	 * Method to find the size of list
	 * 
	 * @return
	 */
	public int size() {
		if (isEmpty()) {
			return 0;
		}
		INode temp = head;
		int count = 0;
		while (!temp.equals(tail)) {
			count++;
			temp = temp.getNext();
		}
		return count + 1;
	}

	/**
	 * Method to check if list is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Printing the nodes of list
	 */
	public void printNodes() {
		if (isEmpty()) {
			System.out.println("The list is empty");
			return;
		}
		System.out.print("My Nodes ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			System.out.print(tempNode.getKey() + "->");
			tempNode = tempNode.getNext();
		}
		System.out.print(tempNode.getKey());
		System.out.println();
	}
}
