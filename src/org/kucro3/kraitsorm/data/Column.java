package org.kucro3.kraitsorm.data;

public interface Column {
    public String name();

    public Class<?> getType();

    public boolean isCapable(Datum datum);

    public boolean push(Datum datum);

    public Datum fetch();

    public boolean fetch(Datum datum);
}
