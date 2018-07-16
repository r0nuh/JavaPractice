/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 * @author Szilard
 */
public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int size();
    public boolean member(D element);
    public NonEmptyBST<D> add(D element);
}
