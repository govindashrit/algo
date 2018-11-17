package com.dsa.assignment;

/**
 * Binary tree
 * 
 * @author gov
 *
 */
public class BinaryTree {
	Node root;

	void mirror() {
		root = mirror(root);
	}

	/**
	 * Make Mirror
	 * 
	 * @param node
	 *            node
	 * @return mirrored node
	 */
	Node mirror(Node node) {
		if (node == null) {
			return node;
		}

		// Mirror left and right
		Node left = mirror(node.left);
		Node right = mirror(node.right);

		// swap the left and right
		node.left = right;
		node.right = left;

		return node;
	}

	/**
	 * in order function using root node
	 */
	void inOrder() {
		inOrder(root);
	}

	void postOrder() {
		// TODO
	}

	// In order left, root, right
	void inOrder(Node node) {
		if (node == null)
			return;

		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
}