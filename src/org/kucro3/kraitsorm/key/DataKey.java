package org.kucro3.kraitsorm.key;

import org.kucro3.kraitsorm.key.impl.SimpleDataKey;

public interface DataKey<T> {
    public Key getKey();

    public Class<T> getDataType();

    public static <T> DataKey<T> from(Key key, Class<T> dataType)
    {
        return new SimpleDataKey<>(key, dataType);
    }
}
