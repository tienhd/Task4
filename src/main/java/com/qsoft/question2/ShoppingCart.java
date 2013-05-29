package com.qsoft.question2;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: sqv-nbt
 * Date: 5/22/13
 * Time: 10:35 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ShoppingCart {
    /**
     * Add this many of this item to the * shopping cart.
     */
    public void addItems(Item anItem, int quantity) throws NegativeCountException;

    /**
     * Delete this many of this item from the * shopping cart
     */

    public void deleteItems(Item anItem, int quantity) throws NegativeCountException, NoSuchItemException;

    /**
     * Count of all item in cart
     * (that is, all items x qty each)
     */
    public int itemCount();

    /**
     * Return Iterator of all items * (see Java Collection’s doc)
     */
    public Iterator iterator();
}
