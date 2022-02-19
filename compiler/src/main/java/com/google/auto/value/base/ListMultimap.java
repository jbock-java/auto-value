package com.google.auto.value.base;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ListMultimap<K, V> {

  private final Map<K, List<V>> map = new LinkedHashMap<>();

  public void put(K key, V value) {
    map.merge(key, List.of(value), Util::mutableConcat);
  }

  public void putAll(K key, Iterable<V> values) {
    for (V value : values) {
      put(key, value);
    }
  }

  public boolean isEmpty() {
    if (map.isEmpty()) {
      return true;
    }
    return map.entrySet().stream().allMatch(e -> e.getValue().isEmpty());
  }

  public boolean containsKey(K key) {
    return map.containsKey(key);
  }

  public List<V> values() {
    ArrayList<V> result = new ArrayList<>();
    map.forEach((k, values) -> result.addAll(values));
    return result;
  }

  public Map<K, List<V>> asMap() {
    return map;
  }

  public List<V> get(K key) {
    return map.getOrDefault(key, List.of());
  }
}
