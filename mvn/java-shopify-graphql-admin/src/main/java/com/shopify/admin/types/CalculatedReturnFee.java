package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A calculated return fee.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CalculatedRestockingFee.class, name = "CalculatedRestockingFee"),
    @JsonSubTypes.Type(value = CalculatedReturnShippingFee.class, name = "CalculatedReturnShippingFee")
})
public interface CalculatedReturnFee {
  /**
   * The calculated amount of the return fee, in shop and presentment currencies.
   */
  MoneyBag getAmountSet();

  /**
   * A globally-unique ID.
   */
  String getId();
}
