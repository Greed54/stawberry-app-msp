package com.strawberry.app.core.context.common.cqengine;

import com.googlecode.cqengine.query.Query;
import com.googlecode.cqengine.query.option.QueryOptions;
import com.googlecode.cqengine.resultset.ResultSet;
import com.strawberry.app.core.context.cqrscommon.Identity;
import com.strawberry.app.core.context.cqrscommon.projection.Projection;

public interface CQEngineRepository<K extends Identity<?>, P extends Projection<K>> {

  ResultSet<P> retrieve(Query<P> query);

  ResultSet<P> retrieve(Query<P> query, QueryOptions options);

  void addProjection(P projection);
}
