package org.kucro3.kraitsorm.mapper;

import org.kucro3.kraitsorm.addition.Attribute;
import org.kucro3.kraitsorm.data.Datum;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface MappedColumn {
    public Mapping getOwner();

    public Class<?> getType();

    public default boolean isCapable(Datum datum)
    {
        return datum.getType().equals(getType());
    }

    public String getName();

    public Map<Attribute, List<String>> getAdditions();

    public boolean hasGetter();

    public boolean hasSetter();

    public default Optional<Class<?>> getAdapterType()
    {
        Optional<MappedAdapter<?>> optional = getAdapter();
        if(optional.isPresent())
            return Optional.of(optional.get().getAdapterType());
        return Optional.empty();
    }

    public Optional<MappedAdapter<?>> getAdapter();
}
