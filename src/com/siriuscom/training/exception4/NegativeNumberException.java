package com.siriuscom.training.exception4;

public class NegativeNumberException extends Exception
{
    // Parameterless Constructor
    public NegativeNumberException() {}

    // Constructor that accepts a message
    public NegativeNumberException(String message)
    {
       super(message);
    }
}
