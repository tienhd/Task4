package com.qsoft.question3;

/**
 * Created with IntelliJ IDEA.
 * User: sqv-nbt
 * Date: 5/23/13
 * Time: 10:24 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Faxphone {
    /**
     * Send the named file as a fax to the * given phone number.
     */
    public boolean sendFax(String phone, String filename)
            throws MissingOrBadFileException, PhoneFormatException,
            PhoneAreaCodeException;
}
