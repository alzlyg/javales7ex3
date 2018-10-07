package ru.zlygostev.handler;

import ru.zlygostev.event.SyncEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class SyncHandler {
    public void handler(@Observes SyncEvent event) {
        System.out.println("SyncHandler: " + Thread.currentThread().getId());
    }


}
