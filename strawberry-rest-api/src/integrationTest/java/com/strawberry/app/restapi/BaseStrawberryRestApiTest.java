package com.strawberry.app.restapi;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.FieldDefinitionBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import java.math.BigDecimal;
import java.util.UUID;
import java.util.function.Supplier;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public abstract class BaseStrawberryRestApiTest {

  protected static final EnhancedRandom RANDOM = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
      .exclude(FieldDefinitionBuilder.field().named("initShim").get())
      .randomize(String.class, (Supplier<String>) () -> RandomStringUtils.randomAlphabetic(5))
      .randomize(Long.class, (Supplier<Long>) () -> RandomUtils.nextLong(1L, 1000L))
      .randomize(Integer.class, (Supplier<Integer>) () -> RandomUtils.nextInt(1, 1000))
      .randomize(BigDecimal.class, (Supplier<BigDecimal>) () -> BigDecimal.valueOf(RandomUtils.nextLong(1L, 1000L), 2))
      .randomize(FieldDefinitionBuilder.field().named("removed").ofType(Boolean.class).get(),
          (Supplier<Boolean>) () -> false)
      .randomize(FieldDefinitionBuilder.field().named("isActive").ofType(Boolean.class).get(),
          (Supplier<Boolean>) () -> true)
      .randomize(FieldDefinitionBuilder.field().named("value").ofType(String.class).get(),
          (Supplier<String>) () -> UUID.randomUUID().toString())
      .collectionSizeRange(1, RandomUtils.nextInt(1, 10))
      .build();
}
