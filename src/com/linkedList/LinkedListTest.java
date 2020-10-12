package com.linkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LinkedListTest {
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
}
