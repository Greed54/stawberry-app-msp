package com.strawberry.app.core.context.common.rocksdb;

import com.fasterxml.jackson.databind.ObjectMapper;

public interface StateStore {

  String name();

  void init(String stateDir, ObjectMapper objectMapper);

  void flush();

  void close();

  boolean persistent();

  boolean isOpen();
}
