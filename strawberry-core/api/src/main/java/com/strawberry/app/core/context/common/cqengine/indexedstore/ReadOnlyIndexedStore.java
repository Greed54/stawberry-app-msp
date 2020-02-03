package com.strawberry.app.core.context.common.cqengine.indexedstore;

import com.googlecode.cqengine.query.Query;
import com.googlecode.cqengine.query.option.QueryOptions;
import com.googlecode.cqengine.resultset.ResultSet;
import com.strawberry.app.core.context.common.rocksdb.ReadOnlyKeyValueStore;

public interface ReadOnlyIndexedStore<K, V> extends ReadOnlyKeyValueStore<K, V> {

  ResultSet<V> retrieve(Query<V> query);

  ResultSet<V> retrieve(Query<V> query, QueryOptions options);
}
