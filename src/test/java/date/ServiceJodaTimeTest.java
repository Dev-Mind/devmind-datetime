package date;

import com.devmind.date.ServiceJava8;
import com.devmind.date.ServiceJodaTime;
import org.assertj.core.api.Assertions;
import org.joda.time.DateTimeUtils;
import org.joda.time.Instant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Dev-Mind <guillaume@dev-mind.fr>
 * @since 17/12/15.
 */
public class ServiceJodaTimeTest {
    
    private ServiceJodaTime service = new ServiceJodaTime();

    @After
    public void tearDown(){
        DateTimeUtils.setCurrentMillisSystem();
    }

    @Test
    public void should_test_a_date_before_event() {
        DateTimeUtils.setCurrentMillisFixed(Instant.parse("2016-04-18T00:00:00.00Z").getMillis());
        Assertions.assertThat(service.getCountDownBeforeEvent()).isEqualTo("3 days before our event");
    }

    @Test
    public void should_test_a_date_after_event() {
        DateTimeUtils.setCurrentMillisFixed(Instant.parse("2016-04-30T00:00:00.00Z").getMillis());
        Assertions.assertThat(service.getCountDownBeforeEvent()).isEqualTo("Event closed since 8 days");
    }
}