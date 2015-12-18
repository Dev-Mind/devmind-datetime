package com.devmind.date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Dev-Mind <guillaume@dev-mind.fr>
 * @since 16/12/15.
 */
public class ServiceJava8 {

    private Instant eventDate  = Instant.parse("2016-04-21T08:30:00.00Z");

    public String getCountDownBeforeEvent(){
        if(Instant.now().compareTo(eventDate)<0){
            return String.format("%s days before our event", Duration.between(Instant.now(), eventDate).toDays());
        }
        return String.format("Event closed since %s days", Duration.between(eventDate, Instant.now()).toDays());
    }
}
