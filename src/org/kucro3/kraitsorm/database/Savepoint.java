package org.kucro3.kraitsorm.database;

import java.util.Optional;

public interface Savepoint {
    public Optional<Integer> getId();

    public Optional<String> getName();
}
