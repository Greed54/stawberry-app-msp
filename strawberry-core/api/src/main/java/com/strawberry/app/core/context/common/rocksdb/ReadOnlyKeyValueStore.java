package com.strawberry.app.core.context.common.rocksdb;

import java.util.Iterator;

public interface ReadOnlyKeyValueStore<K, V> {

  V get(K key);

  KeyValueIterator<K, V> range(K from, K to);

  KeyValueIterator<K, V> all();

  long approximateNumEntries();
}
