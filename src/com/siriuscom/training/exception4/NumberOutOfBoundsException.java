package com.siriuscom.training.exception4;

public class NumberOutOfBoundsException extends Exception
{
    // Parameterless Constructor
    public NumberOutOfBoundsException() {}

    // Constructor that accepts a message
    public NumberOutOfBoundsException(String message)
    {
       super(message);
    }
}
