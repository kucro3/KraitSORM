package org.kucro3.kraitsorm.data;

public interface Column {
    public String getName();

    public Class<?> getType();

    public default boolean isCapable(Datum datum)
    {
        return datum.getType().equals(getType());
    }

    public boolean push(Datum datum);

    public Datum fetch();

    public boolean fetch(Datum datum);

    public int ordinal();
}
