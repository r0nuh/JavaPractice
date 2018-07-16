/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarysearchtree;

/**
 * @author Szilard
 */
class NonEmptyBST<D extends Comparable> implements Tree<D>{
    D data;
    Tree left;
    Tree right;
    
    public NonEmptyBST(D element){
        data = element;
        left = new EmptyBST<>();
        right = new EmptyBST<>();
    }
    
    public NonEmptyBST(D element, Tree<D> leftTree, Tree<D> rightTree){
        data = element;
        left = leftTree;
        right = rightTree;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 1 + left.size() + right.size();
    }

    @Override
    public boolean member(D element) {
        if (data == element) {
            return true;
        }
        else {
            if (element.compareTo(data) < 0) {
                return left.member(element);
            }
            else {
               return right.member(element);
            }
        }
    }

    @Override
    public NonEmptyBST<D> add(D element) {
        if (data == element) {
            return this;
        }
        else {
            if (element.compareTo(data) < 0){
                return new NonEmptyBST<>(data, left.add(element), right);
            }
            else {
                return new NonEmptyBST<>(data, left, right.add(element));
            }
        }
    }
}
