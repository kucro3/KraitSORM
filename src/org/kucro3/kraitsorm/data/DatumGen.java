package org.kucro3.kraitsorm.data;

import org.kucro3.kraitsorm.data.impl.SimpleDatumGen;

import java.math.BigDecimal;
import java.util.Optional;

public interface DatumGen {
    public Datum of(long value);

    public Datum of(int value);

    public Datum of(byte[] value);

    public Datum of(boolean value);

    public Datum of(String value);

    public Datum of(BigDecimal value);

    public Datum of(double value);

    public Datum of(float value);

    public Datum of(short value);

    public Datum of(byte value);

    public <T> Optional<Datum> ofExtended(T value);

    public static DatumGen general()
    {
        return SimpleDatumGen.INSTANCE;
    }
}
