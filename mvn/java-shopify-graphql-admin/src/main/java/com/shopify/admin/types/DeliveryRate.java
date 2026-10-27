package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;

/**
 * A shipping rate with a price and optional transit time.
 *
 * Rates define the price charged to buyers for a shipping option.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DeliveryFlatRate.class, name = "DeliveryFlatRate"),
    @JsonSubTypes.Type(value = DeliveryValueBasedRate.class, name = "DeliveryValueBasedRate"),
    @JsonSubTypes.Type(value = DeliveryWeightBasedRate.class, name = "DeliveryWeightBasedRate")
})
public interface DeliveryRate {
  /**
   * The price charged for this rate.
   */
  MoneyV2 getPrice();

  /**
   * The maximum transit time estimate in seconds.
   */
  Integer getTransitTimeMaxSeconds();

  /**
   * The minimum transit time estimate in seconds.
   */
  Integer getTransitTimeMinSeconds();
}
