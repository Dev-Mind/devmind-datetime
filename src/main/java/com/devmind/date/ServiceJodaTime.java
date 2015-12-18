package com.devmind.date;


import org.joda.time.Duration;
import org.joda.time.Instant;

/**
 * @author Dev-Mind <guillaume@dev-mind.fr>
 * @since 16/12/15.
 */
public class ServiceJodaTime {

    private Instant eventDate = Instant.parse("2016-04-21T08:30:00.00Z");

    public String getCountDownBeforeEvent() {
        if (Instant.now().compareTo(eventDate) < 0) {
            return String.format("%s days before our event",
                    new Duration(Instant.now().getMillis(), eventDate.getMillis()).toStandardDays().getDays());
        }
        return String.format("Event closed since %s days",
                new Duration(eventDate.getMillis(), Instant.now().getMillis()).toStandardDays().getDays());
    }
}
