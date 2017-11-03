package org.kucro3.kraitsorm.key.impl;

import org.kucro3.kraitsorm.key.DataKey;
import org.kucro3.kraitsorm.key.Key;

public class SimpleDataKey<T> implements DataKey<T> {
    public SimpleDataKey(Key key, Class<T> dataType)
    {
        this.key = key;
        this.type = dataType;
    }

    @Override
    public Key getKey()
    {
        return key;
    }

    @Override
    public Class<T> getDataType()
    {
        return type;
    }

    private final Key key;

    private final Class<T> type;
}
