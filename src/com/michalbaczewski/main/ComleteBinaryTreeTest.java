package com.michalbaczewski.main;

public class ComleteBinaryTreeTest {

    public static void main(String[] args) {
        CompleteBinaryTree<Integer> tree = new CompleteBinaryTree<Integer>(10);
        tree.add(9);
        tree.add(53);
        tree.add(23);
        tree.add(66);
        tree.add(3);
        tree.add(87);
        tree.add(24);
        System.out.println(tree.toString());
        System.out.println(tree.getLeftChildIndex(2));
        System.out.println(tree.getParent(tree.getLeftChildIndex(2)));

    }

}
