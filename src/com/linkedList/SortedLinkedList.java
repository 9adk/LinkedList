package com.linkedList;

public class SortedLinkedList<K extends Comparable<K>> {
	public INode head;
	public INode tail;

	public SortedLinkedList() {
		this.head = null;
		this.tail = null;
	}
	/**Usecase10 for creating an sorted linked list
	 * @param node
	 */
	public void addNode(INode node) {
		if(head == null ) {
			head = node;
			node.setNext(null);
			return;
		}
		if(head != null && node.getKey().compareTo(head.getKey()) < 0) {
			INode tempNode = head;
			head = node;
			node.setNext(tempNode);
		}
		else {
			INode currentNode = head;
			INode prev = head;
			while(currentNode != null && currentNode.getKey().compareTo(node.getKey()) < 0) {
				prev = currentNode;
				currentNode = currentNode.getNext();
			}
			node.setNext(prev.getNext());
			prev.setNext(node);
		}
	}
	public void printNodes() {
		System.out.print("My Nodes ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			System.out.print(tempNode.getKey() + "->");
			tempNode = tempNode.getNext();
		}
		System.out.print(tempNode.getKey());
		System.out.println();
	}
	public static void main(String[] args) {
		SortedLinkedList list = new SortedLinkedList();
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		MyNode<Integer> myFourthNode = new MyNode(60);

		list.addNode(myFirstNode);
		list.printNodes();
		list.addNode(mySecondNode);
		list.printNodes();
		list.addNode(myThirdNode);
		list.printNodes();	
		list.addNode(myFourthNode);
		list.printNodes();	


	}
}
