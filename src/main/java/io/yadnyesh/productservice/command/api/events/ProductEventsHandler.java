package io.yadnyesh.productservice.command.api.events;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
public class ProductEventsHandler {

    @EventHandler
    public void on(ProductCreatedEvent productCreatedEvent) {

    }
}
