package com.qsoft.question4;

/**
 * Created with IntelliJ IDEA.
 * User: sqv-nbt
 * Date: 5/23/13
 * Time: 11:50 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Coordinate {
    public void moveTo(float x, float y);
    public void sewTo(float x, float y);
    public void setWorkpieceSize(float width,float height);
    public Size getWorkpieceSize();
    public Size getTableSize();
}
