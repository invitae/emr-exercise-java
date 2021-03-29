import com.invitae.emr.services.Scheduling;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchedulingTest {
    @Test
    public void testScheduleAppointments() {
        final var visits = Scheduling.schedule(new ArrayList<>());
        assertEquals(0, visits.size());
    }
}
