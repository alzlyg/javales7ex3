package ru.zlygostev.handler;


import ru.zlygostev.event.AsyncEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.ObservesAsync;

@ApplicationScoped
public class AsyncHandler {
    public void handler(@ObservesAsync AsyncEvent event) {
        System.out.println("AsyncHandler: " + Thread.currentThread().getId());
    }
}
