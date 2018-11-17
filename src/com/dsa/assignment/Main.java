package com.dsa.assignment;

public class Main {

	public static void main(String[] args) {
		// Create tree
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		// printing inorder input tree 
		System.out.println("inorder traversal of input tree:");
		tree.inOrder();
		System.out.println("");

		// Make mirror tree
		tree.mirror();

		// printing inorder mirrored tree 
		System.out.println("inorder traversal of mirrored tree: ");
		tree.inOrder();
	}
}
