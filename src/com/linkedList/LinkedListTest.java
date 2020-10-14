package com.linkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LinkedListTest {

	/**
	 * Usecase1,Usecase2
	 */
	@Test
	public void given3Numbers_WhenAddedToLinkedList_ShouldBeAddedToTheTop() {
		MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);

		MyLinkedList list = new MyLinkedList();
		list.addNode(myFirstNode);
		list.addNode(mySecondNode);
		list.addNode(myThirdNode);
		System.out.println("Usecase 2");
		list.printNodes();
		boolean result = list.head.equals(myThirdNode) && list.head.getNext().equals(mySecondNode)
				&& list.tail.equals(myFirstNode);
		assertTrue(result);
	}

	/**
	 * Usecase3
	 */
	@Test
	public void given3Numbers_WhenAppendedToLinkedList_ShouldBeAddedToTheLast() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);

		MyLinkedList list = new MyLinkedList();
		list.appendNode(myFirstNode);
		list.appendNode(mySecondNode);
		list.appendNode(myThirdNode);
		System.out.println("Usecase 3");

		list.printNodes();
		boolean result = list.head.equals(myFirstNode) && list.head.getNext().equals(mySecondNode)
				&& list.tail.equals(myThirdNode);
		assertTrue(result);
	}

	/**
	 * Usecase4
	 */
	@Test
	public void given3Numbers_WhenInsertingSecondInBetween_ShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> myLastNode = new MyNode(70);

		MyLinkedList list = new MyLinkedList();
		list.appendNode(myFirstNode);
		list.appendNode(myLastNode);
		System.out.println("Usecase 4");

		list.printNodes();
		MyNode<Integer> newNode = new MyNode(30);
		list.insert(myFirstNode, newNode);
		list.printNodes();
		boolean result = list.head.equals(myFirstNode) && list.head.getNext().equals(newNode)
				&& list.tail.equals(myLastNode);
		assertTrue(result);
	}

	/**
	 * Usecase5
	 */
	@Test
	public void givenFirstElement_WhenDeleted_ShouldPassLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);

		MyLinkedList list = new MyLinkedList();
		list.appendNode(myFirstNode);
		list.appendNode(mySecondNode);
		list.appendNode(myThirdNode);
		System.out.println("Usecase 5");

		System.out.println("Before Deleting...");
		list.printNodes();
		INode temp = list.pop();
		System.out.println("Deleted element is " + temp.getKey());
		System.out.println("After Deleting...");
		list.printNodes();
		boolean result = list.head.equals(mySecondNode) && list.tail.equals(myThirdNode);
		assertTrue(result);
	}

	/**
	 * Usecase6
	 */
	@Test
	public void giveLastElement_WhenDeleted_ShouldPassLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);

		MyLinkedList list = new MyLinkedList();
		list.appendNode(myFirstNode);
		list.appendNode(mySecondNode);
		list.appendNode(myThirdNode);
		System.out.println("Usecase 6");

		System.out.println("Before Deleting...");
		list.printNodes();
		INode last = list.popLast();
		System.out.println("After deleting");
		list.printNodes();
		System.out.println("Deleted element is " + last.getKey());
		boolean result = list.head.equals(myFirstNode) && list.head.getNext().equals(mySecondNode);
		assertTrue(result);
	}

	/**
	 * Usecase7
	 */
	@Test
	public void givenNumber_WhenSearchedInLinkedList_ShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);

		MyLinkedList list = new MyLinkedList();
		list.appendNode(myFirstNode);
		list.appendNode(mySecondNode);
		list.appendNode(myThirdNode);
		System.out.println("Usecase 7");

		list.searchNode(mySecondNode);
		boolean result = list.head.equals(myFirstNode) && list.head.getNext().equals(mySecondNode)
				&& list.tail.equals(myThirdNode);
		assertTrue(result);
	}

	/**
	 * Usecase8
	 */
	@Test
	public void given3Numbers_WhenInsertingANumberAfterAspecificNode_ShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);

		MyLinkedList list = new MyLinkedList();
		list.addNode(myFirstNode);
		list.appendNode(mySecondNode);
		list.appendNode(myThirdNode);
		System.out.println("Usecase 8");
		list.printNodes();
		MyNode<Integer> newNode = new MyNode(40);
		list.insertNode(mySecondNode, newNode);

		boolean result = list.head.equals(myFirstNode) && list.head.getNext().equals(mySecondNode)
				&& list.head.getNext().getNext().equals(newNode) && list.tail.equals(myThirdNode);
		assertTrue(result);
	}

	/**
	 * Usecase9
	 */
	@Test
	public void given3Numbers_WhenDeletedASpecificNode_ShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(40);
		MyNode<Integer> myLastNode = new MyNode(70);

		MyLinkedList list = new MyLinkedList();
		list.appendNode(myFirstNode);
		list.appendNode(mySecondNode);
		list.appendNode(myThirdNode);
		list.appendNode(myLastNode);
		System.out.println("Usecase 9");

		list.printNodes();
		System.out.println(list.size());
		System.out.println("After deleting");
		list.deleteNode(myThirdNode);
		list.printNodes();
		System.out.println(list.size());
		boolean result = list.head.equals(myFirstNode) && list.head.getNext().equals(mySecondNode)
				&& list.tail.equals(myLastNode);
		assertTrue(result);
	}
}
