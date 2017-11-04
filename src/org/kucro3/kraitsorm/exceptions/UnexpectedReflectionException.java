package org.kucro3.kraitsorm.exceptions;

public class UnexpectedReflectionException extends RuntimeException {
    public UnexpectedReflectionException(Exception e)
    {
        super(e);
    }
}
