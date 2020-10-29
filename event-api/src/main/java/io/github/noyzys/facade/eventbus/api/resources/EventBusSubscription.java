package io.github.noyzys.facade.eventbus.api.resources;

import com.sun.istack.internal.NotNull;
import io.github.noyzys.facade.eventbus.api.EventBusBootstrapApi;

/**
 * @author: NoyZys on 20:15, 29.10.2020
 **/
public interface EventBusSubscription<T extends EventBusBootstrapApi> extends AutoCloseable {

    @NotNull
    Class<T> getEventClass();

    void close() throws Exception;
}
