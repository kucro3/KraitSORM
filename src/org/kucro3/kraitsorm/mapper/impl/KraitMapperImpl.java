package org.kucro3.kraitsorm.mapper.impl;

import com.sun.istack.internal.Nullable;
import org.kucro3.kraitsorm.addition.Attribute;
import org.kucro3.kraitsorm.mapper.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class KraitMapperImpl implements Mapper {
    @Override
    public Mapping map(Class<?> type)
    {
        //TODO
        return null;
    }

    private class MappingImpl implements Mapping
    {
        MappingImpl(Class<?> type,
                    List<String> keys,
                    List<MappedColumn> columns,
                    MappedConstructor constructor)
        {
            this.type = type;
            this.keys = keys;
            this.columns = columns;
            this.constructor = constructor;
        }

        @Override
        public Class<?> getMappingType()
        {
            return type;
        }

        @Override
        public List<String> getKeys()
        {
            return Collections.unmodifiableList(keys);
        }

        @Override
        public int keyCount()
        {
            return keys.size();
        }

        @Override
        public List<MappedColumn> getColumns()
        {
            return Collections.unmodifiableList(columns);
        }

        @Override
        public int columnCount()
        {
            return columns.size();
        }

        @Override
        public MappedConstructor getConstructor()
        {
            return constructor;
        }

        private final MappedConstructor constructor;

        private final Class<?> type;

        private final List<String> keys;

        private final List<MappedColumn> columns;

        private class MappedColumnImpl implements MappedColumn
        {
            MappedColumnImpl(boolean hasGetter,
                             boolean hasSetter,
                             @Nullable MappedAdapter<?> adapter,
                             Class<?> type,
                             String name,
                             Map<Attribute, List<String>> additions)
            {
                this.hasSetter = hasSetter;
                this.hasGetter = hasGetter;
                this.adapter = adapter;
                this.type = type;
                this.name = name;
                this.additions = additions;
            }

            @Override
            public Mapping getOwner()
            {
                return MappingImpl.this;
            }

            @Override
            public Class<?> getType()
            {
                return type;
            }

            @Override
            public String getName()
            {
                return name;
            }

            @Override
            public Map<Attribute, List<String>> getAdditions()
            {
                return additions;
            }

            @Override
            public boolean hasGetter()
            {
                return hasGetter;
            }

            @Override
            public boolean hasSetter()
            {
                return hasSetter;
            }

            @Override
            public Optional<MappedAdapter<?>> getAdapter()
            {
                return Optional.ofNullable(adapter);
            }

            private final boolean hasGetter;

            private final boolean hasSetter;

            private final MappedAdapter<?> adapter;

            private final Class<?> type;

            private final String name;

            private final Map<Attribute, List<String>> additions;
        }
    }
}
