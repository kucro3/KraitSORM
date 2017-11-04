package org.kucro3.kraitsorm.data;

import org.kucro3.kraitsorm.database.Savepoint;
import org.kucro3.kraitsorm.key.Key;
import org.kucro3.kraitsorm.mapper.MappedColumn;

import java.util.Collection;
import java.util.function.Consumer;

public interface View<T> {
    public T query(Key key);

    public T query(T object);

    public T queryPartly(T object, MappedColumn... columns);

    public Collection<T> queryAll(T... providedObjects);

    public boolean queryAll(Consumer<T> consumer, T... providedObjects);

    public boolean rollback();

    public boolean rollback(Savepoint savepoint);

    public Savepoint savepoint();

    public Savepoint savepoint(String name);

    public boolean commit();

    public boolean insert(T object);

    public boolean insertPartly(T object, MappedColumn... columns);

    public boolean update(T object);

    public boolean updatePartly(T object, MappedColumn... columns);

    public boolean delete(Key key);

    public boolean delete(T object);

    public boolean deleteAll();
}
