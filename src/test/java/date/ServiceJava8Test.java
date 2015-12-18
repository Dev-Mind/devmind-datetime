package date;

import com.devmind.date.ServiceJava8;
import org.assertj.core.api.Assertions;
import org.joda.time.DateTimeUtils;
import org.junit.After;
import org.junit.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

/**
 * @author Dev-Mind <guillaume@dev-mind.fr>
 * @since 17/12/15.
 */
public class ServiceJava8Test {

    private ServiceJava8 service = new ServiceJava8();

    @After
    public void tearDown(){
        service.setClock(Clock.systemUTC());
    }

    @Test
    public void should_test_a_date_before_event() {
        service.setClock(Clock.fixed(Instant.parse("2016-04-18T00:00:00.00Z"), ZoneId.systemDefault()));
        Assertions.assertThat(service.getCountDownBeforeEvent2()).isEqualTo("3 days before our event");
    }

    @Test
    public void should_test_a_date_after_event() {
        service.setClock(Clock.fixed(Instant.parse("2016-04-30T00:00:00.00Z"), ZoneId.systemDefault()));
        Assertions.assertThat(service.getCountDownBeforeEvent2()).isEqualTo("Event closed since 8 days");
    }

}