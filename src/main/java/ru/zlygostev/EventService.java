package ru.zlygostev;

import ru.zlygostev.event.AsyncEvent;
import ru.zlygostev.event.SyncEvent;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class EventService {
    @Inject
    private Event<AsyncEvent> asyncEvent;

    @Inject
    private Event<SyncEvent> syncEvent;

    public void run() {
        asyncEvent.fireAsync(new AsyncEvent());
        syncEvent.fire(new SyncEvent());
    }
}
