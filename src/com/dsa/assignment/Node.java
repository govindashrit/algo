package com.dsa.assignment;

/**
 * For tree with node, left and right node
 * 
 * @author gov
 *
 */
public class Node {

	int data;
	Node left;
	Node right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}