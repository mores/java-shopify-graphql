package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Discount applications capture the intentions of a discount source at
 * the time of application.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AutomaticDiscountApplication.class, name = "AutomaticDiscountApplication"),
    @JsonSubTypes.Type(value = DiscountCodeApplication.class, name = "DiscountCodeApplication"),
    @JsonSubTypes.Type(value = ManualDiscountApplication.class, name = "ManualDiscountApplication"),
    @JsonSubTypes.Type(value = ScriptDiscountApplication.class, name = "ScriptDiscountApplication")
})
public interface DiscountApplication {
  /**
   * The method by which the discount's value is allocated to its entitled items.
   */
  DiscountApplicationAllocationMethod getAllocationMethod();

  /**
   * Which lines of targetType that the discount is allocated over.
   */
  DiscountApplicationTargetSelection getTargetSelection();

  /**
   * The type of line that the discount is applicable towards.
   */
  DiscountApplicationTargetType getTargetType();

  /**
   * The value of the discount application.
   */
  PricingValue getValue();
}
