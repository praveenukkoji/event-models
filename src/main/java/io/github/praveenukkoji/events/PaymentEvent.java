package io.github.praveenukkoji.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Represents a payment event within the system.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentEvent implements Serializable {
    private String paymentId;
    private String status;
    private String orderId;
    private String message;
}
