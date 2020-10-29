package io.github.noyzys.facade.eventbus.api.resources;

import io.github.noyzys.facade.eventbus.api.EventBusBootstrapApi;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.function.Consumer;

/**
 * @author: NoyZys on 20:17, 29.10.2020
 **/
public interface EventBus {

    @NotNull
    <T extends EventBusBootstrapApi> EventBusSubscription<T> subscribe(
            @NotNull final Class<T> eventClazz,
            @NotNull final Consumer<? super T> eventHandler);

    @NotNull
    <T extends EventBusBootstrapApi> Set<EventBusSubscription<T>> findByEventClass(@NotNull final Class<T> eventClazz);
}
