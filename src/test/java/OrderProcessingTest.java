import com.invitae.emr.services.OrderProcessing;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderProcessingTest {
    @Test
    public void testOrderProcessing() {
        final var requisitions = OrderProcessing.processOrders(new ArrayList<>());
        assertEquals(0, requisitions.size());
    }
}
