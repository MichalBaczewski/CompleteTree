package com.michalbaczewski.main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CompleteBinaryTree<T> {

    private T[] tree;
    private int lastIndex;

    public CompleteBinaryTree(int size) {
        this.tree = (T[]) new Object[size];
        this.lastIndex = lastIndex;
    }

    void add(T value) {
        tree[lastIndex++] = value;
    }

    int getLeftChildIndex(int index) {
        if (isLeftChild(index)) {
            return 2 * index + 1;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    int getRightChildIndex(int index) {
        if (isRightChild(index)) {
            return 2 * index + 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isLeftChild(int index) {
        return (2 * index + 2) < lastIndex;
    }

    private boolean isRightChild(int index) {
        return (2 * index + 2) < lastIndex;
    }


    int getParent(int index) {
        if (index != 0) {
            return (index - 1) / 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    T getLeftChild(int index) {
        return tree[getLeftChildIndex(index)];
    }

    T getRightChild(int index) {
        return tree[getRightChildIndex(index)];
    }

    boolean isLeaf(int index) {
        return !isLeftChild(index);
    }

    @Override
    public String toString() {
        return Arrays.toString(tree);
    }
}
