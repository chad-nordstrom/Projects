/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dougstack;

/**
 *
 * @author Chad
 */
public class StackOverflowException extends RuntimeException
{
    public StackOverflowException()
    {
        super();
    }
    public StackOverflowException(String message)
    {
        super(message);
    }
}

