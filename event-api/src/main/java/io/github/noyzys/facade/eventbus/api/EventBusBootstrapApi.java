package io.github.noyzys.facade.eventbus.api;

/*
  @author: NoyZys on 18:20, 29.10.2020
 */

import org.jetbrains.annotations.NotNull;

public interface EventBusBootstrapApi {

    void postPer(@NotNull final Class<?> clazz);
}
