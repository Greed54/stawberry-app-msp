package com.strawberry.app.core.context.common.property.context.identity;

import com.strawberry.app.core.context.cqrscommon.Identity;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class BaseStringId implements Identity<String> {

  protected String value;

  public BaseStringId(String value) {
    this.value = value;
  }

  @Override
  public String value() {
    return value;
  }
}
