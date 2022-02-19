package io.jbock.auto.value.base;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Table<R, C, V> {

    private final Map<Map.Entry<R, C>, V> map = new LinkedHashMap<>();

    public V get(R row, C column) {
        return map.get(new AbstractMap.SimpleImmutableEntry<>(row, column));
    }

    public void put(R row, C column, V value) {
        map.put(new AbstractMap.SimpleImmutableEntry<>(row, column), value);
    }
}
