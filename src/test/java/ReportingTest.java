import com.invitae.emr.services.Reporting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReportingTest {
    @Test
    public void testLabReportToResult() {
        assertEquals(3, 1 + 2);

        final var result = Reporting.createResult(null);
        assertNull(result);
    }
}
