package date;

import com.devmind.date.ServiceJava8;
import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * @author Dev-Mind <guillaume@dev-mind.fr>
 * @since 17/12/15.
 */
public class ServiceJava8Test {

    private ServiceJava8 service = new ServiceJava8();

    @Test
    public void should(){
        Assertions.assertThat(service.getCountDownBeforeEvent()).isEqualTo("eze");
    }

//    public class DateTimeUtils {
//        private static final DateTimeUtils.SystemMillisProvider SYSTEM_MILLIS_PROVIDER = new DateTimeUtils.SystemMillisProvider();
//        private static volatile DateTimeUtils.MillisProvider cMillisProvider;
//
//        protected DateTimeUtils() {
//        }
//
//        public static final long currentTimeMillis() {
//            return cMillisProvider.getMillis();
//        }
//
//        public static final void setCurrentMillisSystem() throws SecurityException {
//            checkPermission();
//            cMillisProvider = SYSTEM_MILLIS_PROVIDER;
//        }
//
//        public static final void setCurrentMillisFixed(long var0) throws SecurityException {
//            checkPermission();
//            cMillisProvider = new DateTimeUtils.FixedMillisProvider(var0);
//        }

}