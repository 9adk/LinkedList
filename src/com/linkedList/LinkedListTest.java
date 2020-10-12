package com.linkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LinkedListTest {
	/**
	 * Usecase1,Usecase2
	 */
	@Test
	public void givenInputShouldBeAddedToTheTop() {
		MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		MyLinkedList list = new MyLinkedList();
		list.addNode(myFirstNode);
		list.addNode(mySecondNode);
		list.addNode(myThirdNode);
		boolean result = list.head.equals(myThirdNode) && list.head.getNext().equals(mySecondNode)
				&& list.tail.equals(myFirstNode);
		assertTrue(result);
	}
	/**
	 * Usecase3
	 */
	@Test
	public void givenInputToAppendShouldAddedToLast() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		MyLinkedList list = new MyLinkedList();
		list.appendNode(myFirstNode);
		list.appendNode(mySecondNode);
		list.appendNode(myThirdNode);
		list.printNodes();
		boolean result = list.head.equals(myFirstNode) &&
						 list.head.getNext().equals(mySecondNode) &&
						 list.tail.equals(myThirdNode);
		assertTrue(result);
	}
	@Test
	public void givenInputToInsertShouldAddedInBetween() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> myLastNode = new MyNode(70);
		myFirstNode.setNext(myLastNode);
		MyLinkedList list = new MyLinkedList();
		list.appendNode(myFirstNode);
		list.appendNode(myLastNode);
		list.printNodes();
		MyNode<Integer> newNode = new MyNode(30);
		list.insert(myFirstNode,newNode);
		list.printNodes();
		boolean result = list.head.equals(myFirstNode) &&
						 list.head.getNext().equals(newNode) &&
						 list.tail.equals(myLastNode);
		assertTrue(result);
	}
}
