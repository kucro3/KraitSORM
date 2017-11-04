package org.kucro3.kraitsorm.mapper;

import java.util.List;

public interface Mapping {
    public Class<?> getMappingType();

    public List<String> getKeys();

    public int keyCount();

    public List<MappedColumn> getColumns();

    public int columnCount();
}
