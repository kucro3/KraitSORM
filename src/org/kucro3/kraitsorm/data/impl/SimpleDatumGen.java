package org.kucro3.kraitsorm.data.impl;

import org.kucro3.kraitsorm.data.Datum;
import org.kucro3.kraitsorm.data.DatumGen;
import org.kucro3.kraitsorm.data.impl.SimpleDatum.*;

import java.math.BigDecimal;
import java.util.Optional;

public class SimpleDatumGen implements DatumGen {
    private SimpleDatumGen()
    {
    }

    @Override
    public Datum of(long value)
    {
        return new BigInt(value);
    }

    @Override
    public Datum of(int value)
    {
        return new Int(value);
    }

    @Override
    public Datum of(byte[] value)
    {
        return new Binary(value);
    }

    @Override
    public Datum of(boolean value)
    {
        return new Bool(value);
    }

    @Override
    public Datum of(String value)
    {
        return new Char(value);
    }

    @Override
    public Datum of(BigDecimal value)
    {
        return new Decimal(value);
    }

    @Override
    public Datum of(double value)
    {
        return new SimpleDatum.Double(value);
    }

    @Override
    public Datum of(float value)
    {
        return new SimpleDatum.Float(value);
    }

    @Override
    public Datum of(short value)
    {
        return new SmallInt(value);
    }

    @Override
    public Datum of(byte value)
    {
        return new TinyInt(value);
    }

    @Override
    public <T> Optional<Datum> ofExtended(T value)
    {
        return Optional.empty();
    }

    public static final SimpleDatumGen INSTANCE = new SimpleDatumGen();
}
