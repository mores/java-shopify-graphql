package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Captures the intent of a discount source at the time it was applied to a cart.
 * This includes the discount value, how it's allocated across entitled items, and
 * which line types it targets.
 *
 * The actual discounted amounts on specific cart lines are represented by [`CartDiscountAllocation`](https://shopify.dev/docs/api/storefront/current/interfaces/CartDiscountAllocation)
 * objects, which reference this application.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CartAutomaticDiscountApplication.class, name = "CartAutomaticDiscountApplication"),
    @JsonSubTypes.Type(value = CartCodeDiscountApplication.class, name = "CartCodeDiscountApplication"),
    @JsonSubTypes.Type(value = CartCustomDiscountApplication.class, name = "CartCustomDiscountApplication")
})
public interface BaseCartDiscountApplication {
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
   * The total amount allocated by this discount application across all entitled items.
   */
  MoneyV2 getTotalAllocatedAmount();

  /**
   * The value of the discount application.
   */
  PricingValue getValue();
}
