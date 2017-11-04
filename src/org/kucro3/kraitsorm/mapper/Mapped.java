package org.kucro3.kraitsorm.mapper;

public interface Mapped {
    public Mapping getMapped(Class<?> type);

    public boolean isMapped(Class<?> type);

    public boolean unmap(Class<?> type);
}
