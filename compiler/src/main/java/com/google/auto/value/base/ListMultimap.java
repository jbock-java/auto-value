package com.google.auto.value.base;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ListMultimap<K, V> {

  private final Map<K, List<V>> map = new LinkedHashMap<>();

  public void put(K key, V value) {
    map.merge(key, List.of(value), Util::mutableConcat);
  }

  public Map<K, List<V>> asMap() {
    return map;
  }

  public List<V> get(K key) {
    return map.getOrDefault(key, List.of());
  }
}
