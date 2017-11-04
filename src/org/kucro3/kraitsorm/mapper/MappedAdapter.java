package org.kucro3.kraitsorm.mapper;

import org.kucro3.kraitsorm.data.Datum;

import java.util.Optional;

public interface MappedAdapter<T> {
    public Class<?> getAdapterType();

    public Class<T> getType();

    public Optional<Datum> adapt(T value);

    public Optional<T> adapt(Datum datum);

    public default boolean isCapable(Datum datum)
    {
        return datum.getType().equals(getType());
    }
}
