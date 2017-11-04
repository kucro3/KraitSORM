package org.kucro3.kraitsorm.data.impl;

import org.kucro3.kraitsorm.data.Datum;

import java.math.BigDecimal;
import java.util.Optional;

public abstract class SimpleDatum implements Datum {
    public static class Int extends SimpleDatum
    {
        public Int(Integer value)
        {
            super(Integer.class, value);
        }

        @Override
        public boolean checkcast(Object obj)
        {
            return obj instanceof Integer;
        }
    }

    public static class TinyInt extends SimpleDatum
    {
        public TinyInt(Byte value)
        {
            super(Byte.class, value);
        }

        @Override
        public boolean checkcast(Object obj)
        {
            return obj instanceof Byte;
        }
    }

    public static class SmallInt extends SimpleDatum
    {
        public SmallInt(Short value)
        {
            super(Short.class, value);
        }

        @Override
        public boolean checkcast(Object obj)
        {
            return obj instanceof Short;
        }
    }

    public static class BigInt extends SimpleDatum
    {
        public BigInt(Long value)
        {
            super(Long.class, value);
        }

        @Override
        public boolean checkcast(Object obj)
        {
            return obj instanceof Long;
        }
    }

    public static class Bool extends SimpleDatum
    {
        public Bool(Boolean value)
        {
            super(Boolean.class, value);
        }

        @Override
        public boolean checkcast(Object obj)
        {
            return obj instanceof Boolean;
        }
    }

    public static class Decimal extends SimpleDatum
    {
        public Decimal(BigDecimal decimal)
        {
            super(BigDecimal.class, decimal);
        }

        @Override
        public boolean checkcast(Object obj)
        {
            return obj instanceof BigDecimal;
        }
    }

    public static class Char extends SimpleDatum
    {
        public Char(String value)
        {
            super(String.class, value);
        }

        @Override
        public boolean checkcast(Object obj)
        {
            return obj instanceof String;
        }
    }

    public static class Float extends SimpleDatum
    {
        public Float(java.lang.Float value)
        {
            super(java.lang.Float.class, value);
        }

        @Override
        public boolean checkcast(Object obj)
        {
            return obj instanceof java.lang.Float;
        }
    }

    public static class Double extends SimpleDatum
    {
        public Double(java.lang.Double value)
        {
            super(java.lang.Double.class, value);
        }

        @Override
        public boolean checkcast(Object obj)
        {
            return obj instanceof java.lang.Double;
        }
    }

    public static class Binary extends SimpleDatum
    {
        public Binary(byte[] value)
        {
            super(byte[].class, value);
        }

        @Override
        public boolean checkcast(Object obj)
        {
            return obj instanceof byte[];
        }
    }

    private SimpleDatum(Class<?> type)
    {
        this.type = type;
    }

    private <T> SimpleDatum(Class<T> type, T obj)
    {
        this(type);
        this.obj = obj;
    }

    @Override
    public <T> T get()
    {
        return (T) obj;
    }

    @Override
    public <T> Optional<T> getSafely(Class<T> type)
    {
        if(!this.type.equals(type))
            return Optional.empty();
        return Optional.ofNullable((T) obj);
    }

    @Override
    public Class<?> getType()
    {
        return type;
    }

    @Override
    public <T> boolean set(T value)
    {
        if(value == null)
            this.obj = null;
        if(checkcast(value))
            return false;
        this.obj = value;
        return true;
    }

    @Override
    public boolean isNull()
    {
        return obj == null;
    }

    public abstract boolean checkcast(Object obj);

    private final Class<?> type;

    private Object obj;
}
