package org.kucro3.kraitsorm.data;

import java.util.Optional;

public interface Datum {
    public boolean isNull();

    public <T> boolean set(T value);

    public <T> T get();

    public <T> Optional<T> getSafely(Class<T> type);

    public Class<?> getType();
}
