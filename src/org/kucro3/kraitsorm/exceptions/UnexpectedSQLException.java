package org.kucro3.kraitsorm.exceptions;

import java.sql.SQLException;

public class UnexpectedSQLException extends RuntimeException {
    public UnexpectedSQLException(SQLException exception)
    {
        super(exception);
    }
}
