package ru.zlygostev;

import javax.enterprise.inject.se.SeContainerInitializer;
import javax.enterprise.inject.spi.CDI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("ThreadId: " + Thread.currentThread().getId());
        SeContainerInitializer.newInstance().addPackages(App.class).initialize();

        final EventService eventService = CDI.current().select(EventService.class).get();
        eventService.run();
    }
}
