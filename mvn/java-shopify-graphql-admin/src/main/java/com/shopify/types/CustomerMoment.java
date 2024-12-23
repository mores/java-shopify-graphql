package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;

/**
 * Represents a session preceding an order, often used for building a timeline of events leading to an order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes(@JsonSubTypes.Type(value = CustomerVisit.class, name = "CustomerVisit"))
public interface CustomerMoment {
  /**
   * The date and time when the customer's session occurred.
   */
  OffsetDateTime getOccurredAt();
}
