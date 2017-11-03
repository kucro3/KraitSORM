package org.kucro3.kraitsorm.key.impl;

import org.kucro3.kraitsorm.key.Key;

import java.util.Arrays;
import java.util.Optional;

public class SimpleKey implements Key {
    public SimpleKey(Object[] elements)
    {
        this.elements = elements;
        this.quantity = elements.length;
        this.hashCode = Arrays.hashCode(elements);

        for(Object element : elements)
            if(element == null)
                throw new NullPointerException("Null key");
    }

    @Override
    public int getQuantity()
    {
        return quantity;
    }

    @Override
    public <T> T getElement(int index)
    {
        return (T) elements[index];
    }

    @Override
    public <T> Optional<T> getElementSafely(int index)
    {
        if(index > -1 && index < quantity)
            return (Optional<T>) Optional.of(elements[index]);
        return Optional.empty();
    }

    @Override
    public boolean equals(Object obj)
    {
        return Key.equals(this, obj);
    }

    @Override
    public int hashCode()
    {
        return hashCode;
    }

    private final int quantity;

    private final Object[] elements;

    private final int hashCode;
}
